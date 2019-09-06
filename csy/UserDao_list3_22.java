package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao_list3_22 {

	private JdbcContext_list3_21 jdbcCtx;
	
	private void setJdbcContext(JdbcContext_list3_21 jdbCtx) {
		this.jdbcCtx = jdbCtx;
	}
	
	public void add(final User user) throws SQLException{
		this.jdbcCtx.workWithStmtStrategy( new StatementStrategy() {
			
			@Override
			public PreparedStatement makePreparedStatement(Connection c) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}
	
	public void deleteAll() throws SQLException{
		this.jdbcCtx.workWithStmtStrategy(new StatementStrategy() {
			
			@Override
			public PreparedStatement makePreparedStatement(Connection c) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}
}
