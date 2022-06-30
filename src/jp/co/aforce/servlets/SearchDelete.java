package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.Member;
import jp.co.aforce.dao.MemberDAO;
import jp.co.aforce.tool.Message;

@WebServlet(urlPatterns = { "/jp.co.aforce.servlets/search_delete" })

public class SearchDelete extends HttpServlet {

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		MemberDAO dao = new MemberDAO();

			try {
				Member m = dao.searchId(id,password);
				String last_name = m.getLast_name();

				if(last_name != null) {
					session.setAttribute("id", m.getId());
					request.setAttribute("member", m);
					request.getRequestDispatcher("../views/delete.jsp").forward(request, response);
				}else {
					request.setAttribute("message", Message.E_WKK0005);
					request.getRequestDispatcher("../views/delete.jsp").forward(request, response);
				}
			} catch (Exception e) {

				e.printStackTrace();
			}

		}

}
