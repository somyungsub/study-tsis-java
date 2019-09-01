package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoDeleteAll_list3_7 extends UserDao_list3_7{

	protected PreparedStatement makeStatement(Connection c) throws SQLException {

		PreparedStatement ps = c.prepareStatement("delete from users");
		return ps;
	}
}
