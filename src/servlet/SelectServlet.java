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
 * Servlet implementation class SelectServlet
 */
@WebServlet("/select")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String charName = request.getParameter("charactorname");
		String owner = request.getParameter("owner");
		String warrior = request.getParameter("warrior");
		String type = request.getParameter("type");

		SelectService selectService = new SelectService();

		if (((charName == null) && (owner == null) && (warrior == null) && (type == null))
				|| (charName.equals("")) && (owner.equals("")) && (warrior.equals("")) && (type.equals(""))) {

			List<Charactor> list = selectService.find();
			request.setAttribute("selectList", list);

			// 次画面指定
			request.getRequestDispatcher("/selectResult.jsp").forward(request, response);

		}else if(((charName != null) && (owner == null) && (warrior == null) && (type == null))
				|| (!(charName.equals(""))) && (owner.equals("")) && (warrior.equals("")) && (type.equals(""))) {
			List<Charactor> Char = SelectService.authentication(charName);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForName(charName);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName == null) && (owner != null) && (warrior == null) && (type == null))
				|| (charName.equals("")) && (!(owner.equals(""))) && (warrior.equals("")) && (type.equals(""))) {
			List<Charactor> Char = SelectService.authentication2(owner);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForOwner(owner);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName == null) && (owner == null) && (warrior != null) && (type == null))
				|| (charName.equals("")) && (owner.equals("")) && (!(warrior.equals(""))) && (type.equals(""))) {
			List<Charactor> Char = SelectService.authentication3(warrior);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForWarrior(warrior);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName == null) && (owner == null) && (warrior == null) && (type != null))
				|| (charName.equals("")) && (owner.equals("")) && (warrior.equals("")) && (!(type.equals("")))) {
			List<Charactor> Char = SelectService.authentication4(type);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForType(type);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName != null) && (owner != null) && (warrior == null) && (type == null))
				|| (!(charName.equals(""))) && (!(owner.equals(""))) && (warrior.equals("")) && (type.equals(""))) {
			List<Charactor> Char = SelectService.authentication5(charName, owner);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForNameAndOwner(charName, owner);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName != null) && (owner == null) && (warrior != null) && (type == null))
				|| (!(charName.equals(""))) && (owner.equals("")) && (!(warrior.equals(""))) && (type.equals(""))) {
			List<Charactor> Char = SelectService.authentication6(charName, warrior);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForNameAndWarrior(charName, warrior);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName != null) && (owner == null) && (warrior == null) && (type != null))
				|| (!(charName.equals(""))) && (owner.equals("")) && (warrior.equals("")) && (!(type.equals("")))) {
			List<Charactor> Char = SelectService.authentication7(charName, type);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForNameAndType(charName, type);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName == null) && (owner != null) && (warrior != null) && (type == null))
				|| (charName.equals("")) && (!(owner.equals(""))) && (!(warrior.equals(""))) && (type.equals(""))) {
			List<Charactor> Char = SelectService.authentication8(owner, warrior);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForOwnerAndWarrior(owner, warrior);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName == null) && (owner != null) && (warrior == null) && (type != null))
				|| (charName.equals("")) && (!(owner.equals(""))) && (warrior.equals("")) && (!(type.equals("")))) {
			List<Charactor> Char = SelectService.authentication9(owner, type);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForOwnerAndType(owner, type);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName == null) && (owner == null) && (warrior != null) && (type != null))
				|| (charName.equals("")) && (owner.equals("")) && (!(warrior.equals(""))) && (!(type.equals("")))) {
			List<Charactor> Char = SelectService.authentication10(warrior, type);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForWarriorAndType(warrior, type);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName != null) && (owner != null) && (warrior != null) && (type == null))
				|| (!(charName.equals(""))) && (!(owner.equals(""))) && (!(warrior.equals(""))) && (type.equals(""))) {
			List<Charactor> Char = SelectService.authentication11(charName, owner, warrior);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForNameAndOwnerAndWarrior(charName, owner, warrior);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName != null) && (owner != null) && (warrior == null) && (type != null))
				|| (!(charName.equals(""))) && (!(owner.equals(""))) && (warrior.equals("")) && (!(type.equals("")))) {
			List<Charactor> Char = SelectService.authentication12(charName, owner, type);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForNameAndOwnerAndType(charName, owner, type);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName != null) && (owner == null) && (warrior != null) && (type != null))
				|| (!(charName.equals(""))) && (owner.equals("")) && (!(warrior.equals(""))) && (!(type.equals("")))) {
			List<Charactor> Char = SelectService.authentication15(charName, warrior, type);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForNameAndWarriorAndType(charName, warrior, type);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName == null) && (owner != null) && (warrior != null) && (type != null))
				|| (charName.equals("")) && (!(owner.equals(""))) && (!(warrior.equals(""))) && (!(type.equals("")))) {
			List<Charactor> Char = SelectService.authentication13(owner, warrior, type);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForOwnerAndWarriorAndType(owner, warrior, type);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}else if(((charName != null) && (owner != null) && (warrior != null) && (type != null))
				|| (!(charName.equals(""))) && (!(owner.equals(""))) && (!(warrior.equals(""))) && (!(type.equals("")))) {
			List<Charactor> Char = SelectService.authentication14(charName, owner, warrior, type);

			HttpSession session = request.getSession();

			session.setAttribute("select", Char);

			boolean isSuccess = Char.size() != 0;

			if (isSuccess) {
				List<Charactor> list = selectService.findForNameAndOwnerAndWarriorAndType(charName, owner, warrior, type);
				request.setAttribute("selectList", list);

				// 次画面指定
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
			} else {
				// メッセージ設定
				request.setAttribute("msg", "入力されたデータはありませんでした");

				// 次画面指定
				request.getRequestDispatcher("select.jsp").forward(request, response);
			}
		}
	}

}
