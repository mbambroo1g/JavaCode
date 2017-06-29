package com.fannie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");

		// assuming you connect to db
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		if (userName.equals("fannie") && password.equals("reston")) {
			request.getRequestDispatcher("SuccessServlet").forward(request, response);
		} else {
			request.getRequestDispatcher("FailureServlet").include(request, response);
			request.getRequestDispatcher("/LoginForm.html").include(request, response);
		}
	}
}
