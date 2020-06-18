package controlador;

import javax.swing.JOptionPane;
import modelo.Clientes;
import modelo.Empresas;
import vista.RegistroCliente;
import vista.vistaCliente;
import beans.Cliente;
import beans.Empresa;
import vista.VistaEmpresa;

public class Login {
	public void iniciarSesion(String nombreCliente, String passwordCliente) {
		
		Cliente clienteRecogido = new Clientes().recogerCliente(nombreCliente, passwordCliente);
		if(clienteRecogido != null) {
			JOptionPane.showMessageDialog(null, "Bienvenido "+clienteRecogido.getNombre());
			
				
			vistaCliente frame = new vistaCliente(clienteRecogido);
			frame.setVisible(true);
				
			
		}else {
			JOptionPane.showMessageDialog(null, "Cliente no registrado, Registrese por favor ");
		}
	}
	public void iniciarSesionEmpresa(String nombreEmpresa, String passwordEmpresa) {
		
		Empresa empresaRecogida = new Empresas().recogerEmpresa(nombreEmpresa, passwordEmpresa);
		if(empresaRecogida != null) {
			JOptionPane.showMessageDialog(null, "Bienvenido "+empresaRecogida.getNombre());
			
				
			VistaEmpresa frame = new VistaEmpresa(empresaRecogida);
			frame.setVisible(true);
				
			
		}else {
			JOptionPane.showMessageDialog(null, "Empresa no registrada, Registrese por favor ");
		}
	}
}
