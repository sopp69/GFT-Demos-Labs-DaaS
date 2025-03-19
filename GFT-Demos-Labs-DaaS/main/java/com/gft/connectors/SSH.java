package com.gft.connectors;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SSH {

	 private static final String USUARIO = "falseUser";
	    private static final String HOST = "0.0.0.0";

	    private static Session session;

	    public static void conectar() {
	        JSch jsch = new JSch();
	        try {
	            session = jsch.getSession(USUARIO, HOST, 22);
	            session.setPassword("falsePassword");
	            session.setConfig("StrictHostKeyChecking", "no");
	            session.connect();
	            System.out.println("Conexión SSH establecida.");
	        } catch (Exception e) {
	        	System.err.println("-----------------: " + e.getCause() + ", ---------------- " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	    public static void desconectar() {
	        if (session != null && session.isConnected()) {
	            session.disconnect();
	            System.out.println("Conexión SSH cerrada.");
	        }
	    }
	
}
