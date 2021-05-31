package clases;

import java.util.ArrayList;

/**
 * @author René, Vicent, Joaquín
 * 
 * <b>Clase Ukiku</b>
 *
 */
public class Ukiku extends Usuario{
	
	private ArrayList<Producto> listarProducto;
	private ArrayList<Proveedor> listarProveedor;
	
	public Ukiku() {
		
	}
	
	
	public ArrayList<Producto> getListarProducto() {
		
		return listarProducto;
		
	}
	
	public void setListarProducto(ArrayList<Producto> listarProducto) {
		
		this.listarProducto = listarProducto;
		
	}
	
	public ArrayList<Proveedor> getListarProveedor() {
		
		return listarProveedor;
		
	}
	
	public void setListarProveedor(ArrayList<Proveedor> listarProveedor) {
		
		this.listarProveedor = listarProveedor;
		
	}
	
	public void accederAProveedores() {
		
	}
	
	public void accederAProductos() {
		
	}
	
}
