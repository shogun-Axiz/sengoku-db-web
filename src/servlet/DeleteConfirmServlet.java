package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Charactor;
import service.DeleteService;
import service.SelectService;

/**
 * Servlet implementation class DeleteConfirmServlet
 */
@WebServlet("/deleteConfirm")
public class DeleteConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		String charName = (String) session.getAttribute("charName");

		List<Charactor> Char = SelectService.authentication(charName);

		int id = (int)Char.get(0).getCharactor_id();

		DeleteService deleteService = new DeleteService();
		deleteService.delete(id);

		request.getRequestDispatcher("/deleteResult.jsp").forward(request, response);
	}

}
