package kamp4GunOdev3;

public class GameSaleManager implements GameSaleService {

	@Override
	public void sell(Player player, GameCampaign gameCampaign, Game game) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " isimli oyuncunun " + game.getGameName()
				+ " adlı oyun satın alımı için " + gameCampaign.getCampaignName() + " kapsamında " + game.getGamePrice()
				+ " fiyatı üzerinden " + " %" + gameCampaign.getCampaignRate() + " oranında indirim uygulanmıştır");

	}

	@Override
	public void refund(Player player, GameCampaign gameCampaign, Game game) {
		System.out.println(player.getFirstName() + " isimli oyuncunun talebi üzerine " + game.getGameName()
				+ " adlı oyun iadesi başarılı bir şekilde gerçekleşmiştir.");
	}

}
