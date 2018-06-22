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
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		String charName = request.getParameter("name");

		if ((charName == null) || (charName.equals(""))) {
			// メッセージ設定
			request.setAttribute("msg", "武将名が入力されていません");

			// 次画面指定
			request.getRequestDispatcher("/delete.jsp").forward(request, response);
		}

		SelectService selectService = new SelectService();

		List<Charactor> Char = SelectService.authentication(charName);

		HttpSession session = request.getSession();

		session.setAttribute("charName", charName);
		session.setAttribute("select", Char);

		boolean isSuccess = Char.size() != 0;

		if (isSuccess) {
			List<Charactor> list = selectService.findForName(charName);
			request.setAttribute("selectList", list);

			// 次画面指定
			request.getRequestDispatcher("/deleteConfirm.jsp").forward(request, response);
		} else {
			// メッセージ設定
			request.setAttribute("msg", "入力されたデータはありませんでした");

			// 次画面指定
			request.getRequestDispatcher("/delete.jsp").forward(request, response);
		}
	}

}
