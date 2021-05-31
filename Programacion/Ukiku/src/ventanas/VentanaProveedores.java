package ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

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

public class VentanaProveedores extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { Proveedores frame = new Proveedores();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public VentanaProveedores() {
		setTitle("Proveedores | Ukiku");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaProveedores.class.getResource("/img/logorene.png")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(400, 400, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 240, 838, 461);
		contentPane.add(scrollPane);
		
		DefaultTableModel tabla = new DefaultTableModel();
		table = new JTable(tabla);
		
		tabla.addColumn("Nombre");
		tabla.addColumn("Cif");
		tabla.addColumn("Dirección");
		tabla.addColumn("Teléfono");
		
		
		scrollPane.setViewportView(table);
		
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setBackground(Color.GRAY);
		btnModificar.setBounds(858, 240, 165, 64);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			}
		});
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBackground(Color.GRAY);
		btnEliminar.setBounds(858, 315, 165, 64);
		contentPane.add(btnEliminar);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaInsertarProveedor vip = new VentanaInsertarProveedor();
				vip.setVisible(true);
				vip.setLocationRelativeTo(null);
			}
		});
		btnInsertar.setForeground(Color.WHITE);
		btnInsertar.setBackground(Color.GRAY);
		btnInsertar.setBounds(858, 390, 165, 64);
		contentPane.add(btnInsertar);
		
		
		JButton btnProveedores = new JButton("Productos");
		btnProveedores.addActionListener(new ActionListener() {
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
		
		JButton btnInicio = new JButton("Cerrar sesion");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaLogin vl = new VentanaLogin();
				vl.setVisible(true);
				dispose();
				
			}
		});
		btnInicio.setForeground(Color.WHITE);
		btnInicio.setBackground(Color.GRAY);
		btnInicio.setBounds(1009, 696, 165, 54);
		contentPane.add(btnInicio);
		
		
		JButton btnCargar = new JButton("Cargar Datos");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
					// TODO Auto-generated catch block
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
