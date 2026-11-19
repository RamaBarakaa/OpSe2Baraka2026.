package fileCreatorsBaraka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteProductBarakaCsv extends ReaderProductBaraka{

	private BufferedReader ein;
	
	
	public ConcreteProductBarakaCsv() throws IOException{
		this.ein = new BufferedReader(new FileReader("Fahrrad.csv"));
	}

	@Override
	public String[] leseAusdatei() throws IOException {
		String[] zeile = ein.readLine().split(";");
		return zeile;
	}

	@Override
	public void schliesseDatei() throws IOException {
		this.ein.close();
		
	}

}
