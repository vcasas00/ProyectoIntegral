package clases;

public class Cliente extends Ukiku{
	
	/**
	 * Atributos
	 */
	private String nombre;
	private String apellido;
	private String dni;
	private String direccion;
	private int telefono;
	
	/**
	 * Constructores
	 */
	public Cliente() {
	}
	
	
	
	public Cliente(String nombre, String apellido, String dni, String direccion, int telefono) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
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
	public String getDni() {
		
		return dni;
		
	}
	
	/**
	 * @param dni
	 */
	public void setDni(String dni) {
		
		this.dni = dni;
		
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
	 * @param dni
	 * @param direccion
	 * @param telefono
	 */
	public void modificar(String nombre, String apellido, String dni, String direccion, int telefono) {
		// TODO Auto-generated method stub
		
	}

	
	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param direccion
	 * @param telefono
	 */
	public void borrar(String nombre, String apellido, String dni, String direccion, int telefono) {
		// TODO Auto-generated method stub
		
	}

	
	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param direccion
	 * @param telefono
	 */
	public void insertar(String nombre, String apellido, String dni, String direccion, int telefono) {
		// TODO Auto-generated method stub
		
	}
	
	

}
