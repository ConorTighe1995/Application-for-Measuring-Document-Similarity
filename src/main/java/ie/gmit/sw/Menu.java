package ie.gmit.sw;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.db4o.*;

@WebServlet(urlPatterns = "/MainMenu")
public class Menu extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// GET JSP Menu view
    protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/MainMenu.jsp").forward(
				request, response);
	}
    
    // POST JSP Menu view
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String result;
    	if (request.getParameter("txtTitle") != null && request.getParameter("txtDocument") != null) {
    		String title = request.getParameter("txtTitle");
    		String document = request.getParameter("txtDocument");
	        
	        
    	}else {
    		
    	}
    }   

}
