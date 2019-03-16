package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.Jeu;
import controleur.Joueur;
import controleur.Score;
import controleur.ecouteur.Ecouteur;
import controleur.ecouteur.EcouteurAbandonner;
import controleur.ecouteur.EcouteurContinuerJeu;
import modele.Carte;

public class CadreJeu extends JFrame{
	
	public JButton continuerJeu, abandonner;
	JPanel panelBas, panelC1, panelC2, panelTour, panelScore;
	Joueur j;
	Ecouteur ecj, ea;
	Jeu jeu;
	JLabel labelC1, labelC2, labelTour, labelScore;
	
	public CadreJeu(Joueur j) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		super("Jeu");
		
		this.j = j;
		
		this.jeu = new Jeu(this.j);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		
		// Dimension fenetre
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
		
		//Création d'un panel + placement de boutons
        this.panelBas = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.panelC1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.panelC2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.panelTour = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.panelScore = new JPanel(new FlowLayout(FlowLayout.CENTER));

        this.continuerJeu = new JButton("Continuer");
        this.abandonner = new JButton("Abandonner");

        this.panelBas.add(this.continuerJeu);
        this.panelBas.add(this.abandonner);
        
        this.labelC1 = new JLabel("Carte 1 : ");
        this.labelC2 = new JLabel("Carte 2 : ");
        this.labelTour = new JLabel("Tour ");
        this.labelScore = new JLabel("Score : ");
        
        this.panelScore.add(labelScore);
        this.panelTour.add(labelTour);
        this.panelC1.add(labelC1);
        this.panelC2.add(labelC2);

        this.add(this.panelBas, BorderLayout.SOUTH);
        this.add(this.panelC1, BorderLayout.WEST);
        this.add(this.panelC2, BorderLayout.EAST);
        this.add(this.panelTour, BorderLayout.NORTH);
        this.add(this.panelScore, BorderLayout.CENTER);
        
        this.ecj = new EcouteurContinuerJeu(this.continuerJeu, this, this.jeu);
        this.ea = new EcouteurAbandonner(this.abandonner, this);
        
        this.setVisible(true);
        
		
	}
	
	public void miseAJour(Carte c1, Carte c2, int tour, int score) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		this.labelScore.setText("Score : " + score);
		this.labelTour.setText("Tour " + tour);
		this.labelC1.setText("Carte 1 : " + c1 + " de " + String.valueOf(c1.getCategorie() + "(Valeur : " +c1.getValeur() + ")" ));
		this.labelC2.setText("Carte 2 : " + c2 + " de " + String.valueOf(c2.getCategorie() + "(Valeur : " +c2.getValeur() + ")" ));
	}

}
