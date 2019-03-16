package modele.cartes;

import modele.Carte;
import modele.Categorie;

public class Roi extends Carte{

	public Roi(Categorie categ) {
		
		super(categ, 4);

	}

	@Override
	public String toString() {
		return "Roi";
	}

}
