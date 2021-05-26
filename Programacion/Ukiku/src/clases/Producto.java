package clases;

public class Producto extends Ukiku {

	/**
	 * Atributos
	 */
	public String nombre;
	public int codigo;
	public String categoria;
	public double precio;
	public int stock;
	public String cifProveedor;
	public String dniCliente;

	/**
	 * constructores
	 */
	public Producto() {
	}

	public Producto(String nombre, int codigo, String categoria, double precio, int stock, String cifProveedor,
			String dniCliente) {

		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.cifProveedor = cifProveedor;
		this.dniCliente = dniCliente;

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
	 *@param nombre
	 */
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}

	/**
	 * @return
	 */
	public int getCodigo() {
		
		return codigo;
		
	}

	/**
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		
		this.codigo = codigo;
		
	}

	/**
	 * @return
	 */
	public String getCategoria() {
		
		return categoria;
		
	}

	/**
	 * @param categoria
	 */
	public void setCategoria(String categoria) {
		
		this.categoria = categoria;
		
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
	public String getCifProveedor() {
		
		return cifProveedor;
		
	}

	/**
	 * @param cifProveedor
	 */
	public void setCifProveedor(String cifProveedor) {
		
		this.cifProveedor = cifProveedor;
		
	}

	/**
	 * @return
	 */
	public String getDniCliente() {
		
		return dniCliente;
		
	}

	/**
	 * @param dniCliente
	 */
	public void setDniCliente(String dniCliente) {
		
		this.dniCliente = dniCliente;
		
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
	public void modificar(String nombre, int codigo, String categoria, double precio, int stock, String cifProveedor,
			String dniCliente) {
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
	public void borrar(String nombre, int codigo, String categoria, double precio, int stock, String cifProveedor,
			String dniCliente) {
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
	public void insertar(String nombre, int codigo, String categoria, double precio, int stock, String cifProveedor,
			String dniCliente) {
		// TODO Auto-generated method stub

	}

}
