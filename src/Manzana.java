public class Manzana {
	// atributos
	private String tipoManzana;
	private String procedencia;
	private String color;
	private double eurosKilo;
	private Distribuidor distribuidor;

	// getters
	public String getTipoManzana(){
		return this.tipoManzana;
	}

	public String getProcedencia(){
		return this.procedencia;
	}

	public String getColor(){
		return this.color;
	}

	public double getEurosKilo(){
		return this.eurosKilo;
	}

	public Distribuidor getDistribuidor(){
		return this.distribuidor;
	}

	// setters
	public void setTipoManzana(String tipo){
		this.tipoManzana = tipo;
	}

	public void setProcedencia(String origen){
		this.procedencia = origen;
	}

	public void setColor(String color){
		this.color = color;
	}

	public void setEurosKilo(double precio){
		this.eurosKilo = precio;
	}

	public void setDistribuidor(Distribuidor nombreDistribuidor){
		this.distribuidor = nombreDistribuidor;
	}


}