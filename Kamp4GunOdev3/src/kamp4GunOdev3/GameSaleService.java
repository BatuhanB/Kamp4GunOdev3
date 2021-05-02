package kamp4GunOdev3;

public interface GameSaleService {
	void sell(Player player,GameCampaign gameCampaign,Game game);
	void refund(Player player,GameCampaign gameCampaign,Game game);
}
