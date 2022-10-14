package bouton;

import java.io.*;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import listeMots.ListeDeMots;

public class NouveauMot extends javax.swing.JButton implements Bouton {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6229285001788031611L;

	public NouveauMot(JLabel mot) {
		super("Nouveau mot");
		ListeDeMots liste = new ListeDeMots("assets/liste-de-mots.txt");
		this.setBounds(400, 0, 120, 30);
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liste.chooseWord();
				mot.setText(liste.getMot());
			}
		});
		this.setBounds(400, 0, 120, 30);

	}

}
