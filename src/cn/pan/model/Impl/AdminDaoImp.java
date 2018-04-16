package cn.pan.model.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import cn.pan.model.Dao.IAdmin;
import cn.pan.model.entity.Admin;
import cn.pan.util.ConnectUtil;

public class AdminDaoImp implements IAdmin {

	//查询用户名和对应密码
	@Override
	public ResultSet loginOrLogout(Admin admin)  throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
		ResultSet count = null;//查询到的数据
		String sqlLogin="select * from Admin where uName=? and pwd=?";
		PreparedStatement presta = null;
		Connection connection = null;
		ConnectUtil connectUtil=new ConnectUtil();
		connection=connectUtil.getConnection();
		presta=(PreparedStatement) connection.prepareStatement(sqlLogin);
		presta.setString(1, admin.getuName());
		presta.setString(2, admin.getpWd());
		count=presta.executeQuery();
		return count;
	}

}
