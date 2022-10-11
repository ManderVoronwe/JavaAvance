package bouton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NouveauMot extends javax.swing.JButton implements Bouton {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6229285001788031611L;

	public NouveauMot() {
		super("Nouveau mot");
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// TODO launche a new game
			}
		});

	}

}
