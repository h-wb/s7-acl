package controleur;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import modele.cartes.*;
import modele.categorie.*;
import modele.Carte;
import modele.Categorie;



public class Jeu {
	
	private int tour;
	Joueur j;
	
	public Jeu(Joueur j) {
		this.tour = 1;
		this.j = j;
	}
	
	public int getTour() {
		return tour;
	}
	public void setTour(int tour) {
		this.tour = tour;
	}
	public Joueur getJ() {
		return j;
	}
	public void setJ(Joueur j) {
		this.j = j;
	}
	
	public Carte tirerCarte() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	
		Class<?> categorie = Class.forName(Outils.getRandomCateg());
		Class<?> valeur = Class.forName(Outils.getRandomValeur());
		Carte carte =  (Carte) valeur.getConstructor(Categorie.class).newInstance(categorie.getConstructor().newInstance());
		return carte;
		
	}


	public void Joue(Carte c1, Carte c2) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		
			if((c1.getValeur() == c2.getValeur())&&(c1.getCategorie().getCouleur() == c2.getCategorie().getCouleur())) {
		
				this.j.getScore().setValeur(this.j.getScore().getValeur() - c1.getValeur() * 4);
				
			}else if((c1.getValeur() == c2.getValeur())&&(c1.getCategorie().getCouleur() != c2.getCategorie().getCouleur())) {
				

				this.j.getScore().setValeur(this.j.getScore().getValeur() - c1.getValeur() * 2);
				
			}else if((c1.getValeur() != c2.getValeur())&&(c1.getCategorie().getCouleur() != c2.getCategorie().getCouleur())) {
				
			
				this.j.getScore().setValeur(this.j.getScore().getValeur() + (c1.getValeur() + c2.getValeur()));
			}
			
			
		}
		
		
	
	

}
