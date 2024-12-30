package game.dice.snail.object;

public class Player {
	private String id;
	private String name;
	private String character;
	private String luckyItem;
	private String userDice;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(String id, String name, String character, String luckyItem, String userDice) {
		super();
		this.id = id;
		this.name = name;
		this.character = character;
		this.luckyItem = luckyItem;
		this.userDice = userDice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public String getLuckyItem() {
		return luckyItem;
	}
	public void setLuckyItem(String luckyItem) {
		this.luckyItem = luckyItem;
	}
	public String getUserDice() {
		return userDice;
	}
	public void setUserDice(String userDice) {
		this.userDice = userDice;
	}
	
	
}
