package beans;

public class Evento {

	private int id;
	private int aforo;
	private int precio;
	private int entradas;
	private String nombre;
	private String localizacion;
	
	//Constructores
	public Evento(){}
	public Evento(int id,int aforo,int precio,int entradas,String nombre,String localizacion){
		this.id=id;
		this.aforo=aforo;
		this.precio=precio;
		this.entradas=entradas;
		this.nombre=nombre;
		this.localizacion=localizacion;
	}
	public Evento(int aforo,int precio,int entradas,String nombre,String localizacion){
		this.aforo=aforo;
		this.precio=precio;
		this.entradas=entradas;
		this.nombre=nombre;
		this.localizacion=localizacion;
	}
	
	//GETS AND SETS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAforo() {
		return aforo;
	}
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getEntradas() {
		return entradas;
	}
	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
}
