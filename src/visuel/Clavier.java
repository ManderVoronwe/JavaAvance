package visuel;

import bouton.BoutonClavier;

public class Clavier extends javax.swing.JPanel {

    private BoutonClavier[] boutons;
    private int lastpresed;

    public Clavier(visuel.Mot mot, Hangman hangman) {
        boutons = new BoutonClavier[26];
        this.setLayout(null);
        this.setBounds(0, 535, 1000, 265);
        for (int i = 0; i < 26; i++) {
            boutons[i] = new BoutonClavier(String.valueOf((char) (i + 'A')), mot, this, hangman);
            this.add(boutons[i]);
        }
        for (int i = 0; i < 26; i++) {
            if (i < 10) {
                boutons[i].setBounds(205 + 60 * i, 40, 50, 50);
            } else if (i < 19) {
                boutons[i].setBounds(230 + 60 * (i - 10), 100, 50, 50);
            } else {
                boutons[i].setBounds(280 + 60 * (i - 19), 160, 50, 50);
            }
        }

    }

    public BoutonClavier[] getBoutons() {
        return boutons;
    }

    public void setBoutons(BoutonClavier[] boutons) {
        this.boutons = boutons;
    }

    public void wasCorect(boolean corect) {
        // boutons[lastpresed].disableListener();

        boutons[lastpresed].changeColor(corect ? 'g' : 'r');
    }

    public void reset() {
        for (int i = 0; i < 26; i++) {
            boutons[i].reset();
        }
    }

    public boolean setLastpresed(int lastpresed, boolean corect) {
        this.lastpresed = lastpresed;
        wasCorect(corect);
        return corect;
    }

    public int getLastpresed() {
        return lastpresed;
    }

    public boolean setLastpresed(char lastpresed, boolean corect) {
        this.lastpresed = lastpresed - 'A';
        wasCorect(corect);
        return corect;
    }

}
