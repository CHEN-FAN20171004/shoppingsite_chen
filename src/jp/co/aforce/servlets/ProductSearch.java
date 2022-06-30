package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.Product;
import jp.co.aforce.dao.ProductDAO;
import jp.co.aforce.tool.Message;

@WebServlet(urlPatterns = { "/jp.co.aforce.servlets/product-search" })

public class ProductSearch extends HttpServlet{
	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			)throws ServletException, IOException{

		HttpSession session = request.getSession();

		int product_id = Integer.parseInt(request.getParameter("product_id"));

		ProductDAO dao = new ProductDAO();
		try {
			Product p = dao.searchId(product_id);
			String product_name = p.getProduct_name();

			if(product_name != null) {
				session.setAttribute("id", p.getProduct_id());
				request.setAttribute("product", p);
				request.getRequestDispatcher("../views/product-delete.jsp").forward(request, response);
			}else {
				request.setAttribute("message", Message.E_WKK0008);
				request.getRequestDispatcher("../views/product-delete.jsp").forward(request, response);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}


	}

}
