/**
 *  Copy right (C) 2020 Luvina
 * Tbl_UserDaoImpl.java, Feb 23, 2020 DungPham
 */
package manageruser.dao;

import java.sql.SQLException;

import manageruser.entities.tbl_userEntity;

/**
 * Description
 * @author DungPham
 *
 */
public interface Tbl_UserDao {
	/**
	 * get user by login_name
	 * @param
	 * @return tbl_userEntity
	 * @throws Exception 
	 */
	public tbl_userEntity getTblUserByLoginName(String username) throws SQLException, Exception;
}
