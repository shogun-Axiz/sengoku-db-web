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
import service.SelectService;
import service.UpdateService;

/**
 * Servlet implementation class UpdateConfirmServlet
 */
@WebServlet("/updateConfirm")
public class UpdateConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		String newName = request.getParameter("newCharactorName");
		String newOwner = request.getParameter("newOwner");
		String newWarrior = request.getParameter("newWarrior");
		String newType = request.getParameter("newType");

		HttpSession session = request.getSession();

		String charName = (String)session.getAttribute("charName");

		List<Charactor> Char = SelectService.authentication(charName);

		int id = Char.get(0).getCharactor_id();
		String username = Char.get(0).getUsername();

		UpdateService updateService = new UpdateService();
		updateService.update(id, newName, newOwner, newWarrior, newType, username);

		request.getRequestDispatcher("/updateResult.jsp").forward(request, response);
	}

}
