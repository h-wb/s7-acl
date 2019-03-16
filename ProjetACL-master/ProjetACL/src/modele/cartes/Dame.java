package modele.cartes;

import modele.Carte;
import modele.Categorie;

public class Dame extends Carte{

	@Override
	public String toString() {
		return "Dame";
	}

	public Dame(Categorie categ) {
		
		super(categ, 3);

	}

}
