package ro.ase.csie.cts.curs3;

public class ExempleConventii {
	public static void testVariabileLogice() {
		boolean esteCorect=true;
		
		if(esteCorect) {
			System.out.println("Este corect");
		}else {
			System.out.println("Este incorect");
		}
	}
	
	public static void initializareVariabilaLogica() {
		int nota=8;
		boolean estePromovat = (nota>=5) ? true:false;
	}
	
	public static void comparareStringuri() {
		String mesajInitial="Totul este ok";
		String raspuns="Totul este ok";
		
		
		if(mesajInitial==raspuns) {
			System.out.println("Mesajele sunt identice");
		}else {
			System.out.println("Mesajele sunt diferite");
		}
		
		raspuns=new String("Totul este ok");
	
		if(mesajInitial==raspuns) {
			System.out.println("Mesajele sunt identice");
		}else {
			System.out.println("Mesajele sunt diferite");
		}
		
		//la stringuri INTOTDEAUNA CU EQUALS, NICIODATA CU ==
		if(mesajInitial.equals(raspuns)) {
			System.out.println("Mesajele sunt identice");
		}else {
			System.out.println("Mesajele sunt diferite");
		}
	}
}
