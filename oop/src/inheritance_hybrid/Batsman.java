package inheritance_hybrid;

public class Batsman extends PlayerData implements Batting{
	
	public Batsman() {
		this.name = "Sachin";
		this.noOfCenturies = 99;
		this.noOfhalfCenturies = 77;
		this.totalMatchesPlayed = 225;
		this.workOutTime = 1;
		this.noOfCatches = 112;
	}
	
	@Override
	public void enterTheGround() {
		System.out.println(this.name+" entering the ground crowd is shouting and this is his "+(++this.totalMatchesPlayed)+" mathch");
	}

	@Override
	public void doWorkOut() {
		System.out.println(this.name+" do work out for "+this.workOutTime+" hours a day");
	}

	@Override
	public void doAutoGraphForFans() {
		System.out.println(this.name+" give autograph for his fans");
	}

	@Override
	public void discussStrategyWithPlayers() {
		System.out.println(this.name+" discussing the strategy");		
	}

	@Override
	public void celebrationStyle(String type) {
		System.out.println(this.name+" celebrating in style after the "+type);

	}

	@Override
	public void catchTheBall() {
		System.out.println("It was an edge and catched by "+this.name+" and this is his "+(++this.noOfCatches)+" for him");
}

	@Override
	public void startBatting() {
		System.out.println(this.name+" hits six into the crowd ");		
	}

	@Override
	public void talkWithNonStriker() {
		System.out.println(this.name+" taking to his partner");		
	}
	
}
