package entity;

public class Charactor {

	private int charactor_id;
	private String name;
	private String owner;
	private String warrior;
	private String type;
	private String username;

	public Charactor() {

	}

	public Charactor(int charactor_id,  String name, String owner, String warrior, String type, String username) {
		this.charactor_id = charactor_id;
		this.name = name;
		this.owner = owner;
		this.warrior = warrior;
		this.type = type;
		this.username = username;
	}

	public int getCharactor_id() {
		return charactor_id;
	}

	public void setCharactor_id(int charactor_id) {
		this.charactor_id = charactor_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getWarrior() {
		return warrior;
	}

	public void setWarrior(String warrior) {
		this.warrior = warrior;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
