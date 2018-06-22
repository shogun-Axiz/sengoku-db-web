package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.User;
import service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if ((username == null || password == null) || ("".equals(username)) || ("".equals(password))) {
			request.setAttribute("msg", "城主名またはPASSが間違っています");

			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}

		UserService userService = new UserService();
		User user = userService.authentication(username, password);
		boolean isSuccess = (user != null);

		HttpSession session = request.getSession();
		session.setAttribute("name", username);

		if (isSuccess) {
			request.getRequestDispatcher("menu.jsp").forward(request, response);

		} else {
			request.setAttribute("msg", "ログインできませんでした。");

			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
