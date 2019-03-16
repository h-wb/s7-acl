package controleur.ecouteur;
import controleur.Joueur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;

import vue.CadreJeu;
import vue.CadrePseudo;

public class EcouteurContinuer extends Ecouteur implements ActionListener{
	
	CadrePseudo copie;
	Joueur joueur;
	
	public EcouteurContinuer(JButton bouton, JFrame frameFerme) {
		super(bouton, frameFerme);
		copie = (CadrePseudo) frameFerme;
		bouton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.joueur = new Joueur(copie.textField.getText());
		getFrame().setVisible(false);
		try {
			CadreJeu cp = new CadreJeu(this.joueur);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
