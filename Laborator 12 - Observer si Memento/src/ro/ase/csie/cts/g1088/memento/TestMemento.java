package ro.ase.csie.cts.g1088.memento;

public class TestMemento {

	public static void main(String[] args) {
		ManagerIstoric istoric=new ManagerIstoric();
		
		SuperErou superman=new SuperErou("SuperMan", 100, "Zboara");
		istoric.adaugaSalvare(superman.salvare());
		
		superman.esteLovit(10);
		superman.esteLovit(50);
		
		System.out.println("Puncte viata: "+superman.puncteViata);
		
		superman.incarcaSalvare(istoric.getUltimaSalvare());
		
		System.out.println("Puncte viata: "+superman.puncteViata);

	}

}
