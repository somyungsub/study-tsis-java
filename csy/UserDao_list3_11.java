package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao_list3_11 {

	
	//���ؽ�Ʈ �޼ҵ�
	public void jdbcContextWithStatementStrategy(StatementStrategy stmt) throws SQLException{
		
		Connection c = null;
		PreparedStatement ps = null;
		
		try {
			c = dataSource.getConnection();
			ps = stmt.makePreparedStatement(c);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			if (ps != null) { try {	ps.close();	} catch (Exception e2) {throw e2;}}

			if (c != null) {try {	c.close();	} catch (Exception e2) {throw e2;}}
		}
	}
	
	
	//Ŭ���̾�Ʈ
	public void deleteAll() throws SQLException{
		StatementStrategy st = new DeleteAllStatement();
		
		//context ȣ��, ���� ������Ʈ ����
		jdbcContextWithStatementStrategy(st);
		// -> ���丮 ���� ���� ���� : 
		//deleteAll�� ������� jdbcContext���� DI���� Ŭ���̾�Ʈ �޼Ҥõ�� �������
	}
}
