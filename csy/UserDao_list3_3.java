package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao_list3_3 {

	public int deleteAll() throws SQLException{
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			c = dataSource.getConnection();			
			ps  = c.prepareStatement("select count(*) from users");
			rs = ps.executeQuery();
			rs.next();
			return rs.getInt(1);

		} catch (Exception e) {

			throw e;
			
		}finally {
			//��Ȳ�� ���� ���ҽ��� ��ȯ�ؾ���
			/**
			 * getConnection()����  DB Ŀ�ؼ��� �������� ���� �߻��Ѵٸ�
			 * ���� c�� ps �� null �̹Ƿ� �� ��쿡�� close();�� �ϸ� 
			 * NullPotinterException�� �߻��Ѵ� 
			 */

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e2) {
					throw e2;
				}
			}
			
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
					throw e2;
				}
			}
			
			c.close();
		}
		
	}
}
