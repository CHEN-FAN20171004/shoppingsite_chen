package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.dao.MemberDAO;
import jp.co.aforce.tool.Message;

@WebServlet(urlPatterns = { "/jp.co.aforce.servlets/delete" })

public class Delete extends HttpServlet {

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		MemberDAO dao = new MemberDAO();

			try {
				int line = dao.delete(id);

				if(line > 0) {
					request.setAttribute("message", Message.I_WKK0003);
					request.getRequestDispatcher("../views/delete.jsp").forward(request, response);
				}else {
					request.setAttribute("message", Message.E_WKK0004);
					request.getRequestDispatcher("../views/delete.jsp").forward(request, response);
				}
			} catch (Exception e) {

				e.printStackTrace();
			}

		}
}