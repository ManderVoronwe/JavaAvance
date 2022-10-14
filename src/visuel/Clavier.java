package visuel;

import bouton.BoutonClavier;

public class Clavier {

    private BoutonClavier[] boutons;
    private int lastpresed;

    public Clavier() {
        boutons = new BoutonClavier[26];
        for (int i = 0; i < 26; i++) {
            boutons[i] = new BoutonClavier(String.valueOf((char) (i + 'A')));
        }
    }

    public BoutonClavier[] getBoutons() {
        return boutons;
    }

    public void setBoutons(BoutonClavier[] boutons) {
        this.boutons = boutons;
    }

    public void wasCorect(boolean corect) {
        boutons[lastpresed].changeColor(corect ? 'g' : 'r');
        boutons[lastpresed].disableListener();
    }

    public void reset() {
        for (int i = 0; i < 26; i++) {
            boutons[i].reset();
        }
    }

}
