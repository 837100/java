package game.dice.snail.status;

public class Status {
	String who;
	int howgoing;
	
	
	public Status() {
		
	}
	
	
	public Status(String who, int howgoing) {
		super();
		this.who = who;
		this.howgoing = howgoing;
	}
	public String getWho() {
		return who;
	}
	public void setWho(String who) {
		this.who = who;
	}
	public int getHowgoing() {
		return howgoing;
	}
	public void setHowgoing(int howgoing) {
		this.howgoing = howgoing;
	}
	
	
}
