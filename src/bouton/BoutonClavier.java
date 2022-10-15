package bouton;

import java.awt.Color;

import visuel.Clavier;
import visuel.Hangman;

public class BoutonClavier extends javax.swing.JButton implements Bouton {

    /**
     * 
     */
    private static final long serialVersionUID = -8143926993296614699L;
    private char lettre;

    public BoutonClavier(String texte, visuel.Mot mot, Clavier clavier, Hangman hangman) {
        super(texte);
        this.lettre = texte.charAt(0);
        this.setBackground(Color.WHITE);
        this.addListener(mot, clavier, hangman);
    }

    public void changeColor(char color) {
        switch (color) {
            case 'r':
                this.setForeground(Color.RED);
                break;
            case 'g':
                this.setForeground(Color.GREEN);
                break;
            default:
                this.setForeground(Color.BLACK);
                break;
        }
    }

    public void changeColor() {
        this.setForeground(Color.BLACK);
    }

    public void changeColor(Color color) {
        this.setForeground(color);
    }

    public char getLettre() {
        return lettre;
    }

    public void setLettre(char lettre) {
        this.lettre = lettre;
        this.setText(String.valueOf(lettre));
    }

    // andle the event when the button is clicked and send the letter to the game
    public void addListener(visuel.Mot mot, Clavier clavier, Hangman hangman) {
        this.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hangman.isError(clavier.setLastpresed(lettre, mot.theLetterIsIn(lettre)));

            }
        });
    }

    public void removeListener() {
        for (java.awt.event.ActionListener al : this.getActionListeners()) {
            this.removeActionListener(al);
        }
    }

    public void disableListener() {
        this.setEnabled(false);
    }

    public void enableListener() {
        this.setEnabled(true);
    }

    public void reset() {
        this.changeColor();
        this.enableListener();
    }
}
