package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao_list3_4 {

	public int deleteAll() throws SQLException{\
		/* ������ �ʴ� �κ� */
		Connection c = null;
		PreparedStatement ps = null;
		
		/* ������ �ʴ� �κ� */
		
		
		try {
			ps = c.prepareStatement("insert into users (id, name, password) values (?, ?, ?)");
			ps.setString(1, user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPassword());

		} catch (Exception e) {

			throw e;
			
		}finally {
			/* ������ �ʴ� �κ� */
			
			//��Ȳ�� ���� ���ҽ��� ��ȯ�ؾ���
			/**
			 * getConnection()����  DB Ŀ�ؼ��� �������� ���� �߻��Ѵٸ�
			 * ���� c�� ps �� null �̹Ƿ� �� ��쿡�� close();�� �ϸ� 
			 * NullPotinterException�� �߻��Ѵ� 
			 */
			
			if (ps != null) { try {	ps.close();	} catch (Exception e2) {throw e2;}}

			if (c != null) {try {	c.close();	} catch (Exception e2) {throw e2;}}
			
			/* ������ �ʴ� �κ� */
			
		}
		
	}
}
