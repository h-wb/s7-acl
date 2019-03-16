package modele.cartes;

import modele.Carte;
import modele.Categorie;

public class Sept extends Carte{

	public Sept(Categorie categ) {
		
		super(categ, 0);

	}

	@Override
	public String toString() {
		return "Sept";
	}

}
