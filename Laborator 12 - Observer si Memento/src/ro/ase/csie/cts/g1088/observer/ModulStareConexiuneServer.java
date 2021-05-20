package ro.ase.csie.cts.g1088.observer;

import java.util.ArrayList;
import java.util.List;

public class ModulStareConexiuneServer {
	List<InterfataStatusConexiuneServer>module=new ArrayList<>();
	
	public void register(InterfataStatusConexiuneServer modul) {
		this.module.add(modul);
	}
	
	public void unregister(InterfataStatusConexiuneServer modul) {
		this.module.remove(modul);
	}
	
	public void detectieSchimbareStareConexiune(StareConexiune stare) {
		if(stare==StareConexiune.ACTIVA) {
			for(InterfataStatusConexiuneServer modul:module) {
				modul.conexiuneIntrerupta();
			}
		}
	}

}
