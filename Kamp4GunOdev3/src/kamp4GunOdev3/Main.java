package kamp4GunOdev3;

public class Main {

	public static void main(String[] args) {
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Counter-Strike Global Offensive");
		game1.setGameprice(77.50);
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("Worl Rally Champions 7");
		game2.setGameprice(56.75);
		
		Player player1 = new Player();
		player1.setId(1);
		player1.setFirstName("Batuhan");
		player1.setLastName("BALI");
		player1.setDateOfBirth(" 1999.12.20");
		player1.setNationalityId("11122233344");
		
		GameCampaign gameCampaign = new GameCampaign();
		gameCampaign.setId(1);
		gameCampaign.setCampaignName("Oynamayan Kalmasın");
		gameCampaign.setCampaignRate("40");
		
		PlayerManager playerManager = new PlayerManager(new ValidationManager());
		playerManager.register(player1);
		System.out.println();
		playerManager.update(player1);
		System.out.println();
		playerManager.delete(player1);
		System.out.println();
		
		GameCampaignManager gameCampaignManager = new GameCampaignManager();
		gameCampaignManager.add(gameCampaign);
		System.out.println();
		gameCampaignManager.update(gameCampaign);
		System.out.println();
		gameCampaignManager.delete(gameCampaign);
		System.out.println();
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sell(player1, gameCampaign, game1);
		System.out.println();
		gameSaleManager.refund(player1, gameCampaign, game1);
		System.out.println();
		
		

	}

}
