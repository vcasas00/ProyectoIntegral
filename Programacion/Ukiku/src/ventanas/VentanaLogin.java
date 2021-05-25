package ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JTextField textFieldContraseña;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { VentanaLogin frame = new
	 * VentanaLogin(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public VentanaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUkiku = new JLabel("Ukiku");
		lblUkiku.setFont(new Font("Yu Gothic", Font.BOLD, 30));
		lblUkiku.setHorizontalAlignment(SwingConstants.CENTER);
		lblUkiku.setBounds(93, 11, 112, 48);
		contentPane.add(lblUkiku);

		/**
		 * Boton para hacer el login.
		 */
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO funcionalidad login
			}
		});
		btnLogin.setBounds(103, 138, 104, 23);
		contentPane.add(btnLogin);

		/**
		 * Boton para registrarse.
		 */
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO funcionalidad de registrarse
			}
		});
		btnRegistrarse.setBounds(103, 227, 104, 23);
		contentPane.add(btnRegistrarse);

		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(93, 70, 144, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);

		textFieldContraseña = new JTextField();
		textFieldContraseña.setBounds(93, 107, 144, 20);
		contentPane.add(textFieldContraseña);
		textFieldContraseña.setColumns(10);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUsuario.setBounds(10, 73, 46, 14);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblContrasea.setBounds(10, 110, 73, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblSiNoEstas = new JLabel("Si no estas registrado... \u00A1Reg\u00EDstrate!");
		lblSiNoEstas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSiNoEstas.setHorizontalAlignment(SwingConstants.CENTER);
		lblSiNoEstas.setBounds(50, 182, 217, 23);
		contentPane.add(lblSiNoEstas);
	}
}
