package bouton;

import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import listeMots.ListeDeMots;
public class NouveauMot extends javax.swing.JButton implements Bouton {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6229285001788031611L;

	public NouveauMot() {
		super("Nouveau mot");
		this.setBounds(400, 0, 120, 30);
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListeDeMots liste = new ListeDeMots("assets/liste-de-mots.txt");
				liste.chooseWord();
			}
		});


	}


}
