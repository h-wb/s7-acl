package controleur.ecouteur;

import javax.swing.JButton;
import javax.swing.JFrame;

public abstract class Ecouteur{
	
	private JButton bouton;
	private JFrame frameFerme;
	
	public Ecouteur(JButton bouton, JFrame frameFerme) {
		
		setBouton(bouton);
		this.frameFerme = frameFerme;
		
	}
	
	public JFrame getFrame() {
		
		return this.frameFerme;
		
	}
	
	public JButton getBouton() {
		return bouton;
	}


	public void setBouton(JButton bouton) {
		this.bouton = bouton;
	}

}
