package controleur;

import java.util.ArrayList;
import java.util.Random;

public class Outils {
	
	static String[] arrayCateg = {"modele.categorie.Trefle", "modele.categorie.Coeur", "modele.categorie.Pique", "modele.categorie.Carreau"};
	static String[] arrayValeur = {"modele.cartes.As", "modele.cartes.Roi", "modele.cartes.Dame", "modele.cartes.Valet", "modele.cartes.Dix", "modele.cartes.Neuf", "modele.cartes.Huit", "modele.cartes.Sept"};

	public static String getRandomCateg() {
	    int randomCateg = new Random().nextInt(arrayCateg.length);
	    return arrayCateg[randomCateg];
	}
	
	public static String getRandomValeur() {
	    int randomValeur = new Random().nextInt(arrayValeur.length);
	    return arrayValeur[randomValeur];
	}
}
