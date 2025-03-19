package com.gft.tasks;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.gft.connectors.DataBase;
import com.gft.models.Address;
import com.gft.models.Identification;
import com.gft.models.User;

public class GetUser {
	
	private String noUser;
	private Integer wait;
	private User user;
	public String consultUserById = "SELECT * FROM users WHERE idUser = %s";

	public String getInfoUser(String id) throws SQLException {
		SETUserIngfo();
		
			DataBase connectorDDBB = null;
	id = "" + connectorDDBB.obtenerConexion().createStatement().execute(String.format(consultUserById, id));
		
		return id;
		
	}
	
	public void SETUserIngfo() {
		try {
		//String names, String surnames, Date birthday, String gender, Identification id, Address address
		 String fechaString = "10/10/2010"; 
	        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        
	            Date date = formato.parse(fechaString);
	            System.out.println("Fecha parseada: " + date);
	        
	         Identification iden = new Identification();
	         iden.setTypeId("Passport");
	            
		user = new User();
		user.setNames("Jose Repelin");
		user.setSurnames("Cuachare Tenedor");
		user.setBirthday(date);
		user.setGender("Male");
		user.setId(iden);
		
		
		
		
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
	
}
