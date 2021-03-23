package ro.ase.csie.cts.dp.singletone.refstatica;

public class ConexiuneBD {
	String ip;
	int port;
	String bd;
	
	//referinta catre obiectul unic
	//eager instantiation
	public final static ConexiuneBD conexiune=new ConexiuneBD();
	
	//constructor static al clasei
	//se apeleaza o singura data cand clasa este incarcata de masina virtuala
	static {
		System.out.println("Incarcare clasa de catre JVM");
		System.out.println("Preluare date de configurare aplicatie");
	}
	
	//se executa inainte de fiecare constructor
	{
		System.out.println("Apel constructor");
	}
	
	private ConexiuneBD() {
		//preluare date conexiune din fisiere, servicii web, etc
		System.out.println("Creare conexiune");
	}

}
