package com.crm_next_gen_app_01.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.crm_next_gen_app_01.models.ClassDAOImpl;

@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ClassDAOImpl dao = new ClassDAOImpl();

	public DeleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		if(session.getAttribute("emailid")!=null) {

			String emailId = request.getParameter("emailid");
			dao.establishConnection();
			dao.deleteLead(emailId);
			ResultSet results = dao.searchLeads();
			if (results != null) {
				request.setAttribute("allLeads", results);
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsps/searchLeads.jsp");
				rd.include(request, response);
			}
		
		} else {
			RequestDispatcher rd1 = request.getRequestDispatcher("login.jsp");
			rd1.forward(request, response);
		}
		
//		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsps/noSearchLeads.jsp");
//		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
