package controleur.ecouteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

import vue.CadreRecords;

public class EcouteurBoutonRecords extends Ecouteur implements ActionListener{

	public EcouteurBoutonRecords(JButton bouton, JFrame frameFerme) {
		super(bouton, frameFerme);
		bouton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		getFrame().setVisible(false);
		try {
			CadreRecords cp = new CadreRecords("ProjetACL\\src\\ressource\\records.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
