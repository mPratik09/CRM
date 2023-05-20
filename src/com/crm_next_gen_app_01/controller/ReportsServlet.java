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

@WebServlet("/reportsServlet")
public class ReportsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClassDAOImpl dao = new ClassDAOImpl();
	private ResultSet allLeads;
	
	public ReportsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		if(session.getAttribute("emailid")!=null) {
			dao.establishConnection();
			allLeads = dao.searchLeads();
			if(allLeads != null) {
				request.setAttribute("allLeads", allLeads);
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsps/searchLeads.jsp");
				rd.forward(request, response);
			} else {
				JOptionPane.showMessageDialog(null, "No result found", "Message", JOptionPane.INFORMATION_MESSAGE);
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsps/createLead.jsp");
				rd.forward(request, response);
			}
		}
		else {
			RequestDispatcher rd1 = request.getRequestDispatcher("login.jsp");
			rd1.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
