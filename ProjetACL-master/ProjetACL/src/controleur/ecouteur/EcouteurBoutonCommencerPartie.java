package controleur.ecouteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import vue.CadreAccueil;
import vue.CadrePseudo;

public class EcouteurBoutonCommencerPartie extends Ecouteur implements ActionListener{

	public EcouteurBoutonCommencerPartie(JButton bouton, JFrame frameFerme) {
		
		super(bouton, frameFerme);
		bouton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		getFrame().setVisible(false);
		CadrePseudo cp = new CadrePseudo();
		
		
	}

}
