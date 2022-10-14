package main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import bouton.*;
import listeMots.ListeDeMots;

public class Jeu extends JFrame {

    public Jeu() {
        ListeDeMots liste = new ListeDeMots("assets/liste-de-mots.txt");
        JLabel mot = new JLabel(liste.getMot());
        this.setLayout(null);
        this.add(mot);
        mot.setBounds(20, 30, 300, 50);
        // Chose Word
        NouveauMot newWord = new NouveauMot(mot);
        this.add(newWord);

        // Add Quit Button
        this.add(new Fermer());

        // Add Options to Frame
        this.setTitle("Jeu du Pendu");
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        Jeu jeu = new Jeu();
    }

}
