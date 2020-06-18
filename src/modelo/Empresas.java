package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.Empresa;

public class Empresas {
	
	//***********	Insertar informacion empresa	*************
	public void insertarEmpresa(Empresa empresa) {
		String password= empresa.getPassword();
		String nombre = empresa.getNombre();
		String email = empresa.getEmail();
		String direccion = empresa.getDireccion();
		String nif = empresa.getNif();
		int numero_movil = empresa.getNumero_movil();
		int numero_atencion = empresa.getNumero_atencion();
		
		conexion.EjecutarUpdate("INSERT INTO empresas (nombre, password, email, direccion, nif, numero_movil, numero_atencion) VALUES ('"+nombre+"','"+password+"','"+email+"','"+direccion+"','"+nif+"','"+numero_movil+"','"+numero_atencion+"');");
		
	}
	//***********	Comprobar Contraseña y usuario	**************
	/*	public boolean checkUserAndPass(String email, String password) {
			ResultSet clienteBD = conexion.EjecutarSentencia("SELECT * FROM clientes WHERE EMAIL='"+email+"' AND PASSWORD='"+password+"'");
			
			try {
				return clienteBD.next();
			} catch (SQLException e) {
				return false;
			}
		}*/
	//*****************		Obtener empresa apartir del nombre y la contraseña		*************
		/*public Cliente getUserByEmailAndPass(String email, String password) {
			ResultSet clienteBD = conexion.EjecutarSentencia("SELECT * FROM clientes WHERE EMAIL='"+email+"' AND PASSWORD='"+password+"'");
			Cliente cliente = new modelo.Clientes().getUserByEmailAndPass(email, password);
			return cliente;
		}*/
		//***********	Recoger emnpresa	**************************
		
		public Empresa recogerEmpresa(String nombreEmpresa, String passwordEmpresa) {
			ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM empresas WHERE NOMBRE='"+nombreEmpresa+"' AND PASSWORD='"+passwordEmpresa+"';");
			try {
				if(resultado.next()) {
					
					int id = resultado.getInt("id");
					int numero_movil= resultado.getInt("numero_movil");
					int numero_atencion = resultado.getInt("numero_atencion");
					String nif = resultado.getString("nif");
					String password = resultado.getString("password");
					String nombre = resultado.getString("nombre");
					String email = resultado.getString("email");
					String direccion = resultado.getString("direccion");
					
					Empresa empresaRecogida = new Empresa( numero_atencion, nif, id,  numero_movil,  nombre,  direccion, email, password);
					return empresaRecogida;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			/* Transformacion */
			return null;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------------------------	
		public Empresa recogerEmpresaId(int idRecogido) {
			ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM empresas WHERE ID='"+idRecogido+"';");
			try {
				if(resultado.next()) {
					
					int id = resultado.getInt("id");
					int numero_movil= resultado.getInt("numero_movil");
					int numero_atencion = resultado.getInt("numero_atencion");
					String nif = resultado.getString("nif");
					String password = resultado.getString("password");
					String nombre = resultado.getString("nombre");
					String email = resultado.getString("email");
					String direccion = resultado.getString("direccion");
					
					Empresa empresaRecogida = new Empresa( numero_atencion, nif, id,  numero_movil,  nombre,  direccion, email, password);
					return empresaRecogida;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			/* Transformacion */
			return null;
		}
		
		
		
		//***********	Obtener todas las empresas	************************
		public ArrayList<Empresa> recogerTodasEmpresas(){
			ArrayList<Empresa> empresas = new ArrayList<Empresa>();
			ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM empresas;");
			try {
				while(resultado.next()) {
					
					int id = resultado.getInt("id");
					int numero_movil= resultado.getInt("numero_movil");
					int numero_atencion = resultado.getInt("numero_atencion");
					String nif = resultado.getString("nif");
					String password = resultado.getString("password");
					String nombre = resultado.getString("nombre");
					String email = resultado.getString("email");
					String direccion = resultado.getString("direccion");
					
					empresas.add(new Empresa( numero_atencion, nif, id,  numero_movil,  nombre,  direccion, email, password));
					return empresas;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			/* Transformacion */
			return empresas;
			
		}
		
		//****************** Actualizar empresa	******************
		
		public void ActualizarEmpresa(String nombreEmpresa, String emailEmpresa, String nifEmpresa, String passwordEmpresa, String direccionEmpresa, int numero_atencionEmpresa , int numero_movilEmpresa, int id) {

			conexion.Conectar();
			conexion.EjecutarUpdate("UPDATE EMPRESAS SET NOMBRE = '"+nombreEmpresa+"',EMAIL = '"+emailEmpresa+"',NUMERO_MOVIL = '"+numero_movilEmpresa+"',NUMERO_ATENCION = '"+numero_atencionEmpresa+"',PASSWORD = '"+passwordEmpresa+"',DIRECCION = '"+direccionEmpresa+"',NIF = '"+nifEmpresa+"' Where ID = '"+id+"'");;
		}
		
		
}

