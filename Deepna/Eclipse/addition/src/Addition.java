

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Addition
 */
@WebServlet("/Addition")
public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Addition() {
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException  
    { 
       System.out.println("init"); 
    } 
   
    // Requesting and printing the output 
  
   
       public void destroy()  
       { 
          System.out.println("Over"); 
       } 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pr=response.getWriter();
		response.setContentType("text/html");
		int x=Integer.parseInt(request.getParameter("t1"));
		int y=Integer.parseInt(request.getParameter("t2"));
		pr.println("The addition of numbers is "+ (x+y));
	    System.out.println("service"); 
	      
		} 
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
