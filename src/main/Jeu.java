package main;


import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
import bouton.*;
import listeMots.ListeDeMots;
public class Jeu extends JFrame {

    public Jeu() {
        this.setLayout(null); 

        //Chose Word
        ListeDeMots liste = new ListeDeMots("assets/liste-de-mots.txt");
        liste.chooseWord();
        JLabel mot = new JLabel(liste.getMot());
        mot.setBounds(20, 30, 300, 50); 
        this.add(mot);

        //add new word button
        JButton newWord = new JButton("Nouveau mot");
        newWord.setBounds(400, 0, 120, 30);
        newWord.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                liste.chooseWord();
                mot.setText(liste.getMot());
            }
        });
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




