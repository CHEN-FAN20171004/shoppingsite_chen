package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.Product;
import jp.co.aforce.dao.ProductDAO;
import jp.co.aforce.tool.Page;


@WebServlet(urlPatterns = { "/jp.co.aforce.servlets/shop-search" })

public class ShopSearch extends HttpServlet{

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			)throws ServletException, IOException{

		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();

        Page.header(out);

        try {
        	//ブラウザからの入力値取得
        	String keyword=request.getParameter("keyword");
        	//ProductDAOのインスタンス化
        	ProductDAO dao=new ProductDAO();
        	//入力値を引数としてsearchメソッドを呼ぶだし、戻り値をListで取得
        	List<Product> list=dao.search(keyword);

        	for (Product p : list) {
        		out.println(p.getProduct_id());
        		out.println(":");
        		out.println(p.getProduct_name());
        		out.println(":");
        		out.println(p.getPrice());
        		out.println(":");
        		out.println(p.getInformation());
        		out.println(":");
        		out.println("<br>");
        	}

        }catch (Exception e) {
        	e.printStackTrace(out);
        }


        Page.footer(out);

	}

}
