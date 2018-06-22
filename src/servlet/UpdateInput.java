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

/**
 * Servlet implementation class updateInput
 */
@WebServlet("/updateInput")
public class UpdateInput extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String newName = request.getParameter("newCharactorname");
		String newOwner = request.getParameter("newOwner");
		String newWarrior = request.getParameter("newWarrior");
		String newType = request.getParameter("newType");

		HttpSession session = request.getSession();

		session.setAttribute("newName", newName);
		session.setAttribute("newOwner", newOwner);
		session.setAttribute("newWarrior", newWarrior);
		session.setAttribute("newType", newType);

		String charName = (String)session.getAttribute("oldName");

		session.setAttribute("charName", charName);

		List<Charactor> Char = SelectService.authentication(charName);

		String oldOwner = Char.get(0).getOwner();
		String oldWarrior = Char.get(0).getWarrior();
		String oldType = Char.get(0).getType();

		if ((charName.equals(newName)) && (oldOwner.equals(newOwner)) && (oldWarrior.equals(newWarrior)) && (oldType.equals(newType))) {
			// メッセージ設定
			request.setAttribute("msg", "１項目以上変更してください");

			// 次画面指定
			request.getRequestDispatcher("/updateInput.jsp").forward(request, response);

		}


		session.setAttribute("select", Char);

		request.getRequestDispatcher("/updateConfirm.jsp").forward(request, response);
	}

}
