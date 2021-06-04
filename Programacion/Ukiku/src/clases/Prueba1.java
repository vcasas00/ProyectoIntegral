package clases;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.*;

class Prueba1 {
//TEST USUARIO.JAVA
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
	// FIN TEST USUARIO.JAVA
	
	//TEST PRODUCTO.JAVA
	
	@Test
	public void  ExisteProductoTrue() {

		Producto pro = new Producto();
		Boolean res = pro.existeCodigo(3);

		assertTrue(res);

	}
	
	@Test
	public void  ExisteProductoFalse() {

		Producto pro = new Producto();
		Boolean res = pro.existeCodigo(1012);

		assertFalse(res);

	}
	
	@Test
	public void  BorradoProductoTrue() {

		Producto pro = new Producto();
		Boolean res = pro.estaBorradoCodigo(1012);

		assertTrue(res);

	}
	
	@Test
	public void  BorradoProductoFalse() {

		Producto pro = new Producto();
		Boolean res = pro.estaBorradoCodigo(3);

		assertFalse(res);

	}
	
	// FIN TEST PRODUCTO.JAVA
	
	// TEST PROVEEDOR.JAVA
	
	@Test
	public void  ExisteCIFTrue() {

		Proveedor prov = new Proveedor();
		Boolean res = prov.existeCif("A – 76387789");

		assertTrue(res);

	}
	
	@Test
	public void  ExisteCIFFalse() {

		Proveedor prov = new Proveedor();
		Boolean res = prov.existeCif("B – 76387789");

		assertFalse(res);

	}
	
	@Test 
	public void BorradoCIFTrue() {

		Proveedor prov = new Proveedor();
		Boolean res = prov.estaBorradoCif("B – 76387789");

		assertTrue(res);

	}
	
	@Test
	public void  BorradoCIFFalse() {

		Proveedor prov = new Proveedor();
		Boolean res = prov.estaBorradoCif("A – 76387789");

		assertFalse(res);

	}
	
	
}
