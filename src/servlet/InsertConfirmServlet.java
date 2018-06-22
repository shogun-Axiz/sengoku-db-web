package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Charactor;
import entity.User;
import service.InsertService;

/**
 * Servlet implementation class InsertConfirmServlet
 */
@WebServlet("/insertConfirm")
public class InsertConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		String owner = request.getParameter("owner");
		String warrior = request.getParameter("warrior");
		String type = request.getParameter("type");

		String username = User.getUsername();

		InsertService insertService = new InsertService();

		int charactorId = insertService.id();

		Charactor charactor = new Charactor(charactorId, name, owner, warrior, type, username);

		insertService.register(charactor);

		request.getRequestDispatcher("insertResult.jsp").forward(request, response);
	}

}
