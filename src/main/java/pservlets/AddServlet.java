package pservlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
    /*method belong to servlet lifecycle
      two things - request and response
      so use req object and res object
     */
	public void service( HttpServletRequest req, HttpServletResponse res){
		//getParameter return string so converting it into integer
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));	
		
		int ans = a+b;
		
		
	}
}
