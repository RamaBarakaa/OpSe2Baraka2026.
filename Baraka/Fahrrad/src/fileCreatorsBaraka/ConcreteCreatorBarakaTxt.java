package fileCreatorsBaraka;

import java.io.IOException;

public class ConcreteCreatorBarakaTxt extends ReaderCreatorBaraka{

	@Override
	public ReaderProductBaraka factoryMethod() throws IOException {
		return new ConcreteProductBarakaTxt();
	}

	

}
