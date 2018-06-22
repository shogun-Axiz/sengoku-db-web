package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("charactorname");
		String owner = request.getParameter("owner");
		String warrior = request.getParameter("warrior");
		String type = request.getParameter("type");

		if (((name == null) && (owner == null) && (warrior == null) && (type == null))
				|| ((name.equals("")) && (owner.equals("")) && (warrior.equals("")) && (type.equals("")))) {
			request.setAttribute("msg", "1項目以上は入力してください");

			// 次画面指定
			request.getRequestDispatcher("insert.jsp").forward(request, response);
		}

		HttpSession session = request.getSession();

		session.setAttribute("name", name);
		session.setAttribute("owner", owner);
		session.setAttribute("warrior", warrior);
		session.setAttribute("type", type);

		request.getRequestDispatcher("/insertConfirm.jsp").forward(request, response);
	}

}
