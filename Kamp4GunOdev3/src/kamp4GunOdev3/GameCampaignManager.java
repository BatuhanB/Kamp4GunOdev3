package kamp4GunOdev3;

public class GameCampaignManager implements GameCampaignService {

	@Override
	public void add(GameCampaign campaign) {
		System.out.println(campaign.getCampaignName() + " için geçerli " +	" %" + campaign.getCampaignRate()
				+ " oranında kampanya eklenmiştir.");
	}

	@Override
	public void update(GameCampaign campaign) {
		System.out.println(campaign.getId() + " id numarasına sahip kampanya bilgileri güncellenmiştir.");
		System.out.println("*********************");
		System.out.println("Kampanya adı: " + campaign.getCampaignName() + "\n" + "Kampanya oranı: %"
				+ campaign.getCampaignRate() + "\n");

	}

	@Override
	public void delete(GameCampaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya başarılı bir şekilde silinmiştir");

	}

}
