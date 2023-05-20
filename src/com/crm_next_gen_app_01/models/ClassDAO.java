package com.crm_next_gen_app_01.models;

import java.sql.ResultSet;

public interface ClassDAO {
	public void establishConnection();
	public boolean login(String username, String password);
	public void createLead(String firstName, String lastName, String emailId, String city, String phNum);
	public ResultSet searchLeads();
	public void deleteLead(String emailId);
	public void updateLead(String emailId, String phNum, String city);
	public void destroyConnection();
}
