package inheritance_hybrid;

public class AllRounder extends PlayerData implements Batting,Bowling{
	int noOfWickets;
	public AllRounder() {
		this.name = "Jadeja";
		this.noOfCenturies = 2;
		this.noOfhalfCenturies = 25;
		this.noOfWickets = 125;
		this.totalMatchesPlayed = 90;
		this.workOutTime= 3;
		this.noOfCatches = 50;
	}
	@Override
	public void enterTheGround() {
		System.out.println(this.name+" entering the ground and this is his "+(++totalMatchesPlayed)+" mathch");
		
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
	public void startBowling() {
		System.out.println("The ball is spinning and its wicket for "
				+ ""+this.name+" and its "+(++noOfWickets)+" for "+this.name);
	}
	@Override
	public void setFielding() {
		System.out.println(this.name+" set the fielders very closely");
	}
	@Override
	public void startBatting() {
		System.out.println(this.name+" hits four in the first ball");
		}
	@Override
	public void talkWithNonStriker() {
		System.out.println(this.name+" taking to his partner");
	}
	@Override
	public void catchTheBall() {
		System.out.println("High in the air and "+this.name+" the ball and this is his "+(++this.noOfCatches));
	}
	
}
