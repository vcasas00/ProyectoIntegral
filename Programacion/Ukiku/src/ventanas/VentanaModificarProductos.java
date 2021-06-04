package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import clases.Producto;
import conectarBd.Conexion;

public class VentanaModificarProductos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldStock;
	private JTextField textFieldPrecio;
	private JTextField textFieldCategoria;
	private JTextField textFieldNombre;
	private JTextField textFieldProveedor;
	private JTextField textFieldCodigo;

	/**
	 * Create the frame.
	 */
	public VentanaModificarProductos() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(VentanaModificarProductos.class.getResource("/img/logorene.png")));
		setTitle("Ventana Modificar Productos");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 452);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblInserteLosDatos = new JLabel("Inserte Codigo Producto a Modificar");
		lblInserteLosDatos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblInserteLosDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserteLosDatos.setBounds(10, 11, 314, 21);
		contentPane.add(lblInserteLosDatos);

		JLabel lblNewLabel = new JLabel("Nombre :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(92, 157, 68, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1_1 = new JLabel("Categoria :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(81, 182, 79, 29);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Precio :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(104, 229, 56, 14);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Stock :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(104, 266, 56, 21);
		contentPane.add(lblNewLabel_1_3);

		JButton btnInsertar = new JButton("Modificar");
		btnInsertar.setForeground(Color.BLACK);
		btnInsertar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInsertar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String nombre = textFieldNombre.getText();
				int codigo = Integer.parseInt(textFieldCodigo.getText());
				String categoria = textFieldCategoria.getText();
				double precio = Integer.parseInt(textFieldPrecio.getText());
				int stock = Integer.parseInt(textFieldStock.getText());
				String proveedor = textFieldProveedor.getText();

				if (nombre.equalsIgnoreCase("") | categoria.equalsIgnoreCase("") | precio == 0 | stock == 0
						| proveedor.equalsIgnoreCase("")) {
					
					JOptionPane.showMessageDialog(rootPane, "Hay algun campo vacio");

				} else {
					
					try {

						Producto.modificacion(nombre, codigo, categoria, precio, stock, proveedor);
						JOptionPane.showMessageDialog(rootPane, "Modificado corectamente");

					} catch (Exception e1) {

						e1.printStackTrace();

					}
					
				}
				
			}
		});

		JLabel lblNewLabel_1 = new JLabel("Proveedor :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(72, 304, 88, 14);
		contentPane.add(lblNewLabel_1);
		btnInsertar.setBounds(101, 358, 130, 44);
		contentPane.add(btnInsertar);

		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(170, 152, 130, 29);
		contentPane.add(textFieldNombre);

		textFieldCategoria = new JTextField();
		textFieldCategoria.setColumns(10);
		textFieldCategoria.setBounds(170, 184, 130, 29);
		contentPane.add(textFieldCategoria);

		textFieldPrecio = new JTextField();
		textFieldPrecio.setColumns(10);
		textFieldPrecio.setBounds(170, 224, 130, 29);
		contentPane.add(textFieldPrecio);
		textFieldPrecio.setText("0");

		textFieldStock = new JTextField();
		textFieldStock.setBounds(170, 264, 130, 29);
		contentPane.add(textFieldStock);
		textFieldStock.setColumns(10);
		textFieldStock.setText("0");
		
		textFieldProveedor = new JTextField();
		textFieldProveedor.setColumns(10);
		textFieldProveedor.setBounds(170, 299, 130, 29);
		contentPane.add(textFieldProveedor);

		textFieldCodigo = new JTextField();
		textFieldCodigo.setBounds(61, 43, 86, 20);
		contentPane.add(textFieldCodigo);
		textFieldCodigo.setColumns(10);
		textFieldCodigo.setText("0");

		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Conexion cn = new Conexion();
				int codigo = Integer.parseInt(textFieldCodigo.getText());
				String sql = "SELECT* FROM producto where codigo= '" + codigo + "'";
				
				if (Producto.existeCodigo(codigo)) {

					try {
						
						cn.rs1 = cn.s.executeQuery(sql);
						Object[] fila = new Object[6];

						while (cn.rs1.next()) {

							fila[0] = cn.rs1.getString("Nombre");
							fila[1] = cn.rs1.getInt("Codigo");
							fila[2] = cn.rs1.getString("Categoría");
							fila[3] = cn.rs1.getInt("Precio");
							fila[4] = cn.rs1.getInt("Stock");
							fila[5] = cn.rs1.getString("Cif_proveedor");

						}

						textFieldNombre.setText(fila[0].toString());
						textFieldCategoria.setText(fila[2].toString());
						textFieldPrecio.setText(fila[3].toString());
						textFieldStock.setText(fila[4].toString());
						textFieldProveedor.setText(fila[5].toString());

					} catch (SQLException e1) {

						e1.printStackTrace();
						
					}
					
				} else {

					JOptionPane.showMessageDialog(contentPane, "El codigo introducido no existe");

				}

			}
		});
		btnCargar.setBounds(177, 43, 89, 23);
		contentPane.add(btnCargar);

	}
}