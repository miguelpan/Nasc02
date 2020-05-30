package model.dao;

import db.DB;
import model.dao.impl.FuncaoDaoJDBC;
import model.dao.impl.SellerDaoJDBC;
// Fabrica de Dao
public class DaoFactory {
	//SellerDao
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	//FuncaoDao
	public static FuncaoDao createFuncaoDao() {
		return new FuncaoDaoJDBC(DB.getConnection());
	}
}
