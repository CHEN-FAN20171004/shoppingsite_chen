package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.Product;

public class ProductDAO extends DAO {

	public List<Product> search(String keyword)
			throws Exception {
		List<Product> list = new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select * from product_info_chen where product_name like ?");
		st.setString(1, "%" + keyword + "%");
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			Product p = new Product();
			p.setProduct_id(rs.getInt("product_id"));
			p.setProduct_name(rs.getString("product_name"));
			p.setPrice(rs.getInt("price"));
			p.setInformation(rs.getString("information"));
			list.add(p);
		}

		st.close();
		con.close();
		return list;
	}

    //商品登録
	public int insert(Product product) throws Exception {
		Connection con = getConnection();


		PreparedStatement st = con.prepareStatement(
				"insert into product_info_chen values(?, ?, ?, ?)");

		st.setInt(1, product.getProduct_id());
		st.setString(2, product.getProduct_name());
		st.setInt(3, product.getPrice());
		st.setString(4, product.getInformation());


		int line = st.executeUpdate();

		st.close();
		con.close();
		return line;
	}

	//商品検索
	public Product searchId (int product_id) throws Exception {
		Connection con = getConnection();

        Product p = new Product();

		PreparedStatement st = con.prepareStatement("select * from product_info_chen where product_id = ? ");
		st.setInt(1, product_id);

		ResultSet rs = st.executeQuery();


		while(rs.next()) {
			p.setProduct_id(product_id);
			p.setProduct_name(rs.getString("product_name"));
			p.setPrice(rs.getInt("price"));
			p.setInformation(rs.getString("information"));
		}

		st.close();
		con.close();

		return p;

	}

	//商品削除
	public int delete(int product_id) throws Exception{
		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement("delete from product_info_chen where product_id = ?");
		st.setInt(1, product_id);

		int line = st.executeUpdate();

		st.close();
		con.close();

		return line;

	}

	//商品更新
	public int update(int product_id, String product_name, int price, String information) throws Exception{

		String sql= "update product_info_chen set product_name=?, price=?, information=? where product_id = ?";
		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(sql);


		st.setString(1, product_name);
		st.setInt(2, price);
		st.setString(3, information);
		st.setInt(4, product_id);


		int line = st.executeUpdate();

		st.close();
		con.close();

		return line;
	}

}
























