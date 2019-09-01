package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface StatementStrategy {

	//클래스 레벨에서는 인터페이스를 통해서만 의존하도록 만드는 전략패턴
	PreparedStatement makePreparedStatement(Connection c) throws SQLException;
}
