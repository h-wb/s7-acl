package modele.cartes;

import modele.Carte;
import modele.Categorie;

public class Dix extends Carte{

	public Dix(Categorie categ) {
		
		super(categ, 10);

	}

	@Override
	public String toString() {
		return "Dix";
	}

}
