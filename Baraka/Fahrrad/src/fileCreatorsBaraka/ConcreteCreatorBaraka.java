package fileCreatorsBaraka;

import java.io.IOException;

public class ConcreteCreatorBaraka extends ReaderCreatorBaraka{

	@Override
	public ReaderProductBaraka factoryMethod() throws IOException {
		
		return new ConcreteProductBarakaCsv();
	}

}
