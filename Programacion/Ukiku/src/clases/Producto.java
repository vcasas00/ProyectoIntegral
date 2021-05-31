package clases;

import java.sql.Connection;
import java.sql.SQLException;

import conectarBd.Conexion;

public class Producto extends Ukiku {

	/**
	 * Atributos
	 */
	public String nombre;
	
	public String categoría;
	public double precio;
	public int stock;
	public String cif_Proveedor;
	public String dni_cliente;

	/**
	 * constructores
	 */
	public Producto() {
	}

	public Producto(String nombre, String categoría, double precio, int stock) {

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
	@Override
	public String getNombre() {
		
		return nombre;
		
	}

	/**
	 *@param nombre
	 */
	@Override
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
	 * @param nombre
	 * @param codigo
	 * @param categoría
	 * @param precio
	 * @param stock
	 * @param cifProveedor
	 * @param dniCliente
	 */
	public void modificar(String nombre,  String categoría, double precio, int stock, String cif_Proveedor,
			String dni_cliente) {
		// TODO Auto-generated method stub

	}

	
	/**
	 * @param nombre
	 * @param codigo
	 * @param categoría
	 * @param precio
	 * @param stock
	 * @param cifProveedor
	 * @param dniCliente
	 */
	public void borrar(String nombre, String categoría, double precio, int stock, String cif_Proveedor,
			String dni_cliente) {
		// TODO Auto-generated method stub

	}

	
	/**
	 * @param nombre
	 * @param codigo
	 * @param categoria
	 * @param precio
	 * @param stock
	 * @param cifProveedor
	 * @param dniCliente
	 */
	public static void insertar(String nombre, String categoría, double precio, int stock) {
		Conexion cn = new Conexion();
		Connection miConexion = cn.getConexion();

		try {
			cn.s = miConexion.createStatement();
			cn.rs = cn.s.executeUpdate("INSERT INTO producto (Nombre, categoría, precio, stock, cif_Proveedor) VALUES ('"
					+ nombre + "', '" + categoría + "', '" + precio + "', '" + stock + "',)");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
