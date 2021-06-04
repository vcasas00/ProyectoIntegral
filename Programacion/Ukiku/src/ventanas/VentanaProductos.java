package ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import clases.Producto;
import conectarBd.Conexion;

import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 * @author René, Vicent, Joaquín
 */
public class VentanaProductos extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldCodigoEliminar;
	
	/**
	 * Creación de la ventana Productos, donde se ven los datos de todos los productos.
	 */
	public VentanaProductos() {
		setResizable(false);
		setTitle("Productos | Ukiku");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaProductos.class.getResource("/img/logorene.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 240, 838, 461);
		contentPane.add(scrollPane);
		/**
		 * Creación de la tabla que muestra los datos de los Productos
		 */
		DefaultTableModel tabla = new DefaultTableModel();
		table = new JTable(tabla);
		
		tabla.addColumn("Nombre");
		tabla.addColumn("Codigo");
		tabla.addColumn("Categoría");
		tabla.addColumn("Precio");
		tabla.addColumn("Stock");
		tabla.addColumn("Cif_proveedor");
		
		table.setDefaultEditor(Object.class, null);
		scrollPane.setViewportView(table);
		
		Conexion cn = new Conexion();
		Connection miConexion = cn.getConexion(); 
		
		try {
			cn.s = miConexion.createStatement();
			cn.rs1 = cn.s.executeQuery("SELECT* FROM producto");
			
			Object [] fila = new Object[6];
			
			while (cn.rs1.next()) {
				fila[0] = cn.rs1.getString("Nombre");
				fila[1] = cn.rs1.getInt("Codigo");
				fila[2] = cn.rs1.getString("Categoría");
				fila[3] = cn.rs1.getInt("Precio");
				fila[4] = cn.rs1.getInt("Stock");
				fila[5] = cn.rs1.getString("Cif_proveedor");
				tabla.addRow(fila);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}


		/**
		 * Creación del botón Modificar, abre la VentanaModificarProductos
		 */
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaModificarProductos vmodpro = new VentanaModificarProductos();
				vmodpro.setLocationRelativeTo(null);
				vmodpro.setVisible(true);
			}
		});
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setBackground(Color.GRAY);
		btnModificar.setBounds(858, 240, 165, 64);
		contentPane.add(btnModificar);
		
		textFieldCodigoEliminar = new JTextField();
		textFieldCodigoEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCodigoEliminar.setBounds(1088, 451, 86, 42);
		contentPane.add(textFieldCodigoEliminar);
		textFieldCodigoEliminar.setColumns(10);
		
		JLabel lblCodigoDeEl = new JLabel("Codigo del producto a eliminar:  ");
		lblCodigoDeEl.setBounds(858, 465, 204, 14);
		contentPane.add(lblCodigoDeEl);
		/**
		 * Creación del botón Eliminar, coge texto del textFieldCodigoEliminar y al pulsar el botón lo elimina.
		 */
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int codigo = Integer.parseInt(textFieldCodigoEliminar.getText());
				
				if(Producto.existeCodigo(codigo)) {
					
					Producto.borrar(codigo);
					
					if(Producto.estaBorradoCodigo(codigo)) {
						
						JOptionPane.showMessageDialog(contentPane, "Borrado correctamente");
						
					} else {
						
						JOptionPane.showMessageDialog(contentPane, "Error al borrar");
						
					}
					
				} else {
					
					JOptionPane.showMessageDialog(contentPane, "El codigo introducido no existe");
					
				}
				
			}
		});
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBackground(Color.GRAY);
		btnEliminar.setBounds(858, 390, 165, 64);
		contentPane.add(btnEliminar);
		/**
		 * Creación del botón Insertar, abre la ventana VentanaInsertarProductos.
		 */
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				VentanaInsertarProductos vintpro = new VentanaInsertarProductos();
				vintpro.setLocationRelativeTo(null);
				vintpro.setVisible(true);
				
			}
		});
		btnInsertar.setForeground(Color.WHITE);
		btnInsertar.setBackground(Color.GRAY);
		btnInsertar.setBounds(858, 315, 165, 64);
		contentPane.add(btnInsertar);
		
		/**
		 * Creación del botón Proveedores, abre la ventana VentanaProveedores.
		 */
		JButton btnProveedores = new JButton("Proveedores");
		btnProveedores.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				VentanaProveedores vprov = new VentanaProveedores();
				vprov.setLocationRelativeTo(null);
				vprov.setVisible(true);
				dispose();
				
			}
		});
		btnProveedores.setForeground(Color.WHITE);
		btnProveedores.setBackground(Color.GRAY);
		btnProveedores.setBounds(10, 712, 275, 38);
		contentPane.add(btnProveedores);
		/**
		 * Creación del botón cerrar sesión, al hacer clic se cierra la sesión actual 
		 */
		JButton btnInicio = new JButton("Cerrar sesion");
		btnInicio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				VentanaLogin vl = new VentanaLogin();
				vl.setVisible(true);
				vl.setLocationRelativeTo(null);
				dispose();
				
			}
		});
		btnInicio.setForeground(Color.WHITE);
		btnInicio.setBackground(Color.GRAY);
		btnInicio.setBounds(1009, 696, 165, 54);
		contentPane.add(btnInicio);
		
		/**
		 * Creación del botón Actualizar, actualiza la base de datos por si se modifico, inserto o elimino.
		 */
		JButton btnCargar = new JButton("Actualizar");
		btnCargar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
			//table.
				try {
					cn.s = miConexion.createStatement();
					cn.rs1 = cn.s.executeQuery("SELECT* FROM producto");
					
					Object [] fila = new Object[6];
					tabla.setRowCount(0);
					while (cn.rs1.next()) {
						fila[0] = cn.rs1.getString("Nombre");
						fila[1] = cn.rs1.getInt("Codigo");
						fila[2] = cn.rs1.getString("Categoría");
						fila[3] = cn.rs1.getInt("Precio");
						fila[4] = cn.rs1.getInt("Stock");
						fila[5] = cn.rs1.getString("Cif_proveedor");
						tabla.addRow(fila);
						table.setDefaultEditor(Object.class, null);
					}
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				 
			}
		});
		btnCargar.setForeground(Color.WHITE);
		btnCargar.setBackground(Color.GRAY);
		btnCargar.setBounds(573, 165, 275, 64);
		contentPane.add(btnCargar);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(VentanaProveedores.class.getResource("/img/xlarge_ukiku.png")));
		label.setBounds(382, 11, 347, 78);
		contentPane.add(label);
		
		JLabel label_1 = DefaultComponentFactory.getInstance().createLabel("");
		label_1.setIcon(new ImageIcon(VentanaProveedores.class.getResource("/img/logorene.png")));
		label_1.setBounds(970, 11, 204, 205);
		contentPane.add(label_1);
		
		
	}
}
