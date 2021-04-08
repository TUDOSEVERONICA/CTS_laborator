package ro.ase.csie.cts.g1088.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 creare conexiune
		ConexiuneServerJoc conexiune=new ConexiuneServerJoc();
		conexiune.conectare();
		
		//2. login player
		Player player=new Player();
		player.login(conexiune);
		
		//3. obtinem profilul
		ProfilPlayer profil=player.getProfil();
		
		//4. obtinem datele
		String dateProfil=profil.getProfil();
		
		//prin facade
		String dateprofil2=FacadeAPIJoc.getProfil("player1", "1234");

	}

}
