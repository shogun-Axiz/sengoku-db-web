package service;

import java.sql.Connection;

import dao.CharactorDao;
import util.DbUtil;

public class DeleteService {

	public int delete(int id) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

}
