package clases;

import java.util.ArrayList;

/**
 * @author Ren�, Vicent, Joaqu�n
 * 
 * <b>Clase Ukiku</b>
 *
 */
public class Ukiku extends Usuario{
	
	private ArrayList<Ciente> listarClientes;
	private ArrayList<Producto> listarProducto;
	private ArrayList<Proveedor> listarProveedor;
	
	public Ukiku() {
		
	}
	
	public ArrayList<Ciente> getListarClientes() {
		
		return listarClientes;
		
	}
	public void setListarClientes(ArrayList<Ciente> listarClientes) {
		
		this.listarClientes = listarClientes;
		
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
	
	public void accederAClientes() {
		
	}
	
	public void accederAProveedores() {
		
	}
	
	public void accederAProductos() {
		
	}
	
}
