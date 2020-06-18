package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.Empresa;
import beans.Evento;

public class Eventos {
	
	//***********	Insertar informacion Evento	*************
		public void insertarEvento(Evento evento) {
			int entradas = evento.getEntradas();
			int aforo =evento.getAforo();
			int precio =evento.getPrecio(); 
			String nombre = evento.getNombre();
			String localizacion = evento.getLocalizacion();
			
			conexion.EjecutarUpdate("INSERT INTO eventos (nombre, aforo, precio, entradas, localizacion) VALUES ('"+nombre+"','"+entradas+"','"+aforo+"','"+precio+"','"+localizacion+"');");
			
		}
//***********	Recoger Evento	************************************	
	public Evento recogerEvento(String nombreEvento) {
		ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM eventos WHERE NOMBRE='"+nombreEvento+"';");
		try {
			if(resultado.next()) {
				
				int id = resultado.getInt("id");
				int entradas = resultado.getInt("entradas");
				int aforo = resultado.getInt("aforo");
				int precio = resultado.getInt("precio");
				String nombre = resultado.getString("nombre");
				String localizacion = resultado.getString("localizacion");
				
				Evento eventoRecogido = new Evento( entradas, aforo, id,  precio,  nombre,  localizacion);
				return eventoRecogido;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/* Transformacion */
		return null;
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------	
	public Evento recogerEventoId(int idRecogido) {
		ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM eventos WHERE ID='"+idRecogido+"';");
		try {
			if(resultado.next()) {
				
				int id = resultado.getInt("id");
				int entradas = resultado.getInt("entradas");
				int aforo = resultado.getInt("aforo");
				int precio = resultado.getInt("precio");
				String nombre = resultado.getString("nombre");
				String localizacion = resultado.getString("localizacion");
				
				Evento eventoRecogido = new Evento( entradas, aforo, id,  precio,  nombre,  localizacion);
				return eventoRecogido;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/* Transformacion */
		return null;
	}
	
	
	
	//***********	Obtener todas los eventos	************************
	public ArrayList<Evento> recogerTodosEventos(){
		conexion.Conectar();
		ArrayList<Evento> eventos = new ArrayList<Evento>();
		ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM eventos;");
		try {
			while(resultado.next()) {
				
				int id = resultado.getInt("id");
				int entradas = resultado.getInt("entradas");
				int aforo = resultado.getInt("aforo");
				int precio = resultado.getInt("precio");
				String nombre = resultado.getString("nombre");
				String localizacion = resultado.getString("localizacion");
				
				
				
				eventos.add(new Evento(  entradas, aforo, id,  precio,  nombre,  localizacion));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/* Transformacion */
		return eventos;
		
	}
	
	//****************** Actualizar evento	******************
	
	public void ActualizarEvento(int entradasEvento, String nombreEvento, int id) {

		conexion.Conectar();
		conexion.EjecutarUpdate("UPDATE EVENTOS SET NOMBRE = '"+nombreEvento+"',ENTRADAS = '"+entradasEvento+"' Where ID = '"+id+"'");
	}
	
//*************************	Borrar Evento	***********************
	public void BorrarEvento(String nombreEvento) {
		
		
		
		conexion.Conectar();
		conexion.EjecutarUpdate("DELETE FROM EVENTOS WHERE NOMBRE = '"+nombreEvento+"'");
	}
}
