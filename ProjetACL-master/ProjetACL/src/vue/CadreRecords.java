package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controleur.GererFichier;
import controleur.ecouteur.Ecouteur;
import controleur.ecouteur.EcouteurAbandonner;
import controleur.ecouteur.EcouteurBoutonQuitter;

public class CadreRecords extends JFrame{

	public JButton retourMenu, quitter;
	JPanel panelBas, panelHaut;
	File fichierRecord;
	Ecouteur ecouteurQuitter, ecouteurAbandonner;
	JLabel classement;
	GererFichier lf;
	
	public CadreRecords(String fichierRecord) throws FileNotFoundException, IOException {
		
		super("Records");
		
		this.lf = new GererFichier(fichierRecord);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		
		// Dimension fenetre
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
		
		//Création d'un panel + placement de boutons
        this.panelBas = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.panelHaut = new JPanel(new FlowLayout(FlowLayout.CENTER));

        this.retourMenu = new JButton("Retour Menu");
        this.quitter = new JButton("Quitter");

        this.panelBas.add(this.retourMenu);
        this.panelBas.add(this.quitter);
        
        this.classement = new JLabel(lf.lire());
        System.out.println(lf.lire());

        this.add(this.panelBas, BorderLayout.SOUTH);
        this.add(this.panelHaut, BorderLayout.NORTH);
        this.panelHaut.add(this.classement);
        
        this.ecouteurQuitter = new EcouteurBoutonQuitter(this.quitter, this);
        this.ecouteurAbandonner = new EcouteurAbandonner(this.retourMenu, this);
        

        this.setVisible(true);
		
	}
	
}
