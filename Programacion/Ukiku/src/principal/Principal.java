package principal;

import java.awt.Toolkit;

import ventanas.VentanaLogin;

public class Principal {
	
	public static void main(String[] args) {
		
		VentanaLogin vl  = new VentanaLogin();
		vl.setLocationRelativeTo(null);
		vl.setVisible(true);
		vl.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaLogin.class.getResource("/img/logorene.png")));
		
	}

}



