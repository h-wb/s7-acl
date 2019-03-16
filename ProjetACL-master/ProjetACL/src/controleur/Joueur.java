package controleur;

import modele.Carte;

public class Joueur {

	private String pseudo;
	private Score score;
	
	public Joueur(String pseudo) {
		this.pseudo = pseudo;
		this.score = new Score();
	}
	
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public Score getScore() {
		return score;
	}
	

}
