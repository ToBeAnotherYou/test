package cn.pan.model.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import cn.pan.model.Impl.AdminDaoImp;
import cn.pan.model.entity.Admin;

public class LoginMoelService {
	public boolean Login(Admin admin) throws SQLException, ClassNotFoundException{
		boolean check=false;
		AdminDaoImp adminDaoImp=new AdminDaoImp();
		ResultSet resultSet;
		resultSet=adminDaoImp.loginOrLogout(admin);
		System.out.println(resultSet);
		check=resultSet.next();
		resultSet.close();
		System.out.println(check);
		return check;
	}
}
