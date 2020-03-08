/**
 * 
 */
package manageruser.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import manageruser.dao.GroupDao;
import manageruser.entities.mst_groupEntity;

/**
 * @author Admin
 *
 */
public abstract class GroupDaoImpl extends BaseDAOImpl implements GroupDao {

	@Override
	public ArrayList<mst_groupEntity> getListGroup() {
		ArrayList<mst_groupEntity> listGroup = new ArrayList<mst_groupEntity>();
		try {
			openConnect();
			// lấy giá trị connection sau khi kết nối
			Connection con = (Connection) getConnect();
			// kiểm tra nếu kết nối khác null
			if (con != null) {			
				String sql = "SELECT group_id, group_name FROM mst_group order by group_id";
				PreparedStatement ps = con.prepareStatement(sql);
				// khởi tạo biến resultSet để lưu giá trị sau khi thực thi câu query
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					mst_groupEntity item = new mst_groupEntity();
					item.setGroup_id(rs.getInt("group_id"));
					item.setGroup_name(rs.getString("group_name"));
					listGroup.add(item);
				}
			}
		} catch (Exception e) {
			System.out.println("Loi:" + e.getMessage());
			throw e;
		} finally {
			return listGroup;
		}

	}

}
