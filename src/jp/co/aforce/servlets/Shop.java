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

@WebServlet(urlPatterns = { "/jp.co.aforce.servlets/shoplist" })

public class Shop extends HttpServlet{

	public void doGet(
			HttpServletRequest request, HttpServletResponse response
			)throws ServletException, IOException{

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("UTF-8");

		try {

			ProductDAO dao=new ProductDAO();
			List<Product> list=dao.search("");

			request.setAttribute("list", list);

			request.getRequestDispatcher("../views/shoplist.jsp").forward(request, response);

		}catch (Exception e) {
			e.printStackTrace(out);
		}

	}

}










