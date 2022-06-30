package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.dao.ProductDAO;
import jp.co.aforce.tool.Message;


@WebServlet(urlPatterns = { "/jp.co.aforce.servlets/product-delete" })

public class ProductDelete extends HttpServlet{

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {

		HttpSession session = request.getSession();
		int id = (int) session.getAttribute("id");
		ProductDAO dao = new ProductDAO();

		try {
			int line = dao.delete(id);

			if(line > 0) {
				request.setAttribute("message", Message.I_WKK0005);
				request.getRequestDispatcher("../views/product-delete.jsp").forward(request, response);
			}else {
				request.setAttribute("message", Message.E_WKK0007);
				request.getRequestDispatcher("../views/product-delete.jsp").forward(request, response);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
