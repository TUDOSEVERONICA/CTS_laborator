package ro.ase.csie.cts.g1088.dp.factory;

import java.util.ArrayList;

public abstract class TestFactory {

	public static void main(String[] args) {
//		CaracterDisney mickeyMouse=new CaracterDisney("rosu", "Mickey Mouse");
//		CaracterMarvel spiderMan=new CaracterMarvel("Spiderman", 100);
		
		CaracterAbstract mickeyMouse=FactoryCaractere.getCaracter(TipCaracter.DISNEY, "Mickey Mouse");
		ArrayList<CaracterAbstract> caractere=new ArrayList<>();
	}

}
