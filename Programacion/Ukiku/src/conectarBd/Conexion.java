package conectarBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	private Connection conexion;
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost:3306/admin";
	public Statement s;
	public ResultSet rs;

	public Conexion() {

		conexion = null;

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
