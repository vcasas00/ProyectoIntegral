package clases;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prueba1 {
/**
 * TEST USUARIO.JAVA
 */
	@Test
	public void  TestAccederTrue() {

		Usuario usu = new Usuario();
		Boolean res = usu.acceder("admin", "admin");

		assertTrue(res);

	}
	
	@Test
	public void  TestAccederFalse() {

		Usuario usu = new Usuario();
		Boolean res = usu.acceder("admin", "a");

		assertFalse(res);

	}
	
	@Test
	public void  ExisteUsuarioTrue() {

		Usuario usu = new Usuario();
		Boolean res = usu.existeUsuario("admin");

		assertTrue(res);

	}
	
	@Test
	public void  ExisteUsuarioFalse() {

		Usuario usu = new Usuario();
		Boolean res = usu.existeUsuario("jose");

		assertFalse(res);

	}
	/**
	 * FIN TEST USUARIO.JAVA
	 */
	
	/**
	 * TEST PRODUCTO.JAVA
	 */
	
	@Test
	public void  ExisteProductoTrue() {

		Boolean res = Producto.existeCodigo(1);

		assertTrue(res);

	}
	
	@Test
	public void  ExisteProductoFalse() {

		Boolean res = Producto.existeCodigo(1012);

		assertFalse(res);

	}
	
	@Test
	public void  BorradoProductoTrue() {

		Boolean res = Producto.estaBorradoCodigo(1012);

		assertTrue(res);

	}
	
	@Test
	public void  BorradoProductoFalse() {

		Boolean res = Producto.estaBorradoCodigo(1);

		assertFalse(res);

	}
	
	/**
	 * FIN TEST PRODUCTO.JAVA
	 */
	
	/**
	 * TEST PROVEEDOR.JAVA
	 */
	
	@Test
	public void  ExisteCIFTrue() {

		Boolean res = Proveedor.existeCif("025361-3137");

		assertTrue(res);

	}
	
	@Test
	public void  ExisteCIFFalse() {

		Boolean res = Proveedor.existeCif("B – 76387789");

		assertFalse(res);

	}
	
	@Test 
	public void BorradoCIFTrue() {

		Boolean res = Proveedor.estaBorradoCif("B – 76387789");

		assertTrue(res);

	}
	
	@Test
	public void  BorradoCIFFalse() {

		Boolean res = Proveedor.estaBorradoCif("025361-3137");

		assertFalse(res);

	}
	
	/**
	 * FIN TEST PROVEEDOR.JAVA
	 */
	
}
