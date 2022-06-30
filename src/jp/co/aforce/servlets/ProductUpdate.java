package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.dao.ProductDAO;
import jp.co.aforce.tool.Message;
import jp.co.aforce.tool.Page;

@WebServlet(urlPatterns = { "/jp.co.aforce.servlets/product-update" })

public class ProductUpdate extends HttpServlet{

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			)throws ServletException, IOException{

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();

		Page.header(out);

		HttpSession session = request.getSession();

		int id = (int) session.getAttribute("id");
		String product_name = request.getParameter("product_name");
		int price = Integer.parseInt(request.getParameter("price"));
		String information = request.getParameter("information");
		ProductDAO dao = new ProductDAO();

		try {


			int line = dao.update(id,product_name,price,information);
			if(line > 0) {
				request.setAttribute("message", Message.I_WKK0006);
				request.getRequestDispatcher("../views/product-update.jsp").forward(request, response);

		} else {
				request.setAttribute("message", Message.E_WKK0009);
				request.getRequestDispatcher("../views/product-update.jsp").forward(request, response);
		}

		} catch (Exception e) {

			e.printStackTrace();
		}

        Page.footer(out);

	}



























}
