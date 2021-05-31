package ventanas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import clases.Proveedor;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInsertarProveedor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldCif;
	private JTextField textFieldDireccion;
	private JTextField textFieldTelefono;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { VentanaInsertarProveedor frame = new
	 * VentanaInsertarProveedor(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public VentanaInsertarProveedor() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 452);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		JLabel lblInserteLosDatos = new JLabel("Inserte los datos del Proveedor");
		lblInserteLosDatos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblInserteLosDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserteLosDatos.setBounds(38, 11, 262, 21);
		contentPane.add(lblInserteLosDatos);

		JLabel lblNewLabel = new JLabel("Nombre :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(80, 60, 68, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1_1 = new JLabel("CIF :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(109, 138, 39, 29);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_3 = new JLabel("Direccion :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(69, 223, 79, 21);
		contentPane.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_3_1 = new JLabel("Telefono :");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(69, 272, 79, 21);
		contentPane.add(lblNewLabel_1_3_1);

		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(170, 55, 130, 29);
		contentPane.add(textFieldNombre);

		textFieldCif = new JTextField();
		textFieldCif.setColumns(10);
		textFieldCif.setBounds(170, 138, 130, 29);
		contentPane.add(textFieldCif);

		textFieldDireccion = new JTextField();
		textFieldDireccion.setColumns(10);
		textFieldDireccion.setBounds(170, 221, 130, 29);
		contentPane.add(textFieldDireccion);

		textFieldTelefono = new JTextField();
		textFieldTelefono.setColumns(10);
		textFieldTelefono.setBounds(170, 270, 130, 29);
		contentPane.add(textFieldTelefono);

		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String nombre = textFieldNombre.getText();
				String cif = textFieldCif.getText();
				String direccion = textFieldDireccion.getText();
				int telefono = Integer.parseInt(textFieldTelefono.getText());
				
				try {
					
				Proveedor.insertar(nombre, cif, direccion, telefono);
				JOptionPane.showMessageDialog(rootPane, "Insertado corectamente");
				
				} catch (Exception e1) {

					JOptionPane.showMessageDialog(rootPane, "Fallo al insertar");

					e1.printStackTrace();
					
				}
				textFieldNombre.setText(null);
				textFieldCif.setText(null);
				textFieldDireccion.setText(null);
				textFieldTelefono.setText(null);
			}
		});
		btnInsertar.setForeground(Color.BLACK);
		btnInsertar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInsertar.setBounds(223, 358, 101, 44);
		contentPane.add(btnInsertar);

	}
}
