package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.ecouteur.Ecouteur;
import controleur.ecouteur.EcouteurAbandonner;
import controleur.ecouteur.EcouteurContinuer;

public class CadrePseudo extends JFrame{
	
	public JButton continuer, abandonner;
	JPanel panelBas, panelHaut;
	JLabel label;
	public JTextField textField;
	Ecouteur ec, ea;
	
	
	public CadrePseudo() {
		
		super("Choix pseudo");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		
		// Dimension fenetre
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2 - this.getWidth()/2, dim.height/2 - this.getHeight()/2);
		
		//Création d'un panel + placement de boutons
		this.panelHaut = new JPanel();
        this.panelBas = new JPanel(new FlowLayout(FlowLayout.CENTER));

        this.continuer = new JButton("Continuer");
        this.abandonner = new JButton("Abandonner");

        this.panelBas.add(this.continuer);
        this.panelBas.add(this.abandonner);
        
        this.label = new JLabel("Entrez votre pseudo : ");
        this.textField = new JTextField(30);
        
        this.panelHaut.add(label);
        this.panelHaut.add(this.textField);

        this.add(this.panelHaut, BorderLayout.NORTH);
        this.add(this.panelBas, BorderLayout.SOUTH);
        
        this.ec = new EcouteurContinuer(this.continuer, this);
		this.ea = new EcouteurAbandonner(this.abandonner, this);

        this.setVisible(true);
		
	}
	

}
