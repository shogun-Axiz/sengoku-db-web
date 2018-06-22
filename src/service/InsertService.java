package service;

import java.sql.Connection;

import dao.CharactorDao;
import entity.Charactor;
import util.DbUtil;

public class InsertService {

	public int register(Charactor charactor) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.insert(charactor);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public int id() {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.Id();
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}

}
