package ro.ase.csie.cts.g1088.laborator.modele;

public abstract class ContBanca extends Cont {
	
	protected double balanta;
	protected String iban;
	
	@Override
	public double getBalanta() {
		return this.balanta;
	}

	public ContBanca(double balanta, String iban) {
		this.balanta = balanta;
		this.iban = iban;
	}
	

}
