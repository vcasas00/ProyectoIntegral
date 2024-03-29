package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import clases.Proveedor;
/**
 * @author Ren�, Vicent, Joaqu�n
 */
public class VentanaInsertarProductos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldStock;
	private JTextField textFieldPrecio;
	private JTextField textFieldCategoria;
	private JTextField textFieldNombre;
	private JTextField textFieldProveedor;

	/**
	 * Creaci�n de la ventana VentanaInsertarProductos
	 */
	public VentanaInsertarProductos() {
		setResizable(false);
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(VentanaInsertarProductos.class.getResource("/img/logorene.png")));
		setTitle("Insertar productos | Ukiku");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 452);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * Mensaje de recordatorio para el usuario, debe exisistir antes el proveedor que el producto.
		 */
		JOptionPane.showMessageDialog(contentPane, "Recuerde insertar el proveedor antes que el producto.");

		JLabel lblInserteLosDatos = new JLabel("Inserte los datos del Producto");
		lblInserteLosDatos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblInserteLosDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserteLosDatos.setBounds(38, 11, 262, 21);
		contentPane.add(lblInserteLosDatos);

		JLabel lblNewLabel = new JLabel("Nombre :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(80, 60, 68, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1_1 = new JLabel("Categoria :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(69, 138, 79, 29);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Precio :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(92, 178, 56, 14);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Stock :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(92, 222, 56, 21);
		contentPane.add(lblNewLabel_1_3);
/**
 * Creaci�n del bot�n Insertar, inserta un nuevo producto cuando todos los campos estan llenos y el proveedor existe.
 */
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setForeground(Color.BLACK);
		btnInsertar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInsertar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					
					String nombre = textFieldNombre.getText();
					String categoria = textFieldCategoria.getText();
					double precio = Integer.parseInt(textFieldPrecio.getText());
					int stock = Integer.parseInt(textFieldStock.getText());
					String proveedor = textFieldProveedor.getText();

					if (nombre.equalsIgnoreCase("") | categoria.equalsIgnoreCase("")
							| textFieldPrecio.getText().equalsIgnoreCase("")
							| textFieldStock.getText().equalsIgnoreCase("") | proveedor.equalsIgnoreCase("")) {

						JOptionPane.showMessageDialog(contentPane, "hay algun campo vacio");

					} else {
						
						if(Proveedor.existeCif(proveedor)) {
							
							Producto.insertar(nombre, categoria, precio, stock, proveedor);
							JOptionPane.showMessageDialog(rootPane, "Insertado corectamente");
							
						} else {
							
							JOptionPane.showMessageDialog(contentPane, "El Proveedor introducido no existe");
							
						}
						
					}
					

				} catch (Exception e1) {

					JOptionPane.showMessageDialog(rootPane, "Fallo al insertar");

					e1.printStackTrace();
				}
				textFieldNombre.setText(null);
				textFieldCategoria.setText(null);
				textFieldPrecio.setText("0");
				textFieldStock.setText("0");
				textFieldProveedor.setText(null);
			}
		});

		JLabel lblNewLabel_1 = new JLabel("Proveedor :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(60, 264, 88, 14);
		contentPane.add(lblNewLabel_1);
		btnInsertar.setBounds(223, 358, 101, 44);
		contentPane.add(btnInsertar);

		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(170, 55, 130, 29);
		contentPane.add(textFieldNombre);

		textFieldCategoria = new JTextField();
		textFieldCategoria.setColumns(10);
		textFieldCategoria.setBounds(170, 140, 130, 29);
		contentPane.add(textFieldCategoria);

		textFieldPrecio = new JTextField();
		textFieldPrecio.setColumns(10);
		textFieldPrecio.setBounds(170, 180, 130, 29);
		contentPane.add(textFieldPrecio);
		textFieldPrecio.setText("0");

		textFieldStock = new JTextField();
		textFieldStock.setBounds(170, 220, 130, 29);
		contentPane.add(textFieldStock);
		textFieldStock.setColumns(10);
		textFieldStock.setText("0");

		textFieldProveedor = new JTextField();
		textFieldProveedor.setColumns(10);
		textFieldProveedor.setBounds(170, 260, 130, 29);
		contentPane.add(textFieldProveedor);

	}
}
