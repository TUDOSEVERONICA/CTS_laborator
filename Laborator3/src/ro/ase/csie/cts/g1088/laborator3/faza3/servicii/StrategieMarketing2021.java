package ro.ase.csie.cts.g1088.laborator3.faza3.servicii;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;

public class StrategieMarketing2021 implements InterfataMarketing {
	@Override
	public float getDiscountFidelitate(int vechimeClientInAni) {
		return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100;
	}
	
	@Override
	public void validarePret(float pretInitial) throws ExceptiePretInvalid{
		if(pretInitial<=0) {
			throw new ExceptiePretInvalid();
		}
	}
	
	@Override
	public void validareVechimeClient(int vechimeClientInAni) throws ExceptieVechimeClient{
		
	}
}
