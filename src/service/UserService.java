package service;

import java.sql.Connection;

import dao.UserDao;
import entity.User;
import util.DbUtil;

public class UserService {

	public User authentication(String username, String password) {
		try(Connection conn = DbUtil.getConnection()){
			UserDao userDao = new UserDao(conn);
			User user = userDao.findByNameAndPass(username, password);

			return user;
		}catch(Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public int registration(User reg) {
		try (Connection conn = DbUtil.getConnection()) {
			UserDao userDao = new UserDao(conn);
			return userDao.registration(reg);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}



}
