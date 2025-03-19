package com.gft.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

	private static Connection conexion;

	public static Connection obtenerConexion() {
		if (conexion == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/la_mejor_ddbb", "elMejorUsuario", "Seguro123");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conexion;
	}

	public static void cerrarConexion() {
		if (conexion != null) {
			try {
				conexion.close();
			} catch (SQLException e) {
				System.err.println("-----------------: " + e.getErrorCode() + ", ---------------- " + e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
