package modele;

public class Carte {
	
	protected Categorie categ;
	protected int valeur;
	
	protected Carte(Categorie categ, int valeur){
		
		this.categ = categ;
		this.valeur = valeur;
		
	}
	
	public Categorie getCategorie() {
		
		return this.categ;
		
	}
	
	public int getValeur() {
		
		return this.valeur;
		
	}

}
