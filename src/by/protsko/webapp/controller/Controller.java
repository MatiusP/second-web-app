package by.protsko.webapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.protsko.webapp.entity.User;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		User user = new User();
		user.setFirstName(request.getParameter("First name"));
		user.setLastName(request.getParameter("Last name"));
		user.setYearOfBirth(request.getParameter("year of birth"));
		user.seteMail(request.getParameter("e-mail"));
		user.setAddress(request.getParameter("address"));

		request.setAttribute("user", user);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
		requestDispatcher.forward(request, response);
	}

}
