/**
 * Copy right (C), 2020 Luvina
 * ListUserController.java, Feb 24, 2020
 */
package manageruser.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manageruser.utils.Contants;

/**
 * servlet get list user
 * @author DungPham
 *
 */
public class ListUserController extends HttpServlet {
	/**
	 * action send Redirect AMD002
	 * 
	 */ 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect(Contants.FILE_JSP_PATH + "/ADM002.jsp");
	}
	/**
	 * action Login when submit form login
	 * method post
	 */ 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// điều hướng sang MH ADM002
		resp.sendRedirect(Contants.FILE_JSP_PATH + "/ADM002.jsp");
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher(req.getContextPath() + "/View/jsp/ADM002.jsp");
	}
}
