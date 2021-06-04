package ventanas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import clases.Proveedor;
import conectarBd.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class VentanaModificarProveedores extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCif;
	private JTextField textFieldNombre;
	private JTextField textFieldDireccion;
	private JTextField textFieldTelefono;

	/**
	 * Create the frame.
	 */
	public VentanaModificarProveedores() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VentanaModificarProveedores.class.getResource("/img/logorene.png")));
		setTitle("Ventana modificar proveedroes | ukiku");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 411, 452);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblInserteElCif = new JLabel("Inserte el CIF del proveedor a Modificar");
		lblInserteElCif.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserteElCif.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblInserteElCif.setBounds(10, 11, 375, 21);
		contentPane.add(lblInserteElCif);

		textFieldCif = new JTextField();
		textFieldCif.setColumns(10);
		textFieldCif.setBounds(67, 43, 86, 20);
		contentPane.add(textFieldCif);

		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Conexion cn = new Conexion();
				String cif = textFieldCif.getText();
				String sql = "select * from proveedor where cif = '"+cif+"'";

				if (Proveedor.existeCif(cif)) {

					try {

						cn.rs1 = cn.s.executeQuery(sql);
						Object[] fila = new Object[4];

						while (cn.rs1.next()) {

							fila[0] = cn.rs1.getString("Nombre");
							fila[1] = cn.rs1.getString("Cif");
							fila[2] = cn.rs1.getString("Dirección");
							fila[3] = cn.rs1.getInt("Teléfono");

						}
						
						textFieldNombre.setText(fila[0].toString());
						textFieldDireccion.setText(fila[2].toString());
						textFieldTelefono.setText(fila[3].toString());

					} catch (SQLException e1) {

						e1.printStackTrace();

					}
					
				} else {
					
					JOptionPane.showMessageDialog(contentPane, "El Cif introducido no existe");
					
				}
				
			}
		});
		btnCargar.setBounds(183, 43, 89, 23);
		contentPane.add(btnCargar);

		JLabel lblNewLabel = new JLabel("Nombre :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(98, 157, 68, 14);
		contentPane.add(lblNewLabel);

		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(176, 152, 130, 29);
		contentPane.add(textFieldNombre);

		textFieldDireccion = new JTextField();
		textFieldDireccion.setColumns(10);
		textFieldDireccion.setBounds(176, 184, 130, 29);
		contentPane.add(textFieldDireccion);

		JLabel lblNewLabel_1_1 = new JLabel("Direcci\u00F3n :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(95, 182, 71, 29);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("telefono :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(98, 229, 68, 14);
		contentPane.add(lblNewLabel_1_2);

		textFieldTelefono = new JTextField();
		textFieldTelefono.setText("0");
		textFieldTelefono.setColumns(10);
		textFieldTelefono.setBounds(176, 224, 130, 29);
		contentPane.add(textFieldTelefono);

		JButton btnInsertar = new JButton("Modificar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = textFieldNombre.getText();
				String cif = textFieldCif.getText();
				String direccion = textFieldDireccion.getText();
				int telefono = Integer.parseInt(textFieldTelefono.getText());
				
				if (nombre.equalsIgnoreCase("") | direccion.equalsIgnoreCase("") | telefono == 0) {
					
					JOptionPane.showMessageDialog(rootPane, "Hay algun campo vacio");
					
				} else {
					
					try {
						
						Proveedor.modificar(nombre, cif, direccion, telefono);
						JOptionPane.showMessageDialog(rootPane, "Modificado corectamente");
						
					} catch (Exception e1) {
						
						e1.printStackTrace();
						
					}
					
				}
				
			}
		});
		btnInsertar.setForeground(Color.BLACK);
		btnInsertar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInsertar.setBounds(134, 358, 138, 44);
		contentPane.add(btnInsertar);
	}
}
