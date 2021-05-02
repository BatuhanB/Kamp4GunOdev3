package kamp4GunOdev3;

public class GameCampaign {
	private int id;
	private String campaignName;
	private String campaignRate;
	
	public GameCampaign() {
		
	}
	
	public GameCampaign(int id, String campaignName, String campaignRate) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignRate = campaignRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignRate() {
		return campaignRate;
	}

	public void setCampaignRate(String campaignRate) {
		this.campaignRate = campaignRate;
	}
	
}
