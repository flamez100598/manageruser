package manageruser.logics;

/**
 *  Copy right (C) 2020 Luvina
 * userLogicsImpl.java, Feb 23, 2020 DungPham
 */
import java.sql.SQLException;

/**
 * user logic implement
 * @author DungPham
 *
 */
public interface Tbl_UserLogic {
	/**
	 * init function exist Login
	 * @param username username to check 
	 * @param password pass to check 
	 * @return true if exist user
	 * false if not exist user
	 * @throws SQLException 
	 */
	public boolean existLogin(String username, String password) throws SQLException;
}
