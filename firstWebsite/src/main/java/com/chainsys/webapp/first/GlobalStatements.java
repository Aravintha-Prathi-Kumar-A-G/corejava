package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GlobalStatements
 */
public class GlobalStatements extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GlobalStatements() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("html><head><title><SessionState</title></head><body>");
/*	Enumeration <String> names=request.getParameterNames();
		while(names.hasMoreElements())
		{
			String parameterName =names.nextElement();
			System.out.println(parameterName);
			String[] values = request.getParameterValues(parameterName);
			int length =values.length;
			for(int i=0;i<length; i++)
			{
				System.out.println("values :"+values[i]);
			}
		}  */
		// Collections of strings
 	String submitValue = request.getParameter("submit");
		ServletContext ctx =this.getServletContext(); // get handle to servlet context maintained by Tomcat Server
		if (submitValue.equals("set"))
		{
			String salaryInput = request.getParameter("salary");
			this.getServletContext().setAttribute("globalSalary", salaryInput);
			 // ctx.setAttribute("ctxsalary", salaryInput);// store data in servlet for all user
			 // ctx.setAttribute stores the data in a collection using key and value.
			 //  ctxsalary= key,salaryInput=value
			out.println("<h1>Value Set</h1>" +salaryInput);

		} else if (submitValue.equals("fetch")) {
			//  String sessionSalary =session.getAttribute("salary").toString(); 
			          // or
			String applicationSalary =(String)this.getServletContext().getAttribute("ctxsalary");
			if(applicationSalary == null)
			{
				out.println("<h1>SERVLET CONTEXT NOT YET SET !!!</h1>");
			}
			else
			{
			out.println("<h1>Value Fetch</h1>" + applicationSalary); //returning values from sessionAttributes.
		}
		} 
		   out.println(" <input type='hidden' value='50000' name='bonus' id='bonus'/>");
       out.println("</body></html");
    // data stored in servlet context is multiuser, and can be 
       // read or modified from all other servlet.
		}

}
