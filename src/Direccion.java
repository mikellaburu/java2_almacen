public class Direccion {

	// atributos
	private String pueblo;
	private String calle;
	private int numero;
	private String CP;

	// getters
	public String getPueblo(){
		return this.pueblo;
	}

	public String getCalle(){
		return this.calle;
	}

	public int getNumero(){
		return this.numero;
	}

	public String getCP(){
		return this.CP;
	}

	// setters
	public void setPueblo(String localidad){
		this.pueblo = localidad;
	}

	public void setCalle(String nombreCalle){
		this.calle = nombreCalle;
	}

	public void setNumero(int num){
		this.numero = num;
	}

	public void setCP(String codPostal){
		this.CP = codPostal;
	}

}
