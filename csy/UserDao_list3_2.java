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
			//상황에 따라 리소스를 반환해야함
			/**
			 * getConnection()에서  DB 커넥션을 가져오다 에러 발생한다면
			 * 아직 c와 ps 는 null 이므로 이 경우에도 close();를 하면 
			 * NullPotinterException이 발생한다 
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
