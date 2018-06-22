package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.UserService;

/**
 * Servlet implementation class RegistrationConfirm
 */
@WebServlet("/registrationConfirm")
public class RegistrationConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User reg = new User(username, password);

		UserService userService = new UserService();
		userService.registration(reg);

		request.setAttribute("reg", reg);

		request.setAttribute("msg", "登録が完了しました。");

		request.getRequestDispatcher("login.jsp").forward(request, response);

	}

}
