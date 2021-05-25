package clases;

public class Ciente implements Ukiku{
	
	private String nombre;
	private String apellido;
	private String dni;
	private String direccion;
	private int telefono;
	
	public Ciente() {
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	public String getApellido() {
		
		return apellido;
		
	}
	public void setApellido(String apellido) {
		
		this.apellido = apellido;
		
	}
	public String getDni() {
		
		return dni;
		
	}
	public void setDni(String dni) {
		
		this.dni = dni;
		
	}
	public String getDireccion() {
		
		return direccion;
		
	}
	public void setDireccion(String direccion) {
		
		this.direccion = direccion;
		
	}
	public int getTelefono() {
		
		return telefono;
		
	}
	public void setTelefono(int telefono) {
		
		this.telefono = telefono;
		
	}

	@Override
	public void modificar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar() {
		// TODO Auto-generated method stub
		
	}
	
	

}
