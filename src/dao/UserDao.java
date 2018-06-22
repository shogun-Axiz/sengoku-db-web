package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.User;

public class UserDao {

	private static final String SQL_SELECT_NAME_AND_PASS = "SELECT username, password FROM users WHERE username = ? AND password = ?";
	private static final String SQL_INSERT_NAME_AND_PASS = "INSERT INTO users (username, password) VALUES( ?, ?)";

	private Connection conn;

	public UserDao(Connection conn) {
		this.conn = conn;
	}

	public User findByNameAndPass(String username, String password) {
		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_NAME_AND_PASS)) {
			stmt.setString(1, username);
			stmt.setString(2, password);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				return new User( rs.getString("username"), rs.getString("password"));
			} else {
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public int registration(User reg) {
		try (PreparedStatement stmt = conn.prepareStatement(SQL_INSERT_NAME_AND_PASS)){
			stmt.setString(1, User.getUsername());
			stmt.setString(2, reg.getPassword());

			return stmt.executeUpdate();

		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
