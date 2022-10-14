package bouton;

import java.awt.Color;

public class BoutonClavier extends javax.swing.JButton implements Bouton {

    /**
     * 
     */
    private static final long serialVersionUID = -8143926993296614699L;
    private char lettre;

    public BoutonClavier(String texte) {
        super(texte);
        this.lettre = texte.charAt(0);
        this.setBackground(Color.WHITE);
        this.addListener();
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

    public char getLettre() {
        return lettre;
    }

    public void setLettre(char lettre) {
        this.lettre = lettre;
        this.setText(String.valueOf(lettre));
    }

    // andle the event when the button is clicked and send the letter to the game
    public void addListener() {
        this.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
    }

    public void removeListener() {
        for (java.awt.event.ActionListener al : this.getActionListeners()) {
            this.removeActionListener(al);
        }
    }

}
