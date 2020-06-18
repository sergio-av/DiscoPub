package beans;

public class Usuario {
	
	/* Variables que van a heredar Cliente y Empresa */

	private int id;
	private int numero_movil;
	private String password;
	private String nombre;
	private String direccion;
	private String email;
	
	/*Constructores */
	
	public Usuario(){}
	
	public Usuario(int id, int numero_movil, String nombre, String direccion, String email,String password ){
		this.password=password;
		this.id=id;
		this.numero_movil=numero_movil;
		this.nombre=nombre;
		this.direccion=direccion;
		this.direccion=direccion;
		
	}
	public Usuario( int numero_movil, String nombre, String direccion, String email,String password ){
		this.password=password;
		this.numero_movil=numero_movil;
		this.nombre=nombre;
		this.direccion=direccion;
		this.direccion=direccion;
		
	}
	
	/*GET AND SET */
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNumero_movil() {
		return numero_movil;
	}

	public void setNumero_movil(int numero_movil) {
		this.numero_movil = numero_movil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
