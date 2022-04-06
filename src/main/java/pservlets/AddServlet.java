package pservlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;
public class AddServlet extends HttpServlet{
    /*method belong to servlet lifecycle
      two things - request and response
      so use req object and res object
     */
	
	
	//service - mand name
	//public void service( HttpServletRequest req, HttpServletResponse res) throws IOException{
		//getParameter return string so converting it into integer
		
	public void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));	
		
		int ans = a+b;
		
		//write data on res object
		
		/*PrintWriter out = res.getWriter();
		
		out.println(ans);*/
		
		/* 
		 
		//call servlet from servlet
		// -- Req Dispatcher and Redirect
		 
		//interface
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		//now mention this mapping at web.xml file
		
		*/
		
		
		/*
		
		//Send data from this servlet to another
		
		req.setAttribute("ans", ans); //key-value
		 
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
		*/
		
		
		//Using sendRedirect
		
		
		/*
		
		//http://localhost:9495/pservlets/sq?ans=8 -- work if change in url --URL Rewriting (1 way)
		
	       res.sendRedirect("sq?ans="+ans); //way to pass value from one servlet to another
	       
	    */
		
		/*
		//Session Management (2 way) mainly use for login
		
		HttpSession session = req.getSession();
		
		session.setAttribute("ans",ans);
		
		res.sendRedirect("sq");
		
		*/
		
		//Cookie - client side the send to server
		
		Cookie cookie = new Cookie("ans", ans+"");
		
		res.addCookie(cookie);
		res.sendRedirect("sq");
	
		
	       
	       
	}
	
   //have two methods -- doPost   and doGet to only work with specific 
}


