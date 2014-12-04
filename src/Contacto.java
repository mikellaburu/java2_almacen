public class Contacto {

	// atributos
	private String nombreContacto;
	private String tlf;
	private String email;

	// getters
	public String getNombreContacto(){
		return this.nombreContacto;
	}

	public String getTlf(){
		return this.tlf;
	}

	public String getEmail(){
		return this.email;
	}

	// setters
	public void setNombreContacto(String nombre){
		this.nombreContacto = nombre;
	}

	public void setTlf(String telefono){
		this.tlf = telefono;
	}

	public void setEmail(String correo){
		this.email = correo;
	}

}