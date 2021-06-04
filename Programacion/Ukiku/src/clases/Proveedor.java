package clases;

import java.sql.Connection;
import java.sql.SQLException;

import conectarBd.Conexion;

/**
 * @author Rene, Ximo, Vicent
 * 
 *        
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
	 * @return Devuelve el nombre del proveedor
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre Es el nombre del proveedor
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return devuelve el cif del proveedor
	 */
	public String getCif() {
		return cif;
	}

	/**
	 * @param cif Es el cif del proveedor
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}

	/**
	 * @return devuelve la direccion del proveedor
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion Es la dirección del proveedor
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return devuelve el telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono Es el telefono del proveedor
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * @param nombre Es el nombre del proveedor
	 * @param cif Es el cif del proveedor
	 * @param direccion Es la dirección del proveedor
	 * @param telefono Es el telefono del proveedor
	 * Creación del metodo modificacion, permite modificar un proveedor.
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
	 * @param cif Es el cif del proveedor
	 * Creación del metodo borrar, permite borrar un proveedor.
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
	/**
	 * 
	 * @param cif Es el cif del proveedor
	 * @return Devuelve true si CIF NO existe. Devuelve false si CIF existe.
	 * Creación del metodo estaBorradoCif que comprueba si existe el CIF del proveedor.
	 */
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
	/**
	 * 
	 * @param cif Es el cif del proveedor
	 * @return Devuelve true si CIF existe. Devuelve false si CIF NO existe.
	 * Creación del metodo existeCif que comprueba si existe el CIF del proveedor.
	 */
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
	 * @param nombre Es el nombre del proveedor
	 * @param cif Es el cif del proveedor
	 * @param direccion Es la dirección del proveedor
	 * @param telefono Es el telefono del proveedor
	 * Creación del metodo insertar, permite insertar proveedores a la base de datos.
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
