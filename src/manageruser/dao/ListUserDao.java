/**
 *  Copy right (C) 2020 Luvina
 * Tbl_UserDaoImpl.java, Feb 23, 2020 DungPham
 */
package manageruser.dao;

import java.util.ArrayList;

import manageruser.entities.tbl_userEntity;

/**
 * list user data access interface
 * @author DungPham
 *
 */
public interface ListUserDao {
	/**
	 * get list user from db
	 * @param keyWord key word search by username
	 * @return list user
	 */
	public ArrayList<tbl_userEntity> getListUser(String keyWord);
}
