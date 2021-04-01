package ro.ase.csie.cts.g1088.dp.factory;

public class CaracterDisney extends CaracterAbstract {
	String culoare;
//	boolean okPentruCopiiMici=true;
	
	public CaracterDisney(String culoare, String nume) {
		super();
		this.nume=nume;
		this.culoare = culoare;
//		this.okPentruCopiiMici=ok;
	}

	@Override
	public void alearga() {
		System.out.println("Alearga....");
		
	}

	@Override
	public void sare() {
		// TODO Auto-generated method stub
		System.out.println("Sare....");
	}
	
}
