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
/**
 * @author Ren�, Vicent, Joaqu�n
 */
public class VentanaLogin extends JFrame {

	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JTextField textFieldContrase�a;
	private JButton btnLogin;
	private JButton btnRegistrarse;
	private JLabel lblUsuario;
	private JLabel lblSiNoEstas;
	private JLabel lblNewLabel;
	private JLabel lblContrasea;
	private JLabel lblInicioDeSesion;

	/**
	 * Creaci�n de la ventana VentanaLogin
	 */
	public VentanaLogin() {
		
		setTitle("Login | Ukiku");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaLogin.class.getResource("/img/logorene.png")));
		setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 361);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(128, 128, 128));
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Usuario u = new Usuario();

				try {
					if (u.acceder(textFieldUsuario.getText(), textFieldContrase�a.getText())) {
						JOptionPane.showMessageDialog(rootPane, "Login Correcto");
						VentanaEleccion l = new VentanaEleccion();
						l.setLocationRelativeTo(null);
						l.setVisible(true);
						setVisible(false);
						
					} else {
						
						JOptionPane.showMessageDialog(rootPane, "Login Incorrecto");
						
					}
				} catch (Exception e) {
					
					JOptionPane.showMessageDialog(contentPane, "Error en el login");
					e.printStackTrace();
				}

			}
		});
		
		btnLogin.setBounds(138, 205, 144, 23);
		contentPane.add(btnLogin);

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setForeground(new Color(255, 255, 255));
		btnRegistrarse.setBackground(new Color(128, 128, 128));
		btnRegistrarse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				VentanaRegistro r = new VentanaRegistro();
				r.setVisible(true);
				r.setLocationRelativeTo(null);
				dispose();
				
			}
		});
		btnRegistrarse.setBounds(138, 288, 144, 23);
		contentPane.add(btnRegistrarse);

		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(138, 146, 144, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);

		textFieldContrase�a = new JPasswordField();
		textFieldContrase�a.setBounds(138, 177, 144, 20);
		contentPane.add(textFieldContrase�a);
		textFieldContrase�a.setColumns(10);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBackground(Color.GRAY);
		lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUsuario.setBounds(55, 142, 73, 23);
		contentPane.add(lblUsuario);

		lblSiNoEstas = new JLabel("Si no est\u00E1s registrado... \u00A1Reg\u00EDstrate!");
		lblSiNoEstas.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSiNoEstas.setHorizontalAlignment(SwingConstants.CENTER);
		lblSiNoEstas.setBounds(55, 242, 323, 23);
		contentPane.add(lblSiNoEstas);

		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblContrasea.setBackground(Color.GRAY);
		lblContrasea.setBounds(24, 177, 104, 23);
		contentPane.add(lblContrasea);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaLogin.class.getResource("/img/xlarge_ukiku.png")));
		lblNewLabel.setBounds(21, 0, 349, 107);
		contentPane.add(lblNewLabel);

		lblInicioDeSesion = new JLabel("Inicio de sesi\u00F3n");
		lblInicioDeSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicioDeSesion.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblInicioDeSesion.setBounds(47, 108, 323, 23);
		contentPane.add(lblInicioDeSesion);
	}
}
