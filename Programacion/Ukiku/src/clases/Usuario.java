package clases;

import java.sql.SQLException;

import conectarBd.Conexion;

/**
 * 
 * @author René, Vicent, Joaquín
 * 
 * 
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
	 * @param nombre     Es el nombre del usuario
	 * @param contraseña Es la contraseña del usuario
	 * @return acceso Devuelve si el usuario puede acceder o no Comprueba que el
	 *         nombre y contraseña introducidos por parametros coincidan con los de
	 *         la base de datos.
	 */
	public boolean acceder(String nombre, String contraseña) {

		Conexion c = new Conexion();
		boolean acceso = false;
		String sql = "select nombre, contraseña from usuario where nombre= '" + nombre + "' AND contraseña= '"
				+ contraseña + "'";
		try {

			c.rs1 = c.s.executeQuery(sql);

			if (c.rs1.next()) {

				acceso = true;

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return acceso;

	}

	/**
	 * @param nombre     Es el nombre del usuario
	 * @param contraseña Es la contraseña del usuario
	 * 
	 *                   Añade el nombre y contraseña introducidos por parametro a
	 *                   la base de datos.
	 */
	public void registrarse(String nombre, String contraseña) {

		Conexion c = new Conexion();
		String sql = "insert into usuario(Nombre, Contraseña)" + " values ('" + nombre + "', '" + contraseña + "')";
		try {

			c.rs = c.s.executeUpdate(sql);

		} catch (SQLException e) {

			e.printStackTrace();

		}

		c.desconectar();

	}

	/**
	 * @param nombre Es el nombre del usuario
	 * @return Devuelve si existe el Usuario Comprueba el nombre introducido por
	 *         parametro a la base de datos, si existe, no te deja crearlo.
	 */
	public boolean existeUsuario(String nombre) {
		Conexion c = new Conexion();
		boolean existeUsuario = false;
		String sql = "select nombre from usuario where nombre= '" + nombre + "'";

		try {

			c.rs1 = c.s.executeQuery(sql);

			if (c.rs1.next()) {

				existeUsuario = true;

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return existeUsuario;
	}

	/**
	 * @param contraseña Contraseña a validar.
	 * @return Devuelve verdadero si la contraseña tiene, al menos, 8 caracteres,
	 *         una mayuscula, una minuscula y un numero. En caso contrario devuelve
	 *         falso.
	 */
	public boolean contraseñaValida(String contraseña) {

		boolean esValida = false;

		if (contraseña.length() > 7) {

			int contarNumeros = 0, contarMayusculas = 0, contarMinusculas = 0;
			char contra;

			for (int i = 0; i < contraseña.length(); i++) {

				contra = contraseña.charAt(i);

				String contraValor = String.valueOf(contra);

				if (contraValor.matches("[A-Z]")) {

					contarMayusculas++;

				} else if (contraValor.matches("[a-z]")) {

					contarMinusculas++;

				} else if (contraValor.matches("[0-9]")) {

					contarNumeros++;

				}

			}

			if (contarMayusculas > 0 && contarMinusculas > 0 && contarNumeros > 0) {

				esValida = true;
			}

		}

		return esValida;

	}
	
	/**
	 * @param nombre Nombre de usuario.
	 * @return Devuelve verdadero si el nombre tiene, al menos, 8 caracteres,
	 *         una mayuscula, una minuscula y un numero. En caso contrario devuelve
	 *         falso.
	 */
	public boolean usuarioValido(String nombre) {

		boolean esValido = false;

		if (nombre.length() > 7) {

			int contarNumeros = 0, contarMayusculas = 0, contarMinusculas = 0;
			char nom;

			for (int i = 0; i < nombre.length(); i++) {

				nom = nombre.charAt(i);

				String nomValor = String.valueOf(nom);

				if (nomValor.matches("[A-Z]")) {

					contarMayusculas++;

				} else if (nomValor.matches("[a-z]")) {

					contarMinusculas++;

				} else if (nomValor.matches("[0-9]")) {

					contarNumeros++;

				}

			}

			if (contarMayusculas > 0 && contarMinusculas > 0 && contarNumeros > 0) {

				esValido = true;
			}

		}

		return esValido;

	}

}
