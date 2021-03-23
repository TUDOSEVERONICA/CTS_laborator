package ro.ase.csie.cts.dp.singleton.registru;

import java.util.HashMap;

import ro.ase.csie.cts.dp.singleton.registru.ConexiuneBD;

public class ConexiuneBD {
	String ip;
	int port;
	String bd;

	private static HashMap<String,ConexiuneBD>registruConexiuni=new HashMap<>();
	
	public ConexiuneBD(String ip, int port, String bd) {
			this.ip = ip;
			this.port = port;
			this.bd = bd;
	}
	
	public static ConexiuneBD getConexiune(String ip, int port, String bd) {
		ConexiuneBD conexiune=registruConexiuni.get(ip);
		if(conexiune==null) {
			conexiune=new ConexiuneBD(ip,port,bd);
			registruConexiuni.put(ip,conexiune);
		}
		return conexiune;
	}
}
