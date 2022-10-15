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
        repaint();
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
            case 12:
                setNbErreurs(11);
                break;
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
                drawRope();
            case 4:
                drawHorizontalPole();
            case 3:
                drawSupport();
            case 2:
                drawVerticalPole();
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

        ((Graphics2D) g).setStroke(new BasicStroke(4));
        // set the width of draw
        g.drawLine(300, 350, 350, 400);
    }

    public void drawLeftLeg() {
        g.setColor(Color.black);

        ((Graphics2D) g).setStroke(new BasicStroke(4));
        g.drawLine(300, 350, 250, 400);
    }

    public void drawRightArm() {
        g.setColor(Color.black);

        ((Graphics2D) g).setStroke(new BasicStroke(3));
        g.drawLine(350, 300, 300, 250);
    }

    public void drawLeftArm() {
        g.setColor(Color.black);

        ((Graphics2D) g).setStroke(new BasicStroke(3));
        g.drawLine(250, 300, 300, 250);
    }

    public void drawBody() {
        g.setColor(Color.black);

        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g.drawLine(300, 250, 300, 350);
    }

    public void drawHead() {
        g.setColor(Color.black);

        ((Graphics2D) g).setStroke(new BasicStroke(5));
        // set as plein
        g.fillOval(275, 200, 50, 50);
        // add eyes
        g.setColor(Color.white);
        g.fillOval(285, 210, 10, 10);
        g.fillOval(305, 210, 10, 10);
        g.setColor(Color.red);
        ((Graphics2D) g).setStroke(new BasicStroke(2));
        g.drawArc(285, 225, 30, 20, -180, -180);

    }

    public void drawRope() {
        g.drawImage(new ImageIcon("assets/rope.png").getImage(), 290, 150, 10, 50, this);
        // g.setColor(Color.black);

        // ((Graphics2D) g).setStroke(new BasicStroke(5));
        // g.drawLine(300, 150, 300, 200);
    }

    public void drawHorizontalPole() {
        // set the texture to draw as wood
        g.drawImage(new ImageIcon("assets/wood.jpg").getImage(), 100, 150, 230, 10, this);

        // ((Graphics2D) g).setStroke(new BasicStroke(5));
        // g.drawLine(300, 150, 100, 150);
    }

    public void drawSupport() {
        g.setColor(Color.black);

        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g.drawLine(100, 200, 150, 150);
    }

    public void drawVerticalPole() {
        g.drawImage(new ImageIcon("assets/wood.jpg").getImage(), 100, 150, 10, 300, this);
        // g.setColor(Color.black);
        // ((Graphics2D) g).setStroke(new BasicStroke(5));
        // g.drawLine(100, 150, 100, 450);
    }

    public void drawGround() {
        g.drawImage(new ImageIcon("assets/ground.jpg").getImage(), 50, 450, 200, 10, this);
        // g.setColor(Color.black);
        // ((Graphics2D) g).setStroke(new BasicStroke(5));
        // .drawLine(50, 450, 200, 450);
    }

    public void reset() {
        setNbErreurs(0);
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
