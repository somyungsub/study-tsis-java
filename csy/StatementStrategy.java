package chapter3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface StatementStrategy {

	//Ŭ���� ���������� �������̽��� ���ؼ��� �����ϵ��� ����� ��������
	PreparedStatement makePreparedStatement(Connection c) throws SQLException;
}
