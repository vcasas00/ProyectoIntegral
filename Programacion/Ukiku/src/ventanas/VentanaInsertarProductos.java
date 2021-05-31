package ventanas;

import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.border.EmptyBorder;

import clases.Producto;

public class VentanaInsertarProductos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldStock;
	private JTextField textFieldPrecio;
	private JTextField textFieldCategoria;
	private JTextField textFieldCodigo;
	private JTextField textFieldNombre;
	private JTextField textFieldCIF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInsertarProductos frame = new VentanaInsertarProductos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaInsertarProductos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaInsertarProductos.class.getResource("/img/logorene.png")));
		setTitle("Ventana Insertar Productos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 452);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblInserteLosDatos = new JLabel("Inserte los datos del Producto");
		lblInserteLosDatos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblInserteLosDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserteLosDatos.setBounds(38, 11, 262, 21);
		contentPane.add(lblInserteLosDatos);


		JLabel lblNewLabel = new JLabel("Nombre :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(80, 60, 68, 14);
		contentPane.add(lblNewLabel);

		JLabel lblApellido = new JLabel("Codigo :");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApellido.setBounds(80, 106, 68, 21);
		contentPane.add(lblApellido);

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

		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setForeground(Color.BLACK);
		btnInsertar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Producto.insertar(textFieldNombre.getText(),Integer.parseInt(textFieldCodigo.getText()),textFieldCategoria.getText(),Integer.parseInt(textFieldPrecio.getText()),Integer.parseInt(textFieldStock.getText()),textFieldCIF.getText());
					
					JOptionPane.showMessageDialog(rootPane, "Insertado corectamente");
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(rootPane, "Fallo al insertar");
					e1.printStackTrace();
				}
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("CIF Proveedor :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(38, 264, 110, 14);
		contentPane.add(lblNewLabel_1);
		btnInsertar.setBounds(223, 358, 101, 44);
		contentPane.add(btnInsertar);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(170, 55, 130, 29);
		contentPane.add(textFieldNombre);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setColumns(10);
		textFieldCodigo.setBounds(170, 100, 130, 29);
		contentPane.add(textFieldCodigo);
		
		textFieldCategoria = new JTextField();
		textFieldCategoria.setColumns(10);
		textFieldCategoria.setBounds(170, 140, 130, 29);
		contentPane.add(textFieldCategoria);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setColumns(10);
		textFieldPrecio.setBounds(170, 180, 130, 29);
		contentPane.add(textFieldPrecio);
		
		textFieldStock = new JTextField();
		textFieldStock.setBounds(170, 220, 130, 29);
		contentPane.add(textFieldStock);
		textFieldStock.setColumns(10);
		
		textFieldCIF = new JTextField();
		textFieldCIF.setBounds(170, 260, 130, 29);
		contentPane.add(textFieldCIF);
		textFieldCIF.setColumns(10);
	}

}
