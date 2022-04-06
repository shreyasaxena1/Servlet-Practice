package pservlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet{

	public void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException{
		
       /* int ans = (int) req.getAttribute("ans");
		
	    int square = ans*ans;
	    
	    PrintWriter out = res.getWriter();
	    
	    out.println(square);
	    */
		
		/*
		
		//For sendRedirect
	
		
		int ans = Integer.parseInt(req.getParameter("ans"));
		int square = ans*ans;
		
		PrintWriter out = res.getWriter();
		    
		out.println("Square is :" + square);
		
		*/
		
		/*
		
		HttpSession session = req.getSession();
		
		int ans = (int) session.getAttribute("ans");
		
		int square = ans*ans;
		
		PrintWriter out = res.getWriter();
	    
		out.println("Square is :" + square);
		
		//session.removeAttribute("ans");
		
		*/
		
		//more than 1 cookie ie give all cookies
		int ans = 0;
		
		Cookie cookie [] = req.getCookies();
		
		for(Cookie c : cookie) {
			if(c.getName().equals("ans")) {
				ans = Integer.parseInt(c.getValue());
			}
				
		}
		
        int square = ans*ans;
		
		PrintWriter out = res.getWriter();
	    
		out.println("Square is :" + square);
		
    }
}
