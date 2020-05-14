package Paquete;

import Excepciones.CargaInvalidaException;
import Excepciones.DatoInvalido;
import Excepciones.FaltaCombustibleException;
import Excepciones.TipoInvalidoException;

public class Surtidor {
	private int cantGasoil;
	private int cantSuper;
	private int cantPremium;
	private static int tope = 20000;

	public Surtidor() {
		this.cantGasoil = tope; 
		this.cantSuper = tope;
		this.cantPremium = tope;
	}

	public int getCantGasoil() {
		return cantGasoil;
	}

	public int getCantSuper() {
		return cantSuper;
	}

	public int getCantPremium() {
		return cantPremium;
	}

	public void cargarCombustible(int cantidad, String tipo) throws CargaInvalidaException {
		if (tipo.equals("Gasoil")) {
			if (cantidad > 0) {
				if (this.cantGasoil >= cantidad)
					this.cantGasoil -= cantidad;
				else
					throw new FaltaCombustibleException("Falta Gasoil ", new DatoInvalido(this.cantGasoil, cantidad, tipo));
			} else
				throw new CargaInvalidaException("Carga Invalida ", new DatoInvalido(this.cantGasoil, cantidad, tipo));
		} else if (tipo.equals("Super")) {
			if (cantidad > 0) {
				if (this.cantSuper >= cantidad)
					this.cantSuper -= cantidad;
				else
					throw new FaltaCombustibleException("Falta Super ", new DatoInvalido(this.cantSuper, cantidad, tipo));
			} else
				throw new CargaInvalidaException("Carga Invalida ", new DatoInvalido(this.cantSuper, cantidad, tipo));
		} else if (tipo.equals("Premium")) {
			if (cantidad > 0) {
				if (this.cantPremium >= cantidad)
					this.cantPremium -= cantidad;
				else
					throw new FaltaCombustibleException("Falta Premium ", new DatoInvalido(this.cantPremium, cantidad, tipo));
			} else
				throw new CargaInvalidaException("Carga Invalida ", new DatoInvalido(this.cantPremium, cantidad, tipo));
		}
		else {
			throw new TipoInvalidoException("No existe tipo ",new DatoInvalido(0, cantidad, tipo));
		}
	}

	public void llenarCombustible(String tipo) {
		if (tipo.equals("Gasoil"))
			this.cantGasoil = tope;
		else if (tipo.equals("Super"))
			this.cantSuper = tope;
		else if (tipo.equals("Premium"))
			this.cantSuper = tope;
	}

	@Override
	public String toString() {
		return "Surtidor [Gasoil:" + cantGasoil + ", Super:" + cantSuper + ", Premium:" + cantPremium + "]";
	}
	
	
}
