package ro.ase.csie.cts.g1088.memento;

import java.util.List;
import java.util.ArrayList;

public class ManagerIstoric {
	List<MementoSuperErou> salvari=new ArrayList<>();
	
	public void adaugaSalvare(MementoSuperErou memento) {
		this.salvari.add(memento);
	}
	
	public MementoSuperErou getUltimaSalvare() {
		if(this.salvari.size()>0) {
			MementoSuperErou ultimaSalvare=this.salvari.get(this.salvari.size()-1);
			this.salvari.remove(ultimaSalvare);
			return ultimaSalvare;
		}else {
			return null;
		}
	}

}
