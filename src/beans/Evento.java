package beans;

public class Evento {

	private int id;
	private int aforo;
	private int precio;
	private int entradas_totales;
	private int entradas_restantes;
	private String nombre;
	private String localizacion;
	
	//Constructores
	Evento(){}
	Evento(int id,int aforo,int precio,int entradas_totales,int entradas_restantes,String nombre,String localizacion){
		this.id=id;
		this.aforo=aforo;
		this.precio=precio;
		this.entradas_totales=entradas_totales;
		this.entradas_restantes=entradas_restantes;
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
	public int getEntradas_totales() {
		return entradas_totales;
	}
	public void setEntradas_totales(int entradas_totales) {
		this.entradas_totales = entradas_totales;
	}
	public int getEntradas_restantes() {
		return entradas_restantes;
	}
	public void setEntradas_restantes(int entradas_restantes) {
		this.entradas_restantes = entradas_restantes;
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
