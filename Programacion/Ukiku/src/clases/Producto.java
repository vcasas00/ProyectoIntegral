package clases;

import java.sql.Connection;
import java.sql.SQLException;

import conectarBd.Conexion;

public class Producto {

	/**
	 * Atributos
	 */
	public String nombre;
	public int codigo;
	public String categoría;
	public double precio;
	public int stock;
	public String cif_Proveedor;

	/**
	 * constructores
	 */
	public Producto() {
	}

	public Producto(String nombre, String categoría, double precio, int stock, String cif_Proveedor) {

		super();
		this.nombre = nombre;
		this.categoría = categoría;
		this.precio = precio;
		this.stock = stock;

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
	public String getCategoria() {

		return categoría;

	}

	/**
	 * @param categoría
	 */
	public void setCategoria(String categoría) {

		this.categoría = categoría;

	}

	/**
	 * @return
	 */
	public double getPrecio() {

		return precio;

	}

	/**
	 * @param precio
	 */
	public void setPrecio(double precio) {

		this.precio = precio;

	}

	/**
	 * @return
	 */
	public int getStock() {

		return stock;

	}

	/**
	 * @param stock
	 */
	public void setStock(int stock) {

		this.stock = stock;

	}

	/**
	 * @return
	 */
	public String getCif_Proveedor() {
		return cif_Proveedor;
	}

	/**
	 * @param cif_Proveedor
	 */
	public void setCif_Proveedor(String cif_Proveedor) {
		this.cif_Proveedor = cif_Proveedor;
	}
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @param nombre
	 * @param categoría
	 * @param precio
	 * @param stock
	 * @param cifProveedor
	 */
	public void modificar(String nombre, String categoría, double precio, int stock, String cif_Proveedor) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param codigo
	 */
	public static void borrar(int codigo) {

		Conexion cn = new Conexion();
		String sql = "delete from producto where Codigo='" + codigo + "'";

		try {

			cn.rs = cn.s.executeUpdate(sql);

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static boolean existeCodigo(int codigo) {

		boolean si = false;
		Conexion cn = new Conexion();
		String sql = "select Codigo from producto where Codigo='" + codigo + "'";

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
	
	public static boolean estaBorradoCodigo(int codigo) {
		
		boolean si = true;
		Conexion cn = new Conexion();
		String sql = "select Codigo from producto where Codigo='" + codigo + "'";
		
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
	 * @param nombre
	 * @param categoria
	 * @param precio
	 * @param stock
	 * @param cifProveedor
	 * @param dniCliente
	 */
	public static void insertar(String nombre, String categoría, double precio, int stock, String cifProveedor) {
		Conexion cn = new Conexion();
		Connection miConexion = cn.getConexion();

		try {
			cn.s = miConexion.createStatement();
			cn.rs = cn.s.executeUpdate(
					"INSERT INTO producto (Nombre, categoría, precio, stock, Cif_Proveedor) VALUES ('" + nombre + "', '"
							+ categoría + "', '" + precio + "', '" + stock + "', '" + cifProveedor + "')");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
