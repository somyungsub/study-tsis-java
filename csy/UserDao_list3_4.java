package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao_list3_4 {

	public int deleteAll() throws SQLException{\
		/* 변하지 않는 부분 */
		Connection c = null;
		PreparedStatement ps = null;
		
		/* 변하지 않는 부분 */
		
		
		try {
			ps = c.prepareStatement("insert into users (id, name, password) values (?, ?, ?)");
			ps.setString(1, user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPassword());

		} catch (Exception e) {

			throw e;
			
		}finally {
			/* 변하지 않는 부분 */
			
			//상황에 따라 리소스를 반환해야함
			/**
			 * getConnection()에서  DB 커넥션을 가져오다 에러 발생한다면
			 * 아직 c와 ps 는 null 이므로 이 경우에도 close();를 하면 
			 * NullPotinterException이 발생한다 
			 */
			
			if (ps != null) { try {	ps.close();	} catch (Exception e2) {throw e2;}}

			if (c != null) {try {	c.close();	} catch (Exception e2) {throw e2;}}
			
			/* 변하지 않는 부분 */
			
		}
		
	}
}
