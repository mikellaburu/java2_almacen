public class Cliente {
	//propiedades

	private String nombre;
	private String apellidos;
	private String DNI;
	private Direccion direccion;
	private double numSocio;
	private double dto;

	//métodos getter y setter
	public String getNombre() {
		return this.nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public String getDNI() {
		return this.DNI;
	}

	public Direccion getDireccion() {
		return this.direccion;
	}

	public double getNumSocio() {
		return this.numSocio;
	}

	public double getDto() {
		return this.dto;
	}

	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDNI(String dni) {
		this.DNI = dni;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setNumSucio(double numero) {
		this.numSocio = numero;
	}

	public void setDto(double descuento) {
		this.dto = descuento;
	}

}