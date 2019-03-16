package modele.cartes;

import modele.Carte;
import modele.Categorie;

public class Huit extends Carte{

	public Huit(Categorie categ) {
		
		super(categ, 0);
	}

	@Override
	public String toString() {
		return "Huit";
	}

}
