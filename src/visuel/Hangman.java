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

        ((Graphics2D) g).setStroke(new BasicStroke(8));
        g.drawLine(300, 250, 300, 350);
    }

    public void drawHead() {
        g.setColor(Color.getHSBColor(27, 78, 69));

        ((Graphics2D) g).setStroke(new BasicStroke(5));

        g.fillOval(275, 200, 50, 50);

        g.setColor(Color.white);
        g.fillOval(285, 210, 10, 10);
        g.fillOval(305, 210, 10, 10);

        g.setColor(Color.black);
        g.fillOval(290, 215, 5, 5);
        g.fillOval(310, 215, 5, 5);

        // draw eysbrwos
        ((Graphics2D) g).setStroke(new BasicStroke(1));
        g.drawLine(290, 205, 295, 210);
        g.drawLine(310, 205, 305, 210);

        g.setColor(Color.red);
        ((Graphics2D) g).setStroke(new BasicStroke(2));
        g.drawArc(285, 225, 30, 20, -180, -180);

    }

    public void drawRope() {
        g.drawImage(new ImageIcon("assets/rope.png").getImage(), 290, 150, 10, 70, this);
        if (nbErreurs > 5) {
            drawHead();
        }

    }

    public void drawHorizontalPole() {
        g.drawImage(new ImageIcon("assets/wood.jpg").getImage(), 100, 150, 230, 10, this);

    }

    public void drawSupport() {

        Polygon polygon = new Polygon();
        polygon.addPoint(145, 150);
        polygon.addPoint(155, 150);
        polygon.addPoint(100, 205);
        polygon.addPoint(100, 195);
        g.setClip(polygon);
        g.drawImage(new ImageIcon("assets/wood.jpg").getImage(), 0, 0, null);
        g.setClip(null);
    }

    public void drawVerticalPole() {
        g.drawImage(new ImageIcon("assets/wood.jpg").getImage(), 100, 150, 10, 300, this);

    }

    public void drawGround() {
        g.drawImage(new ImageIcon("assets/ground.jpg").getImage(), 50, 450, 200, 10, this);

    }

    public void reset() {
        setNbErreurs(0);
    }

}
