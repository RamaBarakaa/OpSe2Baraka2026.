package fileCreatorsBaraka;

import java.io.IOException;

public abstract class ReaderProductBaraka {

	public abstract String[] leseAusdatei() throws IOException;
	public abstract void schliesseDatei() throws IOException;
}
