package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao_list3_6 {

	public int deleteAll() throws SQLException{
		/* ������ �ʴ� �κ� */
		Connection c = null;
		PreparedStatement ps = null;
		/* ������ �ʴ� �κ� */
		
		
		try {
			c = dataSource.getConnection();			
			ps = makeStatement(c);
			
			//�ܼ��޼ҵ� �θ� �� ȣ��

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
	
	private PreparedStatement makeStatement(Connection c) throws SQLException {

		PreparedStatement ps = null;
		ps = c.prepareStatement("delete from users");
		return ps;
	}
}
