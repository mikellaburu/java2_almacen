public class leche {

	// atributos
	private String tipo;
	private String procedencia;
	private Double eurosLitro;
	private Distribuidor distribuidor;

	// getters
	public String getTipo(){
		return this.tipo;
	}

	public String getProcedencia(){
		return this.procedencia;
	}

	public double getEurosLitro(){
		return this.eurosLitro;
	}

	public Distribuidor getDistribuidor(){
		return this.distribuidor;
	}

	// setters
	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public void setProcedencia(String origen){
		this.procedencia = origen;
	}

	public void setEurosLitro(double precio){
		this.eurosLitro = precio;
	}

	public void setDistribuidor(Distribuidor nombreDistribuidor){
		this.distribuidor = nombreDistribuidor;
	}


}