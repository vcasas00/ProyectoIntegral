package ventanas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Productos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { Productos frame = new Productos();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public Productos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Productos.class.getResource("/img/logorene.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 11, 303, 31);
		contentPane.add(comboBox);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(335, 64, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnModificar_1 = new JButton("Eliminar");
		btnModificar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar_1.setBounds(335, 127, 89, 23);
		contentPane.add(btnModificar_1);
		
		JButton btnModificar_2 = new JButton("Nuevo");
		btnModificar_2.setBounds(335, 199, 89, 23);
		contentPane.add(btnModificar_2);
	}

}
