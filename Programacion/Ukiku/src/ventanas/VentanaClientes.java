package ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Cliente;

import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaClientes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableClientes;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { Clientes frame = new Clientes();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public VentanaClientes() {
		setTitle("Clientes - Ukiku");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaClientes.class.getResource("/img/logorene.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<Cliente> comboBox = new JComboBox<Cliente>();
		comboBox.setForeground(Color.WHITE);
		comboBox.setBackground(Color.GRAY);
		comboBox.setBounds(10, 11, 303, 31);
		contentPane.add(comboBox);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setForeground(new Color(255, 255, 255));
		btnModificar.setBackground(new Color(128, 128, 128));
		btnModificar.setBounds(323, 57, 119, 23);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setForeground(new Color(255, 255, 255));
		btnEliminar.setBackground(new Color(128, 128, 128));
		btnEliminar.setBounds(323, 91, 119, 23);
		contentPane.add(btnEliminar);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInsertar.setForeground(new Color(255, 255, 255));
		btnInsertar.setBackground(new Color(128, 128, 128));
		btnInsertar.setBounds(323, 125, 119, 23);
		contentPane.add(btnInsertar);
		
		tableClientes = new JTable();
		tableClientes.setFillsViewportHeight(true);
		tableClientes.setColumnSelectionAllowed(true);
		tableClientes.setCellSelectionEnabled(true);
		tableClientes.setBounds(10, 61, 303, 189);
		contentPane.add(tableClientes);
		
		JButton btnProductos = new JButton("Productos");
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaProductos vprod = new VentanaProductos();
				vprod.setVisible(true);
				dispose();
				
			}
		});
		btnProductos.setForeground(new Color(255, 255, 255));
		btnProductos.setBackground(new Color(128, 128, 128));
		btnProductos.setBounds(323, 159, 119, 23);
		contentPane.add(btnProductos);
		
		JButton btnProveedores = new JButton("Proveedores");
		btnProveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaProveedores vpov = new VentanaProveedores();
				vpov.setVisible(true);
				dispose();
				
			}
		});
		btnProveedores.setForeground(new Color(255, 255, 255));
		btnProveedores.setBackground(new Color(128, 128, 128));
		btnProveedores.setBounds(323, 193, 119, 23);
		contentPane.add(btnProveedores);
		
		JButton btnInicio = new JButton("Cerrar sesion");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaLogin vl = new VentanaLogin();
				vl.setVisible(true);
				dispose();
				
			}
		});
		btnInicio.setForeground(new Color(255, 255, 255));
		btnInicio.setBackground(new Color(128, 128, 128));
		btnInicio.setBounds(323, 227, 119, 23);
		contentPane.add(btnInicio);
		
		JButton btnNewButton = new JButton("Cargar");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(323, 11, 119, 31);
		contentPane.add(btnNewButton);
	}
}
