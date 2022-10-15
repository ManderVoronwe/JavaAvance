package visuel;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Handler;

public class Hangman extends JPanel {


    public void paintComponent(Graphics g) {
        //draw hangman
        //array 8*4
        int[][] array = new int[8][4];
        array[0] = new int[]{75, 250, 125, 250};
        array[1] = new int[]{100, 100, 100, 250};
        array[2] = new int[]{100, 100, 150, 100};
        array[3] = new int[]{150, 100, 150, 150};
        array[4] = new int[]{140, 150, 20, 20};
        array[5] = new int[]{150, 170, 150, 200};
        array[6] = new int[]{150, 200, 140, 220};
        array[7] = new int[]{150, 200, 160, 220};


        for(int i=0; i<8; i++) {
            if (i==4) {
                g.drawOval(array[i][0], array[i][1], array[i][2], array[i][3]);
            }
            else {
            g.drawLine(array[i][0], array[i][1], array[i][2], array[i][3]);
            }
        }

        // setBounds(0, 0, 300, 300);
        setBackground(Color.yellow);
        
    }

}
