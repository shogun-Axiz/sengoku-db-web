package entity;

public class User {
	private static String username;
	private String password;

	public User() {

	}

	public User(String username, String password) {
		User.username = username;
		this.password = password;
	}

	public static String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		User.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
