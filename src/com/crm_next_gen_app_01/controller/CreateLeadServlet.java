package com.crm_next_gen_app_01.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.crm_next_gen_app_01.models.ClassDAOImpl;

@WebServlet("/createLeadServlet")
public class CreateLeadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ClassDAOImpl dao = new ClassDAOImpl();
	
	public CreateLeadServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsps/createLead.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("emailid")!=null) {
//		if(session!=null) {
		
		String firstName = request.getParameter("f_name");
		String lastName = request.getParameter("l_name");
		String emailId = request.getParameter("emailid");
		String number = request.getParameter("ph_num");
		String city = request.getParameter("city");
		
		dao.establishConnection();
		dao.createLead(firstName, lastName, emailId, number, city);
		
		JOptionPane.showMessageDialog(null, "Lead saved successfully..", "Data Saved", JOptionPane.INFORMATION_MESSAGE);
		
		RequestDispatcher rd1 = request.getRequestDispatcher("WEB-INF/jsps/createLead.jsp");
		rd1.include(request, response);
		
		} else {
			RequestDispatcher rd1 = request.getRequestDispatcher("login.jsp");
			rd1.forward(request, response);
		}
	
	}
}
