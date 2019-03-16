package modele.cartes;

import modele.Carte;
import modele.Categorie;

public class Valet extends Carte{

	public Valet(Categorie categ) {
		
		super(categ, 2);

	}
	
	@Override
	public String toString() {
		return "Valet";
	}


}
