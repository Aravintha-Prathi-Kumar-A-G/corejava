package com.chainsys.webapp.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.chainsys.miniproject.pojo.*;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
		HttpSession session = request.getSession(true);
		User userData =new User();
		userData.setUserID("Aravind24");
		userData.setPassword("4558");
		String key ="user"+session.getId();
		session.setAttribute(key, userData);
		// value bound() method in the user class will be called.
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<form method='post'><input type='text' name='txt1'> <p> <input type='submit' name='btn1' value='ok'></form>");
	    out.println("<p> User Set to Session");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		HttpSession session = request.getSession(false);
		if(session == null)
		{
          out.print("Session not created");
          return;
		}
		else
		{
			String key ="user"+session.getId();
			User userData =(User)session.getAttribute("key");
			if(userData == null)
			{
				out.print("Object removed from session");
				return;
			}
			out.print("<p> User Name : "+ userData.getUserID());
			out.print("<p> Password : "+ userData.getPassword());
			session.removeAttribute(key); 
			// this will remove user Object From the session Collection
		     // value unbound() of the user will be Called.
		}
	}

}
