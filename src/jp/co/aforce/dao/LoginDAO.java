package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.UserBean;

public class LoginDAO extends DAO{

	public UserBean search(String id, String password)throws Exception {

		Connection con = getConnection();


		PreparedStatement st;
		st = con.prepareStatement("select * from member_info_chen where id=? and password=?");

		st.setString(1, id);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();

		UserBean userBean = null;

		while (rs.next()) {
			userBean = new UserBean();
			userBean.setLast_name(rs.getString("last_name"));
			userBean.setPassword(rs.getString("password"));

		}
		st.close();
		con.close();
		return userBean;


	}

}
