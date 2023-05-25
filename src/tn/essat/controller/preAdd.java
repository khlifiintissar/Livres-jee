package tn.essat.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionImp;
import tn.essat.dao.IGestion;
import tn.essat.model.Category;

/**
 * Servlet implementation class preAdd
 */
public class preAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public preAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 IGestion ges=new GestionImp();
	 List<Category> lis= ges.getAllCategories();
	 request.setAttribute("lis",lis );
	 String param =request.getParameter("direction");
	 //request.getRequestDispatcher("category.jsp").forward(request, response);
	  if (param.equals("form")) {
		  request.getRequestDispatcher("formAdd.jsp").forward(request, response);
	  }else {
		  request.getRequestDispatcher("category.jsp").forward(request, response);
	  }
	
	
	 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
