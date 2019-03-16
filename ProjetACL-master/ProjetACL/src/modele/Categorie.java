package modele;

import modele.categorie.Couleur;

public abstract class Categorie {
	
	protected Couleur couleur;
	
	protected Categorie(Couleur couleur){
		
		this.couleur = couleur;
		
	}
	
	public Couleur getCouleur() {
		
		return this.couleur;
		
	}
	
	public abstract String toString();

}
