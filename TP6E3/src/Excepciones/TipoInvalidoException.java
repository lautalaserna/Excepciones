package Excepciones;

public class TipoInvalidoException extends CargaInvalidaException {

	public TipoInvalidoException(String arg0, DatoInvalido datoInvalido) {
		super(arg0, datoInvalido);
	}

}
