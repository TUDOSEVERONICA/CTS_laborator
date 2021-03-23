package ro.ase.csie.cts.dp.singletone.refstatica;

public class TestSingletonRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Stare aplicatie");
		ConexiuneBD con1=ConexiuneBD.conexiune;
		ConexiuneBD con2=ConexiuneBD.conexiune;
	}

}
