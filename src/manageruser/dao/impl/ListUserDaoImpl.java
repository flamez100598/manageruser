/**
 *  Copy right (C) 2020 Luvina
 * ListUserDaoImpl.java, Feb 23, 2020 DungPham
 */
package manageruser.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import manageruser.dao.ListUserDao;
import manageruser.entities.tbl_userEntity;

/**
 * list user data access 
 * @author DungPham
 *
 */
public abstract class ListUserDaoImpl extends BaseDAOImpl implements ListUserDao {
	/**
	 * get user by login_name
	 * @param username username need check
	 * @return tbl_userEntity
	 * @throws Exception 
	 */
	@Override
	public ArrayList<tbl_userEntity> getListUser(String keyWord) {
		// khai báo entity mảng chứa các user
		ArrayList<tbl_userEntity> listUser = null;
		// bắt lỗi
		try {
			// mở kết nối
			openConnect();
			// lấy giá trị connection sau khi kết nối
			Connection con = (Connection) getConnect();
			// kiểm tra nếu kết nối khác null
			if (con != null) {
				// khởi tạo object tbl_userEntity
				tbl_userEntity user = new tbl_userEntity();
				// query lấy giá trị login_name, pass, salt
				StringBuilder sql = new StringBuilder();
				sql.append("SELECT tu.user_id, tu.full_name, birthday, mg.group_name, email, tel, mj.name_level, tduj.end_date, tduj.total FROM tbl_user tu");
				sql.append(" INNER JOIN mst_group mg ON tu.group_id=mg.group_id");
				sql.append(" LEFT JOIN tbl_detail_user_japan tduj ON tduj.user_id = tu.user_id");
				sql.append(" LEFT JOIN mst_japan mj ON mj.code_level = tduj.code_level");
				sql.append(" WHERE tu.rule = 1 ");
				if ("".equals(keyWord)) {
					sql.append(" tu.full_name LIKE ?");
				}
				sql.append(" ORDER BY tu.full_name ASC, mj.name_level ASC, tduj.end_date DESC");
				// tạo statement thực hiện query
				PreparedStatement ps = con.prepareStatement(sql.toString());
				if ("".equals(keyWord)) {
					//gắn param cho query
					ps.setString(1, keyWord);
				}
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
			return listUser;
		}

	}

}
