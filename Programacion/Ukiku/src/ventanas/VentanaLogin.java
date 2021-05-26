package ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import clases.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class VentanaLogin extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JTextField textFieldContraseña;
	private JButton btnLogin;
	private JButton btnRegistrarse;
	private JLabel lblUsuario;
	private JLabel lblSiNoEstas;
	private JLabel lblNewLabel;
	private JLabel lblContrasea;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("K:\\PI\\Programacion\\Ukiku\\src\\img\\ukikulogo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO funcionalidad login
			Usuario u = new Usuario();
			
			if(u.acceder(textFieldUsuario.getText(), textFieldContraseña.getText())) {
				JOptionPane.showMessageDialog(rootPane, "Login Correcto");
			} else {
				JOptionPane.showMessageDialog(rootPane, "Login Incorrecto");
			}
				
			}
		});
		btnLogin.setBounds(148, 183, 104, 23);
		contentPane.add(btnLogin);

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro r = new Registro();
				r.setVisible(true);
			}
		});
		btnRegistrarse.setBounds(148, 261, 104, 23);
		contentPane.add(btnRegistrarse);

		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(138, 115, 144, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);

		textFieldContraseña = new JPasswordField();
		textFieldContraseña.setBounds(138, 152, 144, 20);
		contentPane.add(textFieldContraseña);
		textFieldContraseña.setColumns(10);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBackground(Color.GRAY);
		lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUsuario.setBounds(10, 111, 73, 23);
		contentPane.add(lblUsuario);
		
		lblSiNoEstas = new JLabel("Si no estas registrado... \u00A1Reg\u00EDstrate!");
		lblSiNoEstas.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSiNoEstas.setHorizontalAlignment(SwingConstants.CENTER);
		lblSiNoEstas.setBounds(47, 227, 323, 23);
		contentPane.add(lblSiNoEstas);
		
		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblContrasea.setBackground(Color.GRAY);
		lblContrasea.setBounds(10, 152, 104, 23);
		contentPane.add(lblContrasea);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("K:\\PI\\Programacion\\Ukiku\\src\\img\\xlarge_ukiku.png"));
		lblNewLabel.setBounds(21, 0, 349, 107);
		contentPane.add(lblNewLabel);
	}
}
