package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

import bbdd.conexion;
import beans.Cliente;
import modelo.Clientes;

public class Metodos {

//Metodo para calcular la edad a partir del ayo, mes y dia
//--------------------------------------------------------------
	public static int calcular_edad(Calendar fecha_nacimiento) {
		
		Calendar fechaActual= Calendar.getInstance();
		
		//Calculamos la diferencia
		
		int years = fechaActual.get(Calendar.YEAR) - fecha_nacimiento.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fecha_nacimiento.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fecha_nacimiento.get(Calendar.DAY_OF_MONTH);
        
        //Comprobamos si la fecha del cumpleaños del cliente coincide con la fecha actual, para restar 1 a la diferencia de años.
        
        if(months < 0 || (months==0 && days < 0)) { 
        	years--;
            
        }
		
        return years;
	}
	
	
	public void enviarClienteBsd(String nombre, int edad, String dni,  String direccion, int numero_movil, String email,String password) {
		
		Cliente cliente = new Cliente(edad, dni, numero_movil, numero_movil, nombre, direccion, email, password);
		new Clientes().insertarCliente(cliente);
		
		if(cliente != null) {			
			JOptionPane.showMessageDialog(null, "Enviado ");
		
		}else {
			JOptionPane.showMessageDialog(null, "Error ");
		}
	}
}
