package clases;

/**
 * 
 * @author René, Vicent, Joaquín
 * 
 *         <b>Clase Useario</b>
 *
 */

public class Usuario {

	/**
	 * @param nombre     Nombre de usuario.
	 * @param contraseña Contraseña de el usuario.
	 */
	private String nombre;
	private String contraseña;

	public Usuario() {

	}

	/**
	 * @param nombre     Nombre introducido por parametro.
	 * @param contraseña Contraseña introducido por parametro.
	 */
	public Usuario(String nombre, String contraseña) {

		this.contraseña = contraseña;
		this.nombre = nombre;

	}

	/**
	 * @return Devuelve el nombre actual.
	 */
	public String getNombre() {

		return nombre;

	}

	/**
	 * @param nombre Modifica el nombre actual.
	 */
	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	/**
	 * @return Devuelve la contraseña actual.
	 */
	public String getContraseña() {

		return contraseña;

	}

	/**
	 * @param contraseña Modiffica el nombre actual.
	 */
	public void setContraseña(String contraseña) {

		this.contraseña = contraseña;

	}

	/**
	 * @param nombre
	 * @param contraseña
	 * 
	 *                   Comprueba que el nombre y contraseña introducidos por
	 *                   parametros coincidan con los de la base de datos.
	 */
	public void acceder(String nombre, String contraseña) {

	}

	/**
	 * @param nombre
	 * @param contraseña
	 * 
	 *                   Añade el nombre y contraseña introducidos por parametro a
	 *                   la base de datos.
	 */
	public void registrarse(String nombre, String contraseña) {

	}

}
