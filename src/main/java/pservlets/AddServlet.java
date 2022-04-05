package pservlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
public class AddServlet extends HttpServlet{
    /*method belong to servlet lifecycle
      two things - request and response
      so use req object and res object
     */
	//service - mand name
	public void service( HttpServletRequest req, HttpServletResponse res) throws IOException{
		//getParameter return string so converting it into integer
		
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));	
		
		int ans = a+b;
		
		//write data on res object
		
		PrintWriter out = res.getWriter();
		
		out.println(ans);
		
		
	}
}