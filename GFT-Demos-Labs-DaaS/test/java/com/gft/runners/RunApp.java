package com.gft.runners;

import com.gft.connectors.SSH;
import com.gft.models.Address;
import com.gft.models.City;
import com.gft.models.Province;
import com.gft.security.Encrypt;
import com.gft.utils.ConvertTo;

public class RunApp {
	
	static SSH ss;
	static Encrypt en;

	public static void main(String[] args) {
		Address address = new Address( "Cra 48 # 15-15", new City("1", "New York", new Province("1" , "Manhattan")));
		System.out.println("*******************************" + address.getAddress());
		System.out.println("*******************************" + address.getCity().getNameCity());
		
		ConvertTo convert = new ConvertTo();
		convert.stringFromFile();
		
		if(1 == 1) {
			ss.conectar();
			en.getAES("newPassword157");
		}
		
		en = new Encrypt();
		en.getAES("newPassword157");
		ss.desconectar();
	}


	}


