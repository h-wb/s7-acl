package modele.cartes;

import modele.Carte;
import modele.Categorie;

public class As extends Carte{

	@Override
	public String toString() {
		return "As";
	}

	public As(Categorie categ) {
		
		super(categ, 11);

	}

}
