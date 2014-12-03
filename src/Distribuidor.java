public class Distribuidor {
	// atributos
	private String nombre;
	private String CIF;
	private Direccion direccion;
	private Contacto personaContacto;

	// getters
	public String getNombre(){
		return this.nombre;
	}

	public String getCIF(){
		return this.CIF;
	}

	public Direccion getDireccion(){
		return this.direccion;
	}

	public Contacto getPersonaContacto(){
		return this.personaContacto;
	}

	// setters
	public void setNombre(String nombreDistribuidor){
		this.nombre = nombreDistribuidor;
	}

	public void setCIF(String codigo){
		this.CIF = codigo;
	}

	public void setDireccion(Direccion donde){
		this.direccion = donde;
	}

	public void setPersonaContacto(Contacto nombreContacto){
		this.personaContacto = nombreContacto;
	}

}