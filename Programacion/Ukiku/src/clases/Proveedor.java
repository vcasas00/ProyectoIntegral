package clases;

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
	private String apellido;
	private String cif;
	private String direccion;
	private int telefono;

	/**
	 * Constructores
	 */
	public Proveedor() {
	}

	public Proveedor(String nombre, String apellido, String cif, String direccion, int telefono) {

		this.nombre = nombre;
		this.apellido = apellido;
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
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	 * @param apellido
	 * @param cif
	 * @param direccion
	 * @param telefono
	 */
	public void modificar(String nombre, String apellido, String cif, String direccion, int telefono) {
		// TODO Auto-generated method stub

	}

	
	/**
	 * @param nombre
	 * @param apellido
	 * @param cif
	 * @param direccion
	 * @param telefono
	 */
	public void borrar(String nombre, String apellido, String cif, String direccion, int telefono) {
		// TODO Auto-generated method stub

	}

	
	/**
	 * @param nombre
	 * @param apellido
	 * @param cif
	 * @param direccion
	 * @param telefono
	 */
	public void insertar(String nombre, String apellido, String cif, String direccion, int telefono) {
		// TODO Auto-generated method stub

	}

}
