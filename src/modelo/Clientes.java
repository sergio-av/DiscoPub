package modelo;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.Cliente;

public class Clientes {
	
	//***********	Insertar informacion cliente	*************
	public void insertarCliente(Cliente cliente) {
		String password= cliente.getPassword();
		String nombre = cliente.getNombre();
		String email = cliente.getEmail();
		String direccion = cliente.getDireccion();
		String dni = cliente.getDni();
		int numero_movil = cliente.getNumero_movil();
		int edad = cliente.getEdad();
		
		conexion.EjecutarUpdate("INSERT INTO clientes (nombre, password, email, direccion, dni, numero_movil, edad) VALUES ('"+nombre+"','"+password+"','"+email+"','"+direccion+"','"+dni+"','"+numero_movil+"','"+edad+"');");
		
	}
	//***********	Comprobar Contraseña y usuario	**************
	/*	public boolean checkUserAndPass(String email, String password) {
			ResultSet clienteBD = conexion.EjecutarSentencia("SELECT * FROM clientes WHERE EMAIL='"+email+"' AND PASSWORD='"+password+"'");
			
			try {
				return clienteBD.next();
			} catch (SQLException e) {
				return false;
			}
		}
	//*****************		Obtener cliente apartir del nombre y la contraseña		*************
		public Cliente getUserByEmailAndPass(String email, String password) {
			ResultSet clienteBD = conexion.EjecutarSentencia("SELECT * FROM clientes WHERE EMAIL='"+email+"' AND PASSWORD='"+password+"'");
			Cliente cliente = new modelo.Clientes().getUserByEmailAndPass(email, password);
			return cliente;
		}*/
		//***********	Recoger Cliente	**************************
		
		public Cliente recogerCliente(String nombreCliente, String passwordCliente) {
			ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM clientes WHERE NOMBRE='"+nombreCliente+"' AND PASSWORD='"+passwordCliente+"';");
			try {
				if(resultado.next()) {
					
					int id = resultado.getInt("id");
					int numero_movil= resultado.getInt("numero_movil");
					int edad = resultado.getInt("edad");
					String dni = resultado.getString("dni");
					String password = resultado.getString("password");
					String nombre = resultado.getString("nombre");
					String email = resultado.getString("email");
					String direccion = resultado.getString("direccion");
					
					Cliente clienteRecogido = new Cliente( edad, dni, id,  numero_movil,  nombre,  direccion, email, password);
					return clienteRecogido;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			/* Transformacion */
			return null;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------------------------	
		public Cliente recogerClienteNombre(int idRecogido) {
			ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM clientes WHERE ID='"+idRecogido+"';");
			try {
				if(resultado.next()) {
					
					int id = resultado.getInt("id");
					int numero_movil= resultado.getInt("numero_movil");
					int edad = resultado.getInt("edad");
					String dni = resultado.getString("dni");
					String password = resultado.getString("password");
					String nombre = resultado.getString("nombre");
					String email = resultado.getString("email");
					String direccion = resultado.getString("direccion");
					
					Cliente clienteRecogido = new Cliente( edad, dni, id,  numero_movil,  nombre,  direccion, email, password);
					return clienteRecogido;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			/* Transformacion */
			return null;
		}
		
		
		
		//***********	Obtener todos los clientes	************************
		public ArrayList<Cliente> recogerTodosClientes(){
			ArrayList<Cliente> clientes = new ArrayList<Cliente>();
			ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM clientes;");
			try {
				while(resultado.next()) {
					
					int id = resultado.getInt("id");
					int numero_movil= resultado.getInt("numero_movil");
					int edad = resultado.getInt("edad");
					String dni = resultado.getString("dni");
					String password = resultado.getString("password");
					String nombre = resultado.getString("nombre");
					String email = resultado.getString("email");
					String direccion = resultado.getString("direccion");
					
					clientes.add(new Cliente( edad, dni, id,  numero_movil,  nombre,  direccion, email, password));
					return clientes;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			/* Transformacion */
			return clientes;
			
		}
		
		//****************** Actualizar cliente		******************
		
		public void ActualizarCliente(String nombreCliente, String emailCliente, String dniCliente, String passwordCliente, String direccionCliente, int edadCliente, int numero_movilCliente, int id) {

			conexion.Conectar();
			conexion.EjecutarUpdate("UPDATE Clientes SET NOMBRE = '"+nombreCliente+"',EMAIL = '"+emailCliente+"',NUMERO_MOVIL = '"+numero_movilCliente+"',EDAD = '"+edadCliente+"',PASSWORD = '"+passwordCliente+"',DIRECCION = '"+direccionCliente+"',DNI = '"+dniCliente+"' Where ID = '"+id+"'");;
		}
		
		
}