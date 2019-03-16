package controleur.ecouteur;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EcouteurBoutonQuitter extends Ecouteur implements ActionListener{

	public EcouteurBoutonQuitter(JButton bouton, JFrame frameFerme) {
		
		super(bouton, frameFerme);
		bouton.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		System.exit(0);
		
	}

}
