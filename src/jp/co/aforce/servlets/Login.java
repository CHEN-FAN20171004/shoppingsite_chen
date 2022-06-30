package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.UserBean;
import jp.co.aforce.dao.LoginDAO;
import jp.co.aforce.tool.Page;

@WebServlet(urlPatterns={"/jp.co.aforce.servlets/login"})

public class Login extends HttpServlet{

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			)throws ServletException, IOException{

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();

		Page.header(out);

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		LoginDAO dao = new LoginDAO();
		UserBean userBean = new UserBean();

		try {

			userBean = dao.search(id,password);

			if(userBean!=null) {
				request.setAttribute("userBean", userBean);
				request.getRequestDispatcher("../views/login-in.jsp").forward(request, response);
			}else {
				request.setAttribute("error_msg", "IDまたはPASSWORDが違います。");
				request.setAttribute("id", id);
				request.getRequestDispatcher("../views/login.jsp").forward(request, response);
			}


		}catch (Exception e) {
			e.printStackTrace(out);
		}

		Page.footer(out);
	}

}
