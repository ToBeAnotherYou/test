package cn.pan.model.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.pan.model.entity.Admin;

public interface IAdmin {
	ResultSet loginOrLogout(Admin admin) throws SQLException, ClassNotFoundException;//查询用户名和对应密码
}
