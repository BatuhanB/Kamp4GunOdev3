package kamp4GunOdev3;

public class PlayerManager implements PlayerService{
	private ValidationManager validationManager;

	public PlayerManager(ValidationManager validationManager) {
		this.validationManager = validationManager;
	}
	
	@Override
	public void register(Player player) {
		if (validationManager.iAmNotARobot(player) == true) {
			System.out.println(
					player.getFirstName() + " " + player.getLastName() + " kaydınız başarılı bir şekilde tamamlandı.");
		}else
			System.out.println("Kayıt tamamlama işlemi yapılamadı.");
		
	}

	@Override
	public void update(Player player) {
		if (validationManager.iAmNotARobot(player) == true) {
			System.out.println(player.getId() + " id numarasına sahip oyuncunun bilgileri güncellenmiştir.");
			System.out.println("*********************");
			System.out.println("Ad: " + player.getFirstName() + "\n" + "Soyisim: " + player.getLastName() + "\n"
					+ "Doğum tarihi: " + player.getDateOfBirth() + "\n" + "TC Kimlik Numarası: " + player.getNationalityId());
		}else
			System.out.println("Kayıt güncellemesi yapılamadı.");
		
	}

	@Override
	public void delete(Player player) {
		if (validationManager.iAmNotARobot(player) == true) {
			System.out.println(
					player.getFirstName() + " " + player.getLastName() + " kaydınız başarılı bir şekilde silindi.");
		}else
			System.out.println("Kayıt silme işlemi yapılamadı.");
		
	}
	
	
}
