package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.dao.MemberDAO;
import jp.co.aforce.tool.Message;
import jp.co.aforce.tool.Page;

@WebServlet(urlPatterns = { "/jp.co.aforce.servlets/update" })

public class Update extends HttpServlet {

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			)throws ServletException, IOException{

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();

		Page.header(out);

		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		String password = (String) session.getAttribute("password");
		String last_name = request.getParameter("last_name");
		String first_name = request.getParameter("first_name");
		String sex = request.getParameter("sex");
		int birth_year = Integer.parseInt(request.getParameter("birth_year"));
		int birth_month = Integer.parseInt(request.getParameter("birth_month"));
		int birth_day = Integer.parseInt(request.getParameter("birth_day"));
		String address = request.getParameter("address");
		String phone_number = request.getParameter("phone_number");
		String mail_address = request.getParameter("mail_address");


		MemberDAO dao = new MemberDAO();
		try {


			int line = dao.update(id,password,last_name,first_name,sex,birth_year,birth_month,birth_day,address,phone_number,mail_address);
			if(line > 0) {
				request.setAttribute("message", Message.I_WKK0002);
				request.getRequestDispatcher("../views/update.jsp").forward(request, response);

		} else {
				request.setAttribute("message", Message.E_WKK0003);
				request.getRequestDispatcher("../views/update.jsp").forward(request, response);
		}

		} catch (Exception e) {

			e.printStackTrace();
		}

        Page.footer(out);

	}

}

















