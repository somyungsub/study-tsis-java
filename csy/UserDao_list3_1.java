package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao_list3_1 {

	public void deleteAll() throws SQLException{
		Connection c = dataSource.getConnection();
		
		PreparedStatement ps  = c.prepareStatement("delete from users");
		ps.executeUpdate();
		// ���� �� 
		
		//���������� ���ҽ��� ��ȯ �ؾ���
		ps.close();
		c.close();
	}
}
