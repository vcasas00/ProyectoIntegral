package clases;

import java.sql.Connection;
import java.sql.SQLException;

import conectarBd.Conexion;

/**
 * @author DAM
 * 
 *         <b>Clase proveedor</b>
 */
public class Proveedor {

	/**
	 * Atributos
	 */
	private String nombre;
	private String cif;
	private String direccion;
	private int telefono;

	/**
	 * Constructores
	 */
	public Proveedor() {
	}

	public Proveedor(String nombre, String cif, String direccion, int telefono) {

		this.nombre = nombre;
		this.cif = cif;
		this.direccion = direccion;
		this.telefono = telefono;

	}

	/**
	 * Getters y Setters
	 */

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	public String getCif() {
		return cif;
	}

	/**
	 * @param cif
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}

	/**
	 * @return
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * @param nombre
	 * @param cif
	 * @param direccion
	 * @param telefono
	 */
	public static void modificar(String nombre, String cif, String direccion, int telefono) {

		Conexion cn = new Conexion();
		Connection miConexion = cn.getConexion();

		String sql = "update proveedor set Nombre = '" + nombre + "', Dirección = '" + direccion + "', Teléfono = '"
				+ telefono + "' where Cif = '" + cif + "'";

		try {

			cn.s = miConexion.createStatement();
			cn.rs = cn.s.executeUpdate(sql);

		} catch (SQLException e) {

			e.printStackTrace();

		}
	}

	/**
	 * @param nombre
	 * @param cif
	 * @param direccion
	 * @param telefono
	 */
	public static void borrar(String cif) {

		Conexion cn = new Conexion();
		String sql = "delete from proveedor where Cif='" + cif + "'";

		try {
			cn.rs = cn.s.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static boolean estaBorradoCif(String cif) {
		boolean si = true;
		Conexion cn = new Conexion();
		String sql = "select Cif from proveedor where Cif='" + cif + "'";
		try {

			cn.rs1 = cn.s.executeQuery(sql);
			if (cn.rs1.next()) {

				si = false;

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return si;

	}

	public static boolean existeCif(String cif) {
		boolean si = false;
		Conexion cn = new Conexion();
		String sql = "select Cif from proveedor where Cif='" + cif + "'";
		try {

			cn.rs1 = cn.s.executeQuery(sql);
			if (cn.rs1.next()) {

				si = true;

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return si;

	}

	/**
	 * @param nombre
	 * @param cif
	 * @param direccion
	 * @param telefono
	 */
	public static void insertar(String nombre, String cif, String direccion, int telefono) {
		Conexion cn = new Conexion();
		Connection miConexion = cn.getConexion();

		try {
			cn.s = miConexion.createStatement();
			cn.rs = cn.s.executeUpdate("INSERT INTO proveedor (Nombre, Cif, Dirección, Teléfono) VALUES ('" + nombre
					+ "', '" + cif + "', '" + direccion + "', '" + telefono + "')");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
