package kamp4GunOdev3;

public class ValidationManager implements ValidationService{

	@Override
	public boolean iAmNotARobot(Player player) {
		if (player.getNationalityId().length() == 11 ) {
			System.out.println("Kimlik doğrulaması başarılı.");
			return true;
		}
		else
			System.out.println("Kimlik doğrulaması başarısız.");
		return false;
	}
	
	
}
