package pservlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{

	public void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException{
		
        int ans = (int) req.getAttribute("ans");
		
	    int square = ans*ans;
	    
	    PrintWriter out = res.getWriter();
	    
	    out.println(square);
    }
}
