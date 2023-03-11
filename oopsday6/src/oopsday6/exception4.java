package oopsday6;
import java.sql.*;

public class exception4 {
	 static void method() throws SQLException {
		
		//DriverManager.getConnection("");
		throw new SQLException("connection failed");
		
	}
public static void main(String[] args)throws SQLException {
	method();
	/*try {
		method();
	}
	catch(SQLException e){
		e.printStackTrace();
		
	}*/
}
}
