package logic;

public class CalLogic {
	private int answer = 0;
	public String userInputAnswer(int firstNm, int secondsNm, int userInput) {
		String result = "error";
		this.answer = firstNm * secondsNm;
		if(answer == userInput) {
			result = "right";
		} else {
			result = "wrong";
		}
		return result;
	}
	
	public int getAnswer() {
		return answer;
	}
}
