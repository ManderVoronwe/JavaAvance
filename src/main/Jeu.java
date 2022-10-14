package main;


import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
import bouton.Fermer;
public class Jeu extends JFrame {

    public Jeu() {
        this.setLayout(null); 

        this.add(new Fermer());

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




