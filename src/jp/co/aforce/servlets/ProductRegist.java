package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.Product;
import jp.co.aforce.dao.ProductDAO;
import jp.co.aforce.tool.Message;
import jp.co.aforce.tool.Page;

@WebServlet(urlPatterns = { "/jp.co.aforce.servlets/product-regist" })

public class ProductRegist extends HttpServlet{

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			)throws ServletException, IOException{

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();

		Page.header(out);

        int product_id = Integer.parseInt(request.getParameter("product_id"));
        String product_name = request.getParameter("product_name");
        int price = Integer.parseInt(request.getParameter("price"));
        String inforamtion = request.getParameter("information");


        Product p = new Product();
        p.setProduct_id(product_id);
		p.setProduct_name(product_name);
		p.setPrice(price);
		p.setInformation(inforamtion);

		ProductDAO dao = new ProductDAO();
			try {
				dao.insert(p);
				request.setAttribute("message", Message.I_WKK0004);
				request.getRequestDispatcher("../views/product-regist.jsp").forward(request, response);
			}catch(Exception e)  {
				request.setAttribute("message", Message.E_WKK0006);
				request.getRequestDispatcher("../views/product-regist.jsp").forward(request, response);
				e.printStackTrace();
			}


        Page.footer(out);

	}
}

















