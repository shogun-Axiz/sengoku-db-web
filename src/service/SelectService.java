package service;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;

import dao.CharactorDao;
import entity.Charactor;
import util.DbUtil;

public class SelectService {

	public static List<Charactor> authentication(String charName) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByName(charName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication2(String owner) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByOwner(owner);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication3(String warrior) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByWarrior(warrior);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication4(String type) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByType(type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication5(String charName, String owner) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndOwner(charName, owner);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication6(String charName, String warrior) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndWarrior(charName, warrior);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication7(String charName, String type) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndType(charName, type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication8(String owner, String warrior) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByOwnerAndWarrior(owner, warrior);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication9(String owner, String type) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByOwnerAndType(owner, type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication10(String warrior, String type) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByWarriorAndType(warrior, type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication11(String charName, String owner, String warrior) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndOwnerAndWarrior(charName, owner, warrior);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication12(String charName, String owner, String type) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndOwnerAndType(charName, owner, type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication13(String owner, String warrior, String type) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByOwnerAndWarriorAndType(owner, warrior, type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication14(String charName, String owner, String warrior, String type) {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndOwnerAndWarriorAndType(charName, owner, warrior, type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Charactor> authentication15(String charName, String warrior, String type) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndWarriorAndType(charName, warrior, type);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> find() {
		try (Connection conn = DbUtil.getConnection()) {
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Collections.emptyList();
	}

	public List<Charactor> findForName(String charName) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByName(charName);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForOwner(String owner) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByOwner(owner);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForWarrior(String warrior) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByWarrior(warrior);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForType(String type) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByType(type);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForNameAndOwner(String charName, String owner) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndOwner(charName, owner);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForNameAndWarrior(String charName, String warrior) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndWarrior(charName, warrior);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForNameAndType(String charName, String type) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndType(charName, type);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForOwnerAndWarrior(String owner, String warrior) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByOwnerAndWarrior(owner, warrior);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForOwnerAndType(String owner, String type) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByOwnerAndType(owner, type);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForWarriorAndType(String warrior, String type) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByWarriorAndType(warrior, type);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForNameAndOwnerAndWarrior(String charName, String owner, String warrior) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndOwnerAndWarrior(charName, owner, warrior);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForNameAndOwnerAndType(String charName, String owner, String type) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndOwnerAndType(charName, owner, type);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForNameAndWarriorAndType(String charName, String warrior, String type) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndWarriorAndType(charName, warrior, type);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForOwnerAndWarriorAndType(String owner, String warrior, String type) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByOwnerAndWarriorAndType(owner, warrior, type);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Charactor> findForNameAndOwnerAndWarriorAndType(String charName, String owner, String warrior, String type) {
		try(Connection conn = DbUtil.getConnection()){
			CharactorDao charDao = new CharactorDao(conn);
			return charDao.findByNameAndOwnerAndWarriorAndType(charName, owner, warrior, type);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}





}
