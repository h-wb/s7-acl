package controleur.ecouteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import vue.CadreAccueil;

public class EcouteurAbandonner extends Ecouteur implements ActionListener{

	public EcouteurAbandonner(JButton bouton, JFrame frameFerme) {
		super(bouton, frameFerme);
		bouton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		getFrame().setVisible(false);
		CadreAccueil ca = new CadreAccueil();
		
	}

}
