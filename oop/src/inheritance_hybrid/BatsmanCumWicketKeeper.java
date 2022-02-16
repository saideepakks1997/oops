package inheritance_hybrid;

public class BatsmanCumWicketKeeper extends PlayerData implements WicketKeeping,Batting {
	int totalStumpings;
	public BatsmanCumWicketKeeper() {
		this.name = "Dhoni";
		this.noOfCenturies = 25;
		this.noOfhalfCenturies = 50;
		this.totalMatchesPlayed = 195;
		this.totalStumpings = 210;
		this.workOutTime = 2;
		this.noOfCatches = 110;
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
	public void startBatting() {
		System.out.println(this.name+" hits six in the first ball");
	}

	@Override
	public void talkWithNonStriker() {
		System.out.println(this.name+" taking to his partner");
		
	}

	@Override
	public void catchTheBall() {
		System.out.println("It was an edge and catched by "+this.name+" and this is his "+(++this.noOfCatches)+" for him");
		
	}

	@Override
	public void doStumping() {
		System.out.println("Player steps outs the crease and misses the ball "+this.name+" hits the stump");
		
	}
}
