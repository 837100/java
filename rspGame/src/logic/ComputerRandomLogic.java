package logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComputerRandomLogic {
	private String comResult = "";

	public ComputerRandomLogic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComputerRandomLogic(String comResult) {
		super();
		this.comResult = comResult;
	}

	public String getComResult() {
		return comResult;
	}

	public void setComResult(String comResult) {
		List<String> rsp = Arrays.asList("rock", "scissers", "paper");
		Collections.shuffle(rsp);
		this.comResult = rsp.get(1);
	}

}
