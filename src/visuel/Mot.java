package visuel;

import java.awt.*;

import javax.swing.*;
import java.lang.*;

public class Mot extends JLabel {
    /**
     * 
     */
    private static final long serialVersionUID = 8498750784113943441L;
    private int nbLettres;
    private int nbLettresTrouvees;
    private char[] lettresAffichees;
    private char[] lettres;

    public Mot(String mot) {
        super();
        System.out.println("mot :    "+mot);
        this.nbLettres = mot.length();
        this.nbLettresTrouvees = 0;
        this.lettresAffichees = new char[this.nbLettres];
        this.lettres = new char[this.nbLettres];
        for (int i = 0; i < this.nbLettres; i++) {
            this.lettresAffichees[i] = '_';
            this.lettres[i] = mot.charAt(i);
        }
        setBounds(0, 0, 500, 500);
        this.setText(String.valueOf(this.lettresAffichees));
        this.setFont(new Font("Arial", Font.BOLD, 20));
        this.setForeground(Color.BLACK);
    }



    public void setMot(String mot) {
        System.out.println("mot :    "+mot);
        this.nbLettres = mot.length();
        this.nbLettresTrouvees = 0;
        this.lettresAffichees = new char[this.nbLettres];
        this.lettres = new char[this.nbLettres];
        for (int i = 0; i < this.nbLettres; i++) {
            this.lettresAffichees[i] = '_';
            this.lettres[i] = mot.charAt(i);
        }
        setBounds(0, 0, 500, 500);
        this.setText(String.valueOf(this.lettresAffichees));
        this.setFont(new Font("Arial", Font.BOLD, 20));
        this.setForeground(Color.BLACK);
    }

    public boolean theLetterIsIn(char lettre) {
        boolean trouve = false;
        for (int i = 0; i < this.nbLettres; i++) {
            if (this.lettres[i] == lettre) {
                this.lettresAffichees[i] = lettre;
                this.nbLettresTrouvees++;
                trouve = true;
            }
        }
        this.setText(String.valueOf(this.lettresAffichees));
        return trouve;
    }

    public boolean isFound() {
        return this.nbLettresTrouvees == this.nbLettres;
    }

}