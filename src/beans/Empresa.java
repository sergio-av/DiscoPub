package beans;

public class Empresa extends Usuario{
	private int numero_atencion;
	private int nif;
	
	//Constructores
	public Empresa() {}
	public Empresa(int numero_atencion, int nif) {
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
	public int getNif() {
		return nif;
	}
	public void setNif(int nif) {
		this.nif = nif;
	}
}
