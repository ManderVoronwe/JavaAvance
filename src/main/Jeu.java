package main;

import java.awt.*;
import javax.swing.*;
import bouton.*;
import listeMots.ListeDeMots;
import visuel.*;

public class Jeu extends JFrame {

    public Jeu() {
        ListeDeMots liste = new ListeDeMots("assets/liste-de-mots.txt");
        this.setLayout(null);
        Mot motVisuel = new Mot(liste.getMot());
        // panel for the buttons
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 1000, 35);
        panel1.setBackground(Color.red);
        Fermer fermer = new Fermer();
        fermer.setBounds(550, 0, 80, 30);
        panel1.add(fermer);

        // panel for the word
        JPanel panel3 = new JPanel();
        panel3.add(motVisuel);
        panel3.setLayout(null);
        panel3.setBounds(500, 35, 500, 500);
        panel3.setBackground(Color.green);

        // panel for the keyboard

        Hangman hangman = new Hangman();
        // panel for the keyboard
        Clavier clavier = new Clavier(motVisuel, hangman);

        NouveauMot newWord = new NouveauMot(motVisuel, clavier, hangman);
        newWord.setBounds(400, 0, 120, 30);

        panel1.add(newWord);
        // adding panel to frame
        this.add(panel1);
        // this.add(panel2);

        this.add(hangman);
        this.add(panel3);
        this.add(clavier);

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
