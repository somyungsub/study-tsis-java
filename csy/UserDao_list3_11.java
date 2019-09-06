package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao_list3_11 {

	
	//컨텍스트 메소드
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
	
	
	//클라이언트
	public void deleteAll() throws SQLException{
		StatementStrategy st = new DeleteAllStatement();
		
		//context 호출, 전략 오브젝트 전달
		jdbcContextWithStatementStrategy(st);
		// -> 팩토리 역할 생성 전담 : 
		//deleteAll은 상관없이 jdbcContext에서 DI동작 클라이언트 메소ㅓ드와 상관없음
	}
}
