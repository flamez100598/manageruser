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
		// khai báo entity tbl_userEntity
		tbl_userEntity user = null; 
		// bắt lỗi
		try {
			// mở kết nối
			openConnect();
			// lấy giá trị connection sau khi kết nối
			Connection con = (Connection) getConnect();
			// kiểm tra nếu kết nối khác null
			if (con != null) {
				// khởi tạo object tbl_userEntity
				user = new tbl_userEntity();
				// query lấy giá trị login_name, pass, salt
				String sql = "select login_name, pass, salt from manageuser.tbl_user where login_name = ?";
				// tạo statement thực hiện query
				PreparedStatement ps = con.prepareStatement(sql);
				//gắn param cho query
				ps.setString(1, username);
				// khởi tạo biến resultSet để lưu giá trị sau khi thực thi câu query
				ResultSet rs = ps.executeQuery();
				// duyệt biến rs để lấy giá trị
				while (rs.next()) {
					// lưu giá trị login_name lấy được từ db vào biến user
					user.setLogin_name(rs.getString("login_name"));
					// lưu giá trị pass lấy được từ db vào biến user
					user.setPass(rs.getString("pass"));
					// lưu giá trị salt lấy được từ db vào biến user
					user.setSal(rs.getString("salt"));
				}
			// kiểm tra nếu kết nối = null
			} else {
				// in ra console thông báo lỗi
				System.out.println("connect fail");
			}
		} catch (SQLException e1) {
			// in ra ngoại lệ
			e1.printStackTrace();
			// xử lý ngoại lệ
			throw e1;
		// giá trị cuối cùng trả về
		} finally {
			// đóng kết nối
			closeConnect();
			// trả về biến user
			return user;
		}
	}

}
