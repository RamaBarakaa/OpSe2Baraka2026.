package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import fileCreatorsBaraka.ConcreteCreatorBaraka;
import fileCreatorsBaraka.ConcreteCreatorBarakaTxt;
import fileCreatorsBaraka.ReaderCreatorBaraka;
import fileCreatorsBaraka.ReaderProductBaraka;

public class FahrradModel {
	private Fahrrad fahrrad;

	public Fahrrad getFahrrad() {
		return fahrrad;
	}

	public void setFahrrad(Fahrrad fahrrad) {
		this.fahrrad = fahrrad;
	}
	
	
	 public void leseAusCsvDatei(String typ) throws IOException{
	      		ReaderCreatorBaraka creatorBaraka = new ConcreteCreatorBaraka();
	      		ReaderProductBaraka productBaraka = creatorBaraka.factoryMethod();
	      		
	      			String[] zeile = productBaraka.leseAusdatei();
	      			this.fahrrad = new Fahrrad(zeile[0], 
	      				zeile[1], 
	      				zeile[2], 
	      				zeile[3].charAt(0), 
	      				zeile[4].split("_"));
	      				productBaraka.schliesseDatei();
	      				
		}
	 
	 public void leseAustxtDatei(String typ) throws IOException{
   		ReaderCreatorBaraka creatorBaraka = new ConcreteCreatorBarakaTxt();
   		ReaderProductBaraka productBaraka = creatorBaraka.factoryMethod();
		
   			String[] zeile = productBaraka.leseAusdatei();
   			this.fahrrad = new Fahrrad(zeile[0], 
   				zeile[1], 
   				zeile[2], 
   				zeile[3].charAt(0), 
   				zeile[4].split("_"));
   				productBaraka.schliesseDatei();
   				
	}
			
		public void schreibeFahrraederInCsvDatei() throws IOException {
				BufferedWriter aus 
					= new BufferedWriter(new FileWriter("FahrraederAusgabe.csv", true));
				aus.write(fahrrad.gibFahrradZurueck(';'));
				aus.close();
		}
}
