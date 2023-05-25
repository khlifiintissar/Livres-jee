package tn.essat.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionImp;
import tn.essat.dao.IGestion;
import tn.essat.model.Category;
import tn.essat.model.Livre;

/**
 * Servlet implementation class postAdd
 */
public class postAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public postAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  IGestion gestion=new GestionImp();
		  String title=request.getParameter("title");
		   float price=Float.parseFloat(request.getParameter("price"));
		   int quantity=Integer.parseInt(request.getParameter("quantity"));
		   String author=request.getParameter("author");
		   int id_cat=Integer.parseInt(request.getParameter("category"));
		   Category cat=gestion.getCategoryById(id_cat);
		   Livre li=new Livre(10,title,quantity,price,author,cat);
		  gestion.addBook(li);
		  request.getRequestDispatcher("Principale").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
