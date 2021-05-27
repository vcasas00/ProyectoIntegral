package conectarBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	private Connection conexion = null;
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "conecta";
	private static final String password = "Qwert_12";
	private static final String url = "jdbc:mysql://54.85.137.151/ukiku_bd?characterEncoding=utf8";
	public Statement s;
	public int rs;
	public ResultSet rs1;

	public Conexion() {

		try {

			Class.forName(driver);
			conexion = DriverManager.getConnection(url, user, password);

			s = (Statement) conexion.createStatement();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();

		}

	}

	public Connection getConexion() {

		return conexion;

	}

	public void desconectar() {

		try {

			conexion.close();

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

}
