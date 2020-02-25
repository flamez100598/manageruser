/**
 *  Copy right (C) 2020 Luvina
 * LoginController.java, Feb 23, 2020 DungPham
 */
package manageruser.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manageruser.logics.Tbl_UserLogic;
import manageruser.logics.impl.Tbl_UserLogicImpl;
import manageruser.utils.MessageErrorProperties;
import manageruser.utils.Contants;
import manageruser.validates.Validator;

/**
 * Servlet Login 
 * @author DungPham
 *
 */
public class LoginController extends HttpServlet {
	Tbl_UserLogic tbl_uli;
	/**
	 * action Login when submit form login
	 * 
	 */ 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("loginName");
		String password = req.getParameter("password");
		HttpSession session = req.getSession();
		System.out.println(password);
		System.out.println(username);
		boolean isNullTextBox = false;
		boolean checkRedirect = false;
		StringBuilder messError = new StringBuilder();
		if("".equals(username)) {
			isNullTextBox = true;
			messError.append(MessageErrorProperties.getValueByKey("MSG006"));
			System.out.println(messError);
		}
		if ("".equals(password)) {
			isNullTextBox = true;
			messError.append("<p style='margin:0;'>" + MessageErrorProperties.getValueByKey("MSG005") + "</p>");
		}
    	if (!isNullTextBox) {
    		try {
        		tbl_uli = new Tbl_UserLogicImpl();
        		if(tbl_uli.existLogin(username, password)) {
        			checkRedirect = true;
        			session.setAttribute("login_name", username);
        			System.out.println(req.getSession(false).getAttribute("login_name"));
        			System.out.println("has");
        		}
        		else {
        			System.out.println("no has");
        			messError = new StringBuilder(MessageErrorProperties.getValueByKey("MSG001"));
        			System.out.println(messError);
        		}
    		} catch (Exception e) {
    			System.out.println(e.getMessage());
    		}
    	}
    	System.out.println(messError);
    	
    	req.setAttribute("messageError", messError.toString());
    	if (!checkRedirect) {
        	RequestDispatcher requestDispatcher = req.getRequestDispatcher(Contants.FILE_JSP_PATH + "/ADM001.jsp");
            requestDispatcher.forward(req, resp);
    	} else {
        	RequestDispatcher requestDispatcher = req.getRequestDispatcher("./listUser.do");
            requestDispatcher.forward(req, resp);
    	}

	}
}
