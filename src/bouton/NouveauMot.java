package bouton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import listeMots.ListeDeMots;
import visuel.*;

public class NouveauMot extends javax.swing.JButton implements Bouton {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6229285001788031611L;

	public NouveauMot(Mot motVisuel, Clavier clavier, Hangman hangman) {
		super("Nouveau mot");

		ListeDeMots liste = new ListeDeMots("assets/liste-de-mots.txt");
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liste.chooseWord();
				motVisuel.setMot(liste.getMot());
				clavier.reset();
				hangman.reset();

			}
		});

	}

}
