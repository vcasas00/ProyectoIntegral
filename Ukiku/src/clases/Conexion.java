package clases;

import java.sql.*;

import javax.swing.*;

public class Conexion {

	private Connection cn = null;
	
	public Conexion() {
		
		try {
			cn = DriverManager.getConnection("jdbc:mysql://54.85.137.151/phpmyadmin/ukiku_bd", "root","Qwert_12");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR LA BASE DE DATOS \n\n" + e.getMessage() );
			e.printStackTrace();
		}
	}
	
	public Connection getCn() {

		return cn;
	}
	
	
}
