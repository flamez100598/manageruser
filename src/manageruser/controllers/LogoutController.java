/**
 *  Copy right (C) 2020 Luvina
 * LogoutController.java, Feb 26, 2020 DungPham
 */
package manageruser.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manageruser.utils.Contants;

/**
 * Description
 * @author DungPham
 *
 */
public class LogoutController extends HttpServlet {
	// overright 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if (session != null) {
		    session.invalidate();
		}
		resp.sendRedirect(req.getContextPath());
	}
}
