package bouton;

import java.awt.Color;

import visuel.Clavier;
import visuel.Hangman;

public class BoutonClavier extends javax.swing.JButton implements Bouton {

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

    public void addListener(visuel.Mot mot, Clavier clavier, Hangman hangman) {
        this.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!mot.getTestedLetters().contains(String.valueOf(lettre)) && mot.isNotEmpty()) {
                    hangman.isError(clavier.setLastpresed(lettre, mot.theLetterIsIn(lettre)), mot, clavier);
                    if (mot.isFound()) {
                        hangman.win(true, mot, clavier);
                    }
                }
            }
        });
    }

    public void reset() {
        this.changeColor();
    }
}
