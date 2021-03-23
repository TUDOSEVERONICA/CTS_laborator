package ro.ase.csie.cts.dp.singleton.enumerare;

public enum ConexiuneDb {
	CONEXIUNE;
	
	String ip;
	int port;
	String bd;
	
	private ConexiuneDb(){
		ip= "127.0.0.1";
		port=1443;
		bd="cts";
	}
}
