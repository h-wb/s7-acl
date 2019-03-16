package modele.categorie;

import modele.Categorie;

public class Pique extends Categorie{

	public Pique() {
		
		super(Couleur.Noir);
		
	}

	@Override
	public String toString() {
		return "Pique";
	}

}
