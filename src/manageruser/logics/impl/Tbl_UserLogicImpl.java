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
	 * @param username username to check input from client
	 * @param password pass to check input from client
	 * @return true if exist user
	 * false if not exist user
	 */
	public boolean existLogin(String username, String password) throws SQLException {
		// khởi tạo biến check
		boolean check = false;
		// khai báo biến tbl_user 
		tbl_userEntity tbl_user;
		// kiểm tra ngoại lệ 
		try {
			// gắn giá trị cho biến tbl_user
			tbl_user = getTblUserByLoginName(username);
			// kiểm tra nếu tbl_user khác null
			if (tbl_user != null) {
				// khởi tạo biến pasHas được mã hóa từ password nhập từ bàn phím 
				String passHas = Common.get_SHA_1_SecurePassword(password, tbl_user.getSal());
				System.out.println("pasHas:" +passHas);
				// So sánh pasHas với mật khẩu lấy từ trong db
				if (Common.CompareString(passHas, tbl_user.getPass())) {
					// nếu bằng nhau gán check = true
					check = true;
				} else {
					// nếu khác nhau gán check = false
					check = false;
				}
			// kết thúc kiểm tra tbl_user khác null
			}
		// xử lý ngoại lệ
		} catch (SQLException e) {
			// in ra màn console ngoại lệ
			System.out.println(e.getMessage());
			// ném ngoại lệ để sau xử lý
			throw e;
		} finally {
			// trả về kết quả kiểm tra
			return check;
		}
	}

}
