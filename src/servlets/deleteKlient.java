package servlets;

import database.dbKlient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//import java.io.PrintWriter;
//import ORM.Klient;
//import java.util.List;


@WebServlet(name = "deleteKlient")
public class deleteKlient extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public deleteKlient() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");

        dbKlient klient = new dbKlient();
		klient.deleteKlient(id);
     
        request.getRequestDispatcher("/deleteKlient.jsp").forward(request, response); 	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
