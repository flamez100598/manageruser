/**
 *  Copy right (C) 2020 Luvina
 * userLogicsImpl.java, Feb 23, 2020 DungPham
 */
package manageruser.logics.impl;

import java.sql.SQLException;



import manageruser.dao.Tbl_UserDao;
import manageruser.dao.impl.Tbl_UserDaoImpl;
import manageruser.entities.tbl_userEntity;
import manageruser.logics.Tbl_UserLogic;
import manageruser.utils.Common;

/**
 * user logic implement
 * @author DungPham
 *
 */
public class Tbl_UserLogicImpl extends Tbl_UserDaoImpl implements Tbl_UserLogic {
	// overright 
	@Override
	/**
	 * init function exist Login
	 * @param username username to check 
	 * @param password pass to check 
	 * @return true if exist user
	 * false if not exist user
	 */
	public boolean existLogin(String username, String password) throws SQLException {
		boolean check = false;
		tbl_userEntity tbl_user;
		try {
			tbl_user = getTblUserByLoginName(username);
			if (tbl_user != null) {
				String passHas = Common.get_SHA_1_SecurePassword(password, tbl_user.getSal());
				System.out.println("pasHas:" +passHas);
				if (Common.CompareString(passHas, tbl_user.getPass())) {
					check = true;
				} else {
					check = false;
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			return check;
		}
	}

}
