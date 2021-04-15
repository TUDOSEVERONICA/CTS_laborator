package ro.ase.csie.cts.g1088.dp.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		//mereu le gestionam prin clasa de baza
		SuperErou dragon=new Dragon("Dragonul albastru",1000);
		dragon.alearga();
		dragon.esteLovit(800);
		dragon.seVindeca(100);
		
		SuperErou dragon2=new Dragon("Dragonul galben",1000);
		dragon2.alearga();
		dragon2.esteLovit(200);
		dragon2.seVindeca(100);
		
		//aplicam decoratori pe primul dragon
		//nu e dinamic, nu folosim asa
		//SuperErou dragonCuArmura=new DecoratorArmura(dragon, 300);
		//dragonCuArmura.esteLovit(400);
		
		dragon=new DecoratorArmura(dragon, 300);
		dragon.esteLovit(400);
		
		dragon=new DecoratosEsteRanit(dragon);
		dragon.esteLovit(400);
		dragon.alearga();
	}

}
