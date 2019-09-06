package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao_list3_19 {

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
	
	
	//f���� Ŭ���� + ����Ŭ����
	public void add(User user) throws SQLException{
		
		jdbcContextWithStatementStrategy( new StatementStrategy() {
				
			@Override
			public PreparedStatement makePreparedStatement(Connection c) throws SQLException {

				PreparedStatement ps = c.prepareStatement("insert into users (id, name, password) values (?, ?, ?)");
				ps.setString(1, user.getId());
				ps.setString(2, user.getName());
				ps.setString(3, user.getPassword());
				return ps;
			}
		});
	}
}
