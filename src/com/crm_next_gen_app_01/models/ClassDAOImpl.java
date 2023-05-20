package com.crm_next_gen_app_01.models;

import java.sql.*;

public class ClassDAOImpl implements ClassDAO {
	private Connection con;
	private Statement stmnt;

	@Override
	public void establishConnection() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_next_app_01", "root", "Mysql");
			stmnt = con.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		try {
			ResultSet results = stmnt.executeQuery("select * from login "
					+ "where emailid ='" + username + "' and password = '" + password + "'");
			return results.next();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public void createLead(String firstName, String lastName, String emailId,  String phNum, String city) {
		// TODO Auto-generated method stub
		try {
			stmnt.executeUpdate("insert into leads values('" + firstName + "', '" + lastName + "', "
					+ "'" + emailId + "', '" + phNum + "', '" + city + "')");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet searchLeads() {
		// TODO Auto-generated method stub
		try {
			ResultSet allLeads = stmnt.executeQuery("select * from leads");
			return allLeads;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void deleteLead(String emailId) {
		// TODO Auto-generated method stub
		try {
			stmnt.executeUpdate("delete from leads where email_id = '"+emailId+"'");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Override
	public void updateLead(String emailId, String phNum, String city) {
		// TODO Auto-generated method stub
		try {
			stmnt.executeUpdate("update leads set ph_num = '"+phNum+"' , city = '"+ city +"' where email_id = '"+emailId+"'");
   		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void destroyConnection() {
		// TODO Auto-generated method stub
		try {
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
