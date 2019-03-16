package controleur.ecouteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;

import controleur.GererFichier;
import controleur.Jeu;
import controleur.Joueur;
import modele.Carte;
import vue.CadreJeu;
import vue.CadrePseudo;
import vue.CadreRecords;

public class EcouteurContinuerJeu extends Ecouteur implements ActionListener{
	
	Joueur joueur;
	Jeu jeu;
	CadreJeu copie;
	
	public EcouteurContinuerJeu(JButton bouton, JFrame frame, Jeu jeu) {
		super(bouton, frame);
		
		this.copie = (CadreJeu) frame;
		this.jeu = jeu;
		bouton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(this.jeu.getTour() <= 5) {
			
			
			
				
				Carte c1;
				try {
					c1 = this.jeu.tirerCarte();
					Carte c2 = this.jeu.tirerCarte();
					
					while(c2.equals(c1)) {
						
						c2 = this.jeu.tirerCarte();
						
					}
					this.copie.miseAJour(c1, c2, this.jeu.getTour(), this.jeu.getJ().getScore().getValeur());
					this.jeu.Joue(c1, c2);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| IllegalArgumentException | InvocationTargetException | NoSuchMethodException
						| SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			this.jeu.setTour(this.jeu.getTour() + 1);
			
			
		}else {
			
			GererFichier gf = new GererFichier("C:\\Users\\Chocobo\\eclipse-workspace\\ProjetACL-master\\ProjetACL\\src\\ressource\\records.txt");
			
			try {

				gf.EcrireFichier(this.jeu.getJ().getPseudo() + ":" + this.jeu.getJ().getScore().getValeur());
				CadreRecords cr = new CadreRecords("C:\\Users\\Chocobo\\eclipse-workspace\\ProjetACL-master\\ProjetACL\\src\\ressource\\records.txt");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}

}
