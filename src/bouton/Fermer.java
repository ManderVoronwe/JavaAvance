package bouton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;

public class Fermer extends javax.swing.JButton implements Bouton {

	private static final long serialVersionUID = 4695574331699134985L;

	public Fermer() {
		super("Fermer");
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		this.setBackground(Color.WHITE);
		this.setForeground(Color.RED);

	}

}
