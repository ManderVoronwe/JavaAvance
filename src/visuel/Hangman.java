package visuel;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Handler;

public class Hangman extends JPanel {
    private Graphics g;
    private int nbErreurs;

    public Hangman() {
        setLayout(null);
        setBounds(0, 35, 500, 500);
        setBackground(Color.blue);
        this.nbErreurs = 0;
    }

    public int getNbErreurs() {
        return nbErreurs;
    }

    public void setNbErreurs(int nbErreurs) {
        this.nbErreurs = nbErreurs;
    }

    public void newError() {
        this.nbErreurs++;
        repaint();
    }

    public void isError(boolean corect) {
        if (!corect) {
            newError();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.g = g;
        switch (nbErreurs) {
            case 11:
                drawRightLeg();
            case 10:
                drawLeftLeg();
            case 9:
                drawRightArm();
            case 8:
                drawLeftArm();
            case 7:
                drawBody();
            case 6:
                drawHead();
            case 5:
                drawCord();
            case 4:
                drawVerticalPole();
            case 3:
                drawSupport();
            case 2:
                drawHorizontalPole();
            case 1:
                drawGround();
                break;
            case 0:
                reset();
                break;
            default:
                break;
        }
    }

    public void drawRightLeg() {
        g.setColor(Color.black);
        g.drawLine(300, 400, 350, 450);
    }

    public void drawLeftLeg() {
        g.setColor(Color.black);
        g.drawLine(300, 400, 250, 450);
    }

    public void drawRightArm() {
        g.setColor(Color.black);
        g.drawLine(350, 350, 300, 300);
    }

    public void drawLeftArm() {
        g.setColor(Color.black);
        g.drawLine(250, 350, 300, 300);
    }

    public void drawBody() {
        g.setColor(Color.black);
        g.drawLine(300, 300, 300, 400);
    }

    public void drawHead() {
        g.setColor(Color.black);
        g.drawOval(275, 250, 50, 50);
    }

    public void drawCord() {
        g.setColor(Color.black);
        g.drawLine(300, 200, 300, 250);
    }

    public void drawVerticalPole() {
        g.setColor(Color.black);
        g.drawLine(300, 200, 400, 200);
    }

    public void drawSupport() {
        g.setColor(Color.black);
        g.drawLine(400, 200, 400, 50);
    }

    public void drawHorizontalPole() {
        g.setColor(Color.black);
        g.drawLine(400, 50, 100, 50);
    }

    public void drawGround() {
        g.setColor(Color.black);
        g.drawLine(100, 50, 100, 100);
    }

    public void reset() {
        this.nbErreurs = 0;

        repaint();
    }

    // public void paintComponent() {
    // //draw hangman
    // //array 8*4
    // int[][] array = new int[8][4];
    // array[0] = new int[]{75, 250, 125, 250};
    // array[1] = new int[]{100, 100, 100, 250};
    // array[2] = new int[]{100, 100, 150, 100};
    // array[3] = new int[]{150, 100, 150, 150};
    // array[4] = new int[]{140, 150, 20, 20};
    // array[5] = new int[]{150, 170, 150, 200};
    // array[6] = new int[]{150, 200, 140, 220};
    // array[7] = new int[]{150, 200, 160, 220};

    // for(int i=0; i<8; i++) {
    // if (i==4) {
    // g.drawOval(array[i][0], array[i][1], array[i][2], array[i][3]);
    // }
    // else {
    // g.drawLine(array[i][0], array[i][1], array[i][2], array[i][3]);
    // }
    // }

    // setBounds(0, 35, 500, 500);
    // // setBackground(Color.yellow);

    // }

}
