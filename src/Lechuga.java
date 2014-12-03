public class Lechuga {

	// atributos
	private String tipoLechuga;
	private String procedencia;
	private String color;
	private Double eurosUnidad;
	private Distribuidor distribuidor;

	//getters
	public String getTipoLechuga(){
		return this.tipoLechuga;
	}

	public String getProcedencia(){
		return this.procedencia;
	}

	public String getColor(){
		return this.color;
	}

	public double getEurosUnidad(){
		return this.eurosUnidad;
	}

	public Distribuidor getDistribuidor(){
		return this.distribuidor;
	}

	// setters
	public void setTipoLechuga(String tipo){
		this.tipoLechuga = tipo;
	}

	public void setProcedencia(String origen){
		this.procedencia = origen;
	}

	public void setColor(String color){
		this.color = color;
	}

	public void setEurosUnidad(double precio){
		this.eurosUnidad = precio;
	}

	public void setDistribuidor(Distribuidor nombreDistribuidor){
		this.distribuidor = nombreDistribuidor;
	}	


}