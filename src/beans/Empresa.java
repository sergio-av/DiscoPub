package beans;

public class Empresa extends Usuario{
	private int numero_atencion;
	private String nif;
	
	//Constructores
	public Empresa() {}
	public Empresa(int numero_atencion, String nif ,int id, int numero_movil, String nombre, String direccion, String email, String password) {
		super(id,numero_movil,nombre,direccion,email,password);
		this.numero_atencion=numero_atencion;
		this.nif=nif;
	}
	public Empresa(int numero_atencion, String nif , int numero_movil, String nombre, String direccion, String email, String password) {
		super(numero_movil,nombre,direccion,email,password);
		this.numero_atencion=numero_atencion;
		this.nif=nif;
	}
	
	//GETS AND SETS
	
	public int getNumero_atencion() {
		return numero_atencion;
	}
	public void setNumero_atencion(int numero_atencion) {
		this.numero_atencion = numero_atencion;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
}
