package controleur;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GererFichier {
	
	private String fichierALire;
	
	public GererFichier(String fichierALire) {
		
		this.fichierALire = fichierALire;
		
	}
	
	public String lire() throws FileNotFoundException, IOException {
		

        fichierALire = new File(fichierALire).getAbsolutePath();
 
		
		try(BufferedReader br = new BufferedReader(new FileReader(fichierALire))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		    
		        sb.append(line+"<br>");
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = "<html>" +sb.toString() + "</html>";
		    
		    
		    return everything;
		    
		}
		
	}
	
	public void EcrireFichier(String str) throws IOException {
		
		try{   

	        File file =new File(this.fichierALire);    

	        //if file doesnt exists, then create it    
	        if(!file.exists()){    
	            file.createNewFile();    
	            System.out.println("New File Created Now");    
	        }    

	        //true = append file    
	            FileWriter fileWritter = new FileWriter(file,true);        
	            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
	            bufferWritter.write("<br>" + str);
	            bufferWritter.close();
	            fileWritter.close(); 

	    }catch(Exception e){    
	        e.printStackTrace();    
	    }    
		
	}

}
