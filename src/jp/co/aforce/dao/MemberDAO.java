package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.Member;

public class MemberDAO extends DAO{

	public List<Member> search(String keyword)
			throws Exception {
		List<Member> list = new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select * from Member where id = ?");
		st.setString(1, "%" + keyword + "%");
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			Member p = new Member();
			p.setId(rs.getString("id"));
			p.setPassword(rs.getString("password"));
			p.setLast_name(rs.getString("last_name"));
			p.setFirst_name(rs.getString("first_name"));
			p.setSex(rs.getString("sex"));
			p.setBirth_year(rs.getInt("birth_year"));
			p.setBirth_month(rs.getInt("birth_month"));
			p.setBirth_day(rs.getInt("birth_day"));
			p.setAddress(rs.getString("address"));
			p.setPhone_number(rs.getString("phone_number"));
			p.setMail_address(rs.getString("mail_address"));
			list.add(p);
		}

		st.close();
		con.close();
		return list;
	}


	//重複した会員が存在しないかをチェック
	public int search(String id, String password, String last_name, String first_name, String sex, int birth_year,
			int birth_month, int birth_day, String address, String phone_number, String mail_address)
					throws Exception {

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"select count(*) from member_info_chen where id=? and password=? and last_name=? and first_name=? and sex=? and birth_year=? and birth_month=? and birth_day=? and address=? and phone_number=? and mail_address=? ");
		st.setString(1, id);
		st.setString(2, password);
		st.setString(3, last_name);
		st.setString(4, first_name);
		st.setString(5, sex);
		st.setInt(6, birth_year);
		st.setInt(7, birth_month);
		st.setInt(8, birth_day);
		st.setString(9, address);
		st.setString(10, phone_number);
		st.setString(11, mail_address);
		ResultSet rs = st.executeQuery();


		int count = 0;
		while (rs.next()) {

			count = rs.getInt("count(*)");

		}
		st.close();
		con.close();
		return count;
	}

	//新規会員登録
	public int insert(Member member) throws Exception {
		Connection con = getConnection();


		PreparedStatement st = con.prepareStatement(
				"insert into member_info_chen values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

		st.setString(1, member.getId());
		st.setString(2, member.getPassword());
		st.setString(3, member.getLast_name());
		st.setString(4, member.getFirst_name());
		st.setString(5, member.getSex());
		st.setInt(6, member.getBirth_year());
		st.setInt(7, member.getBirth_month());
		st.setInt(8, member.getBirth_day());
		st.setString(9, member.getAddress());
		st.setString(10, member.getPhone_number());
		st.setString(11, member.getMail_address());


		int line = st.executeUpdate();

		st.close();
		con.close();
		return line;
	}

	//会員IDで会員を検索
	public Member searchId (String id, String password) throws Exception {
		Connection con = getConnection();

		Member m = new Member();

		PreparedStatement st = con.prepareStatement("select * from member_info_chen where id = ? and password = ?");
		st.setString(1, id);
		st.setString(2, password);

		ResultSet rs = st.executeQuery();


		while(rs.next()) {
			m.setId(id);
			m.setPassword(password);
			m.setLast_name(rs.getString("last_name"));
			m.setFirst_name(rs.getString("first_name"));
			m.setSex(rs.getString("sex"));
			m.setBirth_year(Integer.parseInt(rs.getString("birth_year")));
			m.setBirth_month(Integer.parseInt(rs.getString("birth_month")));
			m.setBirth_day(Integer.parseInt(rs.getString("birth_day")));
			m.setAddress(rs.getString("address"));
			m.setPhone_number(rs.getString("phone_number"));
			m.setMail_address(rs.getString("mail_address"));
		}

		st.close();
		con.close();

		return m;

	}


	//会員情報削除
	public int delete(String id) throws Exception{
		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement("delete from member_info_chen where id = ?");
		st.setString(1, id);

		int line = st.executeUpdate();

		st.close();
		con.close();

		return line;

	}

	//会員情報更新
	public int update (String id, String password, String last_name, String first_name, String sex, int birth_year,
			int birth_month, int birth_day, String address, String phone_number, String mail_address)
					throws Exception {
        String sql= "update member_info_chen set last_name=?, first_name=?, sex=?, birth_year=?, birth_month=?, birth_day=?, address=?, phone_number=?, mail_address=? where id = ? and password = ?";
		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(sql);


		st.setString(1, last_name);
		st.setString(2, first_name);
		st.setString(3, sex);
		st.setInt(4, birth_year);
		st.setInt(5, birth_month);
		st.setInt(6, birth_day);
		st.setString(7, address);
		st.setString(8, phone_number);
		st.setString(9, mail_address);
		st.setString(10, id);
		st.setString(11, password);

		int line = st.executeUpdate();

		st.close();
		con.close();

		return line;
	}





}

























