/**
 *  Copy right (C) 2020 Luvina
 * UserDAO.java, Feb 23, 2020 DungPham
 */
package manageruser.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import manageruser.entities.tbl_userEntity;
import manageruser.dao.BaseDao;
import manageruser.dao.Tbl_UserDao;
/**
 * User data access 
 * @author DungPham
 *
 */
public abstract class Tbl_UserDaoImpl extends BaseDAOImpl implements Tbl_UserDao {
	// overright 
	@Override
	public tbl_userEntity getTblUserByLoginName(String username) throws Exception {
		// TODO Auto-generated method stub
		tbl_userEntity user = null; 
		try {
			openConnect();
			Connection con = (Connection) getConnect();
			if (con != null) {
				user = new tbl_userEntity();
				String sql = "select login_name, pass, salt from manageuser.tbl_user where login_name = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, username);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					user.setLogin_name(rs.getString("login_name"));
					user.setPass(rs.getString("pass"));
					user.setSal(rs.getString("salt"));
				}
				return user;
			} else {
				System.out.println("connect fail");
				closeConnect();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw e1;
		} finally {
			closeConnect();
		}
		return user;
	}

}
