package service;

import java.sql.Connection;

import dao.CharactorDao;
import util.DbUtil;

public class UpdateService {

	public int update(int id, String newName, String newOwner, String newWarrior, String newType, String username) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.update(id, newName, newOwner, newWarrior, newType, username);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

}
