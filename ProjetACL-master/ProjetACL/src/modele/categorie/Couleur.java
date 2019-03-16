package modele.categorie;

public enum Couleur {
	
	Rouge("Rouge"),
	Noir("Noir");
	
	private String couleur = "";
	
	Couleur(String couleur){
		
		this.couleur = couleur;
		
	}
	
	public String toString() {
		
		return couleur;
		
	}

}
