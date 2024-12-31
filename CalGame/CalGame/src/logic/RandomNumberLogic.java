package logic;

import java.util.Random;

public class RandomNumberLogic {
	Random random = new Random();
	private int firstNm = random.nextInt(1000);
	private int secondNm = random.nextInt(1000);

	public int getFirstNm() {
		return firstNm;
	}

	public int getSecondNm() {
		return secondNm;
	}
}