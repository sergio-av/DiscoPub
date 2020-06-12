package beans;


import java.util.GregorianCalendar;
import controlador.Metodos;

public class Cliente extends Usuario{

	private int edad;
	private String dni;

	
	//Constructores
	
	public Cliente() {}
	
	public Cliente(int edad,String dni,int id, int numero_movil, String nombre, String direccion, String email, String password) {
		super(id, numero_movil,  nombre,  direccion,  email, password);
		this.edad=edad;
		this.dni=dni;
	}
	
	//GETS AND SETS	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	//Metodos
	public  int obtener_edad() {
		
		int year=0;
		int month=0;
		int day=0;
		
		return edad=Metodos.calcular_edad(new GregorianCalendar(year,month,day));
	}
	
}
