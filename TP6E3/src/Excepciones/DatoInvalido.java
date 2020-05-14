package Excepciones;

public class DatoInvalido {
	private int cantDisponible;
	private int cantRequerida;
	private String tipo;

	public DatoInvalido(int cantDisponible, int cantRequerida, String tipo) {
		this.cantDisponible = cantDisponible;
		this.cantRequerida = cantRequerida;
		this.tipo = tipo;
	}

	public double getCantDisponible() {
		return cantDisponible;
	}

	public double getCantRequerida() {
		return cantRequerida;
	}

	public String getTipo() {
		return tipo;
	}

}
