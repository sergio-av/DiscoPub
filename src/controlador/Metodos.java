package controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

import bbdd.conexion;
import beans.Cliente;
import beans.Empresa;
import beans.Evento;
import modelo.Clientes;
import modelo.Empresas;
import modelo.Eventos;

public class Metodos {

//Metodo para calcular la edad a partir del ayo, mes y dia
//--------------------------------------------------------------
	
	
	
	public void enviarClienteBsd(String nombre, int edad, String dni,  String direccion, int numero_movil, String email,String password) {
		
		Cliente cliente = new Cliente(edad, dni, numero_movil, nombre, direccion, email, password);
		new Clientes().insertarCliente(cliente);
		
		if(cliente != null) {			
			JOptionPane.showMessageDialog(null, "Enviado ");
		
		}else {
			JOptionPane.showMessageDialog(null, "Error ");
		}
	}
	
	public void enviarEmpresaBsd(String nombre, int numero_atencion, String nif,  String direccion, int numero_movil, String email,String password) {
		
		Empresa empresa = new Empresa(numero_atencion, nif,  numero_movil, nombre, direccion, email, password);
		new Empresas().insertarEmpresa(empresa);
		
		if(empresa != null) {			
			JOptionPane.showMessageDialog(null, "Enviado ");
		
		}else {
			JOptionPane.showMessageDialog(null, "Error ");
		}
	}
	
	public void enviarEventoBsd(String nombre, int aforo, String localizacion, int entradas , int precio) {
		
		Evento evento = new Evento( aforo, precio, entradas, nombre, localizacion);
		new Eventos().insertarEvento(evento);
		
		if(evento != null) {			
			JOptionPane.showMessageDialog(null, "Enviado ");
		
		}else {
			JOptionPane.showMessageDialog(null, "Error ");
		}
	}
	
	public void restarEntrada(Evento eventoRecogido, int entradasCompradas) {
		int entradas = eventoRecogido.getEntradas();
		
		if(entradas == 0) {
			JOptionPane.showMessageDialog(null, "No hay mas entradas, los sentimos te esperamos la proxima vez");
		}else if(entradas > 0){
			
			entradas =entradas - entradasCompradas;
			
			conexion.Conectar();
			conexion.EjecutarUpdate("UPDATE EVENTOS SET ENTRADAS = '"+entradas+"' Where NOMBRE = '"+eventoRecogido.getNombre()+"'");
			JOptionPane.showMessageDialog(null,"Usted ha comprado "+entradasCompradas+" para "+eventoRecogido.getNombre());
			
		}
	}

	public void escribirEntrada(Cliente cliente, Evento eventoRecogido)   {
		//System.out.println("e");
		File file = new File("Entrada.txt");
		try {
		
		FileWriter fileWrite = new FileWriter(file);
		
		PrintWriter fichero = new PrintWriter(fileWrite);
       
            // Crear el objeto que va a escribir el fichero
           
        	String  linea = "Entrada para: "+eventoRecogido.getNombre()+" perteneciente a "+cliente.getNombre()+" Con DNI:"+cliente.getDni()+"\nEntrada valorada en: "+eventoRecogido.getPrecio();
               fichero.write(linea);
                
            fichero.close();
            
        } catch (IOException e) {
            System.out.println(e);
        }
	}
	
	
}
