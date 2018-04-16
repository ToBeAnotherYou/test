package cn.pan.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectUtil {
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String pwd="051577";
		Connection connection=null;
		Class.forName("com.mysql.jdbc.Driver");//com.mysql.jdbc.Driver
		connection=(Connection) DriverManager.getConnection(url, user, pwd);
			
		return connection;
	}
}
