package logic;

public class rcpLogic {
	private String rock = "rock";
	private String scissors = "scissors";
	private String paper = "paper";

	public String returnRcpLogic(String user, String com) {
		if ((user.equals(rock) && com.equals(scissors)) || (user.equals(scissors) && com.equals(paper))
				|| (user.equals(paper) && com.equals(rock))) {
			return "win";
		} else if (user.equals(com)) {
			return "draw";
		} else {
			return "lose";
		}
	}
}
