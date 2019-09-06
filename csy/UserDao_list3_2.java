package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao_list3_2 {

	public void deleteAll() throws SQLException{
		Connection c = null;
		PreparedStatement ps = null;
		
		try {
			c = dataSource.getConnection();
			
			ps  = c.prepareStatement("delete from users");
			ps.executeUpdate();
		
		} catch (Exception e) {

			throw e;
			
		}finally {
			//��Ȳ�� ���� ���ҽ��� ��ȯ�ؾ���
			/**
			 * getConnection()����  DB Ŀ�ؼ��� �������� ���� �߻��Ѵٸ�
			 * ���� c�� ps �� null �̹Ƿ� �� ��쿡�� close();�� �ϸ� 
			 * NullPotinterException�� �߻��Ѵ� 
			 */
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
