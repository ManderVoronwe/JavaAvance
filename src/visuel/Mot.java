package visuel;

import java.awt.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.awt.font.*;

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
        System.out.println("mot :    " + mot);
        setBounds(0, 0, 500, 500);
        this.setForeground(Color.BLACK);
        this.setMot(mot);
    }

    public void setMot(String mot) {
        System.out.println("mot :    " + mot);
        this.nbLettres = mot.length();
        this.nbLettresTrouvees = 0;
        this.lettresAffichees = new char[this.nbLettres];
        this.lettres = new char[this.nbLettres];
        for (int i = 0; i < this.nbLettres; i++) {
            this.lettresAffichees[i] = '_';
            this.lettres[i] = mot.toUpperCase().charAt(i);
            if (this.lettres[i] == 'É' || this.lettres[i] == 'È' || this.lettres[i] == 'Ê' || this.lettres[i] == 'Ë') {
                this.lettres[i] = 'E';
            } else if (this.lettres[i] == 'À' || this.lettres[i] == 'Â' || this.lettres[i] == 'Ä') {
                this.lettres[i] = 'A';
            } else if (this.lettres[i] == 'Ô' || this.lettres[i] == 'Ö') {
                this.lettres[i] = 'O';
            } else if (this.lettres[i] == 'Ù' || this.lettres[i] == 'Û' || this.lettres[i] == 'Ü') {
                this.lettres[i] = 'U';
            } else if (this.lettres[i] == 'Î' || this.lettres[i] == 'Ï') {
                this.lettres[i] = 'I';
            } else if (this.lettres[i] == 'Ç') {
                this.lettres[i] = 'C';
            }
        }
        setBounds(0, 0, 500, 500);
        // space up lettre
        this.setText(String.valueOf(this.lettresAffichees));
        this.setFont(new Font("Arial", Font.BOLD, 20));
        SwingUtilities.invokeLater(() -> {
            Map<TextAttribute, Object> attributes = new HashMap<TextAttribute, Object>();
            attributes.put(TextAttribute.TRACKING, 0.25);

            this.setFont(getFont().deriveFont(attributes));
        });

        this.setForeground(Color.BLACK);
    }

    public boolean theLetterIsIn(char lettre) {
        boolean trouve = false;
        for (int i = 0; i < this.nbLettres; i++) {
            if (this.lettres[i] == lettre && this.lettresAffichees[i] == '_') {
                this.lettresAffichees[i] = lettre;
                this.nbLettresTrouvees++;
                trouve = true;
            }
        }
        this.setText(String.valueOf(this.lettresAffichees));
        this.updateUI();
        return trouve;
    }

    public boolean isFound() {
        return this.nbLettresTrouvees == this.nbLettres;
    }

}