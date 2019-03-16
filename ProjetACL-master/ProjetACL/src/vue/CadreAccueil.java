package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.*;

import controleur.ecouteur.Ecouteur;
import controleur.ecouteur.EcouteurBoutonCommencerPartie;
import controleur.ecouteur.EcouteurBoutonQuitter;
import controleur.ecouteur.EcouteurBoutonRecords;

public class CadreAccueil extends JFrame{
	
	public JButton debutPartie, records, quitter;
	JPanel panelBas;
	Ecouteur ebcp, ebq, ebr;
	File fichierRecord;
	
	public CadreAccueil() {
		
		super("Accueil");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		
		// Dimension fenetre
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
		
		//Création d'un panel + placement de boutons
        this.panelBas = new JPanel(new FlowLayout(FlowLayout.CENTER));

        this.debutPartie = new JButton("Commencer la partie");
        this.records = new JButton("Records");
        this.quitter = new JButton("Quitter");

        this.panelBas.add(this.debutPartie);
        this.panelBas.add(this.records);
        this.panelBas.add(this.quitter);

        this.add(this.panelBas, BorderLayout.SOUTH);
        
        this.ebcp = new EcouteurBoutonCommencerPartie(this.debutPartie, this);
        this.ebq = new EcouteurBoutonQuitter(this.quitter, this);
        this.ebr = new EcouteurBoutonRecords(this.records, this);

        this.setVisible(true);
		
	}

}
