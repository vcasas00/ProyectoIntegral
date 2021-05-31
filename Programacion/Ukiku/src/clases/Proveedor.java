package clases;

import java.sql.Connection;
import java.sql.SQLException;

import conectarBd.Conexion;

/**
 * @author DAM
 * 
 *         <b>Clase proveedor</b>
 */
public class Proveedor extends Ukiku {

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
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	@Override
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
	public void modificar(String nombre, String cif, String direccion, int telefono) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param nombre
	 * @param cif
	 * @param direccion
	 * @param telefono
	 */
	public void borrar(String nombre, String cif, String direccion, int telefono) {
		// TODO Auto-generated method stub

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
