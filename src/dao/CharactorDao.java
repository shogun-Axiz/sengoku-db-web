package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Charactor;

public class CharactorDao {

	private static final String SQL_SELECT_ALL = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor";
	private static final String SQL_SELECT_NAME = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE name = ? ";
	private static final String SQL_SELECT_OWNER = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE owner = ? ";
	private static final String SQL_SELECT_WARRIOR = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE warrior = ? ";
	private static final String SQL_SELECT_TYPE = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE type = ? ";
	private static final String SQL_SELECT_NAME_OWNER = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE name = ? AND owner = ?";
	private static final String SQL_SELECT_NAME_WARRIOR = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE name = ? AND warrior = ?";
	private static final String SQL_SELECT_NAME_TYPE = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE name = ? AND type = ?";
	private static final String SQL_SELECT_OWNER_WARRIOR = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE owner = ? AND warrior = ?";
	private static final String SQL_SELECT_OWNER_TYPE = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE owner = ? AND type = ?";
	private static final String SQL_SELECT_WARRIOR_TYPE = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE warrior = ? AND type = ?";
	private static final String SQL_SELECT_NAME_OWNER_WARRIOR = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE name = ? AND owner = ? AND warrior = ?";
	private static final String SQL_SELECT_NAME_OWNER_TYPE = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE name = ? AND owner = ? AND type = ?";
	private static final String SQL_SELECT_NAME_WARRIOR_TYPE = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE name = ? AND warrior = ? AND type = ?";
	private static final String SQL_SELECT_OWNER_WARRIOR_TYPE = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE owner = ? AND warrior = ? AND type = ?";
	private static final String SQL_SELECT_NAME_OWNER_WARRIOR_TYPE = "SELECT charactor_id, name, owner, warrior, type, username FROM charactor WHERE name = ? AND owner = ? AND warrior = ? AND type = ?";
	private static final String SQL_MAX = "SELECT MAX(charactor_id) FROM charactor";
	private static final String SQL_INSERT = "INSERT INTO charactor(charactor_id, name, owner, warrior, type, username) VALUES(?, ?, ?, ?, ?, ?)";
	private static final String SQL_UPDATE_ID = "UPDATE charactor SET name = ?, owner = ?, warrior = ?, type = ?, username = ? WHERE charactor_id = ?";
	private static final String SQL_DELETE_ID = "DELETE FROM charactor WHERE charactor_id = ?";

	private Connection conn;

	public CharactorDao(Connection conn) {
		this.conn = conn;
	}

	public List<Charactor> findAll() {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_ALL)) {

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByName(String charName) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_NAME)) {
			stmt.setString(1, charName);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByOwner(String owner) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_OWNER)) {
			stmt.setString(1, owner);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByWarrior(String warrior) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_WARRIOR)) {
			stmt.setString(1, warrior);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByType(String type) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_TYPE)) {
			stmt.setString(1, type);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByNameAndOwner(String charName, String owner) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_NAME_OWNER)) {
			stmt.setString(1, charName);
			stmt.setString(2, owner);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByNameAndWarrior(String charName, String warrior) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_NAME_WARRIOR)) {
			stmt.setString(1, charName);
			stmt.setString(2, warrior);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByNameAndType(String charName, String type) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_NAME_TYPE)) {
			stmt.setString(1, charName);
			stmt.setString(2, type);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByOwnerAndWarrior(String owner, String warrior) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_OWNER_WARRIOR)) {
			stmt.setString(1, owner);
			stmt.setString(2, warrior);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByOwnerAndType(String owner, String type) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_OWNER_TYPE)) {
			stmt.setString(1, owner);
			stmt.setString(2, type);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByWarriorAndType(String warrior, String type) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_WARRIOR_TYPE)) {
			stmt.setString(1, warrior);
			stmt.setString(2, type);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByNameAndOwnerAndWarrior(String charName, String owner, String warrior) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_NAME_OWNER_WARRIOR)) {
			stmt.setString(1, charName);
			stmt.setString(2, owner);
			stmt.setString(3, warrior);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByNameAndOwnerAndType(String charName, String owner, String type) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_NAME_OWNER_TYPE)) {
			stmt.setString(1, charName);
			stmt.setString(2, owner);
			stmt.setString(3, type);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByOwnerAndWarriorAndType(String owner, String warrior, String type) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_OWNER_WARRIOR_TYPE)) {
			stmt.setString(1, owner);
			stmt.setString(2, warrior);
			stmt.setString(3, type);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<Charactor> findByNameAndOwnerAndWarriorAndType(String charName, String owner, String warrior,
			String type) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_NAME_OWNER_WARRIOR_TYPE)) {
			stmt.setString(1, charName);
			stmt.setString(2, owner);
			stmt.setString(3, warrior);
			stmt.setString(4, type);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}

	public int Id() {
		try (PreparedStatement stmt = conn.prepareStatement(SQL_MAX)){
			ResultSet rs = stmt.executeQuery();
			int userI = 0;
			if(rs.next()) {
				userI = (rs.getInt("max"));
			}
			return userI + 1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public int insert(Charactor charactor) {
		try (PreparedStatement stmt = conn.prepareStatement(SQL_INSERT)){
			stmt.setInt(1, charactor.getCharactor_id());
			stmt.setString(2, charactor.getName());
			stmt.setString(3, charactor.getOwner());
			stmt.setString(4, charactor.getWarrior());
			stmt.setString(5, charactor.getType());
			stmt.setString(6, charactor.getUsername());

			return stmt.executeUpdate();

		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public int update(int id, String newName, String newOwner, String newWarrior, String newType, String username) {
		try(PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE_ID)){
			stmt.setString(1, newName);
			stmt.setString(2, newOwner);
			stmt.setString(3, newWarrior);
			stmt.setString(4, newType);
			stmt.setString(5, username);
			stmt.setInt(6, id);

			return stmt.executeUpdate();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public int delete(int id) {
		try(PreparedStatement stmt = conn.prepareStatement(SQL_DELETE_ID)){
			stmt.setInt(1, id);

			return stmt.executeUpdate();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Charactor> findByNameAndWarriorAndType(String charName, String warrior, String type) {
		List<Charactor> list = new ArrayList<Charactor>();

		try (PreparedStatement stmt = conn.prepareStatement(SQL_SELECT_NAME_WARRIOR_TYPE)) {

			System.out.println(stmt);

			stmt.setString(1, charName);
			stmt.setString(2, warrior);
			stmt.setString(3, type);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Charactor u = new Charactor(rs.getInt("charactor_id"), rs.getString("name"), rs.getString("owner"), rs.getString("warrior"),
						rs.getString("type"), rs.getString("username"));
				list.add(u);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return list;
	}



}
