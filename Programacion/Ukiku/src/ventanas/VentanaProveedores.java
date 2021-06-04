package ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import clases.Proveedor;
import conectarBd.Conexion;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 * @author René, Vicent, Joaquín
 */
public class VentanaProveedores extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldCif;

	/**
	 * Creación de la ventana Proveedores, muestra todos los datos de todos los proveedores existentes.
	 */
	public VentanaProveedores() {
		setBackground(Color.LIGHT_GRAY);
		setResizable(false);
		setTitle("Proveedores | Ukiku");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaProveedores.class.getResource("/img/logorene.png")));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
 * Creación de la tabla donde se mostrarán todos los datos de los Proveedores.
 */
		DefaultTableModel tabla = new DefaultTableModel();
		table = new JTable(tabla);

		tabla.addColumn("Nombre");
		tabla.addColumn("Cif");
		tabla.addColumn("Dirección");
		tabla.addColumn("Teléfono");

		table.setDefaultEditor(Object.class, null);
		scrollPane.setViewportView(table);
		
		Conexion cn = new Conexion();
		Connection miConexion = cn.getConexion(); 
		
		try {
			cn.s = miConexion.createStatement();
			cn.rs1 = cn.s.executeQuery("SELECT* FROM proveedor");
			
			Object [] fila = new Object[5];
			
			while (cn.rs1.next()) {
				fila[0] = cn.rs1.getString("Nombre");
				fila[1] = cn.rs1.getString("Cif");
				fila[2] = cn.rs1.getString("Dirección");
				fila[3] = cn.rs1.getInt("Teléfono");
				tabla.addRow(fila);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
/**
 * Creación del botón Modificar, abre la ventana VentanaModificarProveedores para cambiar algun campo de los Proveedores.
 */
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				VentanaModificarProveedores vip = new VentanaModificarProveedores();
				vip.setVisible(true);
				vip.setLocationRelativeTo(null);
				
			}
		});
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setBackground(Color.GRAY);
		btnModificar.setBounds(858, 240, 165, 64);
		contentPane.add(btnModificar);
/**
 * Creación del botón Eliminar, coge texto del textFieldCif y elimina el Proveedor.
 */
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String cif = textFieldCif.getText();

				if (Proveedor.existeCif(cif)) {
					
					Proveedor.borrar(cif);

					if(Proveedor.estaBorradoCif(cif)) {
						
						JOptionPane.showMessageDialog(contentPane, "Borrado correctamente");
						
					} else {
						
						JOptionPane.showMessageDialog(contentPane, "Error al borrar");
						
					}

				} else {

					JOptionPane.showMessageDialog(contentPane, "El Cif introducido no existe");

				}

			}
		});
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBackground(Color.GRAY);
		btnEliminar.setBounds(858, 390, 165, 64);
		contentPane.add(btnEliminar);
		/**
		 * Creación del botón Insertar, abre la ventana VentanaInsertarProveedor.
		 */
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaInsertarProveedor vip = new VentanaInsertarProveedor();
				vip.setVisible(true);
				vip.setLocationRelativeTo(null);
			}
		});
		btnInsertar.setForeground(Color.WHITE);
		btnInsertar.setBackground(Color.GRAY);
		btnInsertar.setBounds(858, 315, 165, 64);
		contentPane.add(btnInsertar);
/**
 * Creación del botón Productos, cambia a la ventana VentanaProductos.
 */
		JButton btnProveedores = new JButton("Productos");
		btnProveedores.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				VentanaProductos vprod = new VentanaProductos();
				vprod.setLocationRelativeTo(null);
				vprod.setVisible(true);
				dispose();

			}
		});
		btnProveedores.setForeground(Color.WHITE);
		btnProveedores.setBackground(Color.GRAY);
		btnProveedores.setBounds(10, 712, 275, 38);
		contentPane.add(btnProveedores);
/**
 * Creación del botón Cerrar Sesión, cierra la sesión actual.
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
 * Creación del botón Actualizar, recarga la tabla por si ha habido alguna modificacion, insercion o eliminacion.
 */
		JButton btnCargar = new JButton("Actualizar");
		btnCargar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
			//table.
				try {
					cn.s = miConexion.createStatement();
					cn.rs1 = cn.s.executeQuery("SELECT* FROM proveedor");
					
					Object [] fila = new Object[5];
					tabla.setRowCount(0);
					while (cn.rs1.next()) {
						
						fila[0] = cn.rs1.getString("Nombre");
						fila[1] = cn.rs1.getString("Cif");
						fila[2] = cn.rs1.getString("Dirección");
						fila[3] = cn.rs1.getInt("Teléfono");
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

		JLabel lblIntroduceElCif = new JLabel("CIF del proveedor a eliminar:");
		lblIntroduceElCif.setBounds(858, 465, 235, 14);
		contentPane.add(lblIntroduceElCif);

		textFieldCif = new JTextField();
		textFieldCif.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCif.setColumns(10);
		textFieldCif.setBounds(1033, 451, 86, 42);
		contentPane.add(textFieldCif);
	}
}
