package Excepciones;

public class CargaInvalidaException extends Exception {
	DatoInvalido datoInvalido;

	public CargaInvalidaException(String arg0, DatoInvalido datoInvalido) {
		super(arg0);
		this.datoInvalido=datoInvalido;
	}

	public DatoInvalido getDatoInvalido() {
		return datoInvalido;
	}

}
