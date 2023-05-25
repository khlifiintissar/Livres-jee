package tn.essat.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionImp;
import tn.essat.dao.IGestion;
import tn.essat.model.Livre;


/**
 * Servlet implementation class Principale
 */
public class Principale extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Principale() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
	        
	    // PrintWriter out = response.getWriter();
		
		IGestion gest = new GestionImp();
		List<Livre> liste=gest.getAllBooks();
		request.setAttribute("liste", liste);
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
	//	  out.println("<table border=1>");
	//	for(Livre li:liste) {
			      
	//				out.println("<tr>");
	//				out.println("<td>"+li.getTitle()+"</td>");
	//				out.println("<td>"+li.getQuantity()+"</td>");
	//				out.println("<td>"+li.getPrice()+"</td>");
	//				out.println("</tr>");
				
			//	}
	//	out.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
