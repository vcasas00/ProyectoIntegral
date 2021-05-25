package clases;

/**
 * @author DAM
 * 
 * <b>Clase proveedor</b>
 */
public class Proveedor implements Ukiku{
	
	/**
	 * @param nombre 
	 * @param apellido
	 * @param cif
	 * @param direccion
	 * @param telefono
	 */
	private String nombre;
	private String apellido;
	private String cif;
	private String direccion;
	private int telefono;
	
	/**
	 * <b>Constructor por defecto</b>
	 */
	public Proveedor() {
	}

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
	 *
	 */
	@Override
	public void modificar() {
		// TODO Auto-generated method stub
		
	}

	/**
	 *
	 */
	@Override
	public void borrar() {
		// TODO Auto-generated method stub
		
	}

	/**
	 *
	 */
	@Override
	public void insertar() {
		// TODO Auto-generated method stub
		
	}

}
