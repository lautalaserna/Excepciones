package Paquete;

import Excepciones.CargaInvalidaException;
import Excepciones.FaltaCombustibleException;
import Excepciones.TipoInvalidoException;

public class Prueba {

	public static void main(String[] args) {
		Estacion e = Estacion.getInstance();
		e.nuevoSurtidor(new Surtidor());
		try {
			e.getSurtidores().get(0).cargarCombustible(200, "Super");
			e.getSurtidores().get(0).cargarCombustible(100, "Super");
			e.getSurtidores().get(0).cargarCombustible(100, "Gasoil");
			e.getSurtidores().get(0).cargarCombustible(100, "Premium");
			//e.getSurtidores().get(0).cargarCombustible(100, "Supert");
			//e.getSurtidores().get(0).cargarCombustible(1000000, "Super");
		} catch (FaltaCombustibleException e1) {
			System.out.println(e1.getMessage() + e1.getDatoInvalido().getCantDisponible());
		} catch (TipoInvalidoException e1) {
			System.out.println(e1.getMessage() + e1.getDatoInvalido().getTipo());
		} catch (CargaInvalidaException e1) {
			System.out.println(e1.getMessage() + e1.getDatoInvalido().getCantRequerida());
		}
		System.out.println(e);
	}
}
