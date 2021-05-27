package ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Elegir extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblEligeAQue_1;
	private JButton btnClientes;
	private JButton btnProveedor;
	private JButton btnProductos;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { Elegir frame = new Elegir();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public Elegir() {
		setResizable(false);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Elegir.class.getResource("/img/logorene.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 181);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEligeAQue_1 = new JLabel("Elige a que registro quieres acceder");
		lblEligeAQue_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEligeAQue_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEligeAQue_1.setBounds(0, 11, 387, 50);
		contentPane.add(lblEligeAQue_1);
		
		btnClientes = new JButton("Clientes");
		btnClientes.setBackground(new Color(135, 206, 250));
		btnClientes.setBounds(0, 93, 115, 59);
		contentPane.add(btnClientes);
		
		btnProveedor = new JButton("Proveedor");
		btnProveedor.setBackground(new Color(107, 142, 35));
		btnProveedor.setBounds(137, 93, 115, 59);
		contentPane.add(btnProveedor);
		
		btnProductos = new JButton("Productos");
		btnProductos.setBackground(new Color(255, 105, 180));
		btnProductos.setBounds(272, 93, 115, 59);
		contentPane.add(btnProductos);
		
	}
}
