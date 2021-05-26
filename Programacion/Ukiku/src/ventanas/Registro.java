package ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author René, Vicent, Joaquín
 *
 */
public class Registro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldnombre;
	private JTextField textFieldContraseña;
	private JLabel lblUkiku;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JButton btnRegistrarse;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { Registro frame = new Registro();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public Registro() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 356, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUkiku = new JLabel("Ukiku");
		lblUkiku.setHorizontalAlignment(SwingConstants.CENTER);
		lblUkiku.setFont(new Font("Yu Gothic", Font.BOLD, 30));
		lblUkiku.setBounds(112, 27, 112, 48);
		contentPane.add(lblUkiku);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUsuario.setBounds(10, 88, 46, 14);
		contentPane.add(lblUsuario);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblContrasea.setBounds(10, 129, 73, 14);
		contentPane.add(lblContrasea);
		
		textFieldnombre = new JTextField();
		textFieldnombre.setColumns(10);
		textFieldnombre.setBounds(91, 86, 144, 20);
		contentPane.add(textFieldnombre);
		
		textFieldContraseña = new JPasswordField();
		textFieldContraseña.setColumns(10);
		textFieldContraseña.setBounds(93, 127, 144, 20);
		contentPane.add(textFieldContraseña);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuario u = new Usuario();
				u.registrarse(textFieldnombre.getText(), textFieldContraseña.getText());
				JOptionPane.showMessageDialog(rootPane, "Añadido correctamente");
			}
		});
		btnRegistrarse.setBounds(112, 191, 106, 23);
		contentPane.add(btnRegistrarse);
		
	}
}
