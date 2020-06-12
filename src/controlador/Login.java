package controlador;

import javax.swing.JOptionPane;
import modelo.Clientes;
import vista.RegistroCliente;
import vista.vistaCliente;
import beans.Cliente;

public class Login {
	public void iniciarSesion(String nombreCliente, String passwordCliente) {
		
		Cliente clienteRecogido = new Clientes().recogerCliente(nombreCliente, passwordCliente);
		if(clienteRecogido != null) {
			JOptionPane.showMessageDialog(null, "Bienvenido "+clienteRecogido.getNombre());
			
				try {
					vistaCliente frame = new vistaCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
		}else {
			JOptionPane.showMessageDialog(null, "Usuario no registrado, Registrese por favor ");
		}
	}
}
