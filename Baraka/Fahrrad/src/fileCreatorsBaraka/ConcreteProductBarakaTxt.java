package fileCreatorsBaraka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteProductBarakaTxt extends ReaderProductBaraka{

	private BufferedReader ein;
	
	
	public ConcreteProductBarakaTxt() throws IOException{
		this.ein= new BufferedReader(new FileReader("Buergeramt.txt"));
	}


	public String[] leseAusdatei() throws IOException {
		String[] ergebnisZeile = new String[5];
		String zeile = ein.readLine();
		int i = 0;
		while(i < ergebnisZeile.length) {
			ergebnisZeile[i] = zeile;
			zeile = ein.readLine();
			i++;
		}
		
		return ergebnisZeile;
	}


	public void schliesseDatei() throws IOException {
		this.ein.close();
		
	}

	
	

}
