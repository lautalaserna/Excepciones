package Paquete;

import java.util.ArrayList;
import java.util.Iterator;

public class Estacion {
	private ArrayList<Surtidor> surtidores = new ArrayList<Surtidor>();
	private static Estacion instance = null;

	private Estacion() {
	}

	public static Estacion getInstance() {
		if (instance == null)
			Estacion.instance = new Estacion();
		return instance;
	}

	public void nuevoSurtidor(Surtidor s) {
		surtidores.add(s);
	}

	public ArrayList<Surtidor> getSurtidores() {
		return surtidores;
	}

	@Override
	public String toString() {
		String rta = "Estacion:\n";
		Iterator<Surtidor> it = surtidores.iterator();
		while (it.hasNext()) {
			Surtidor s = it.next();
			rta += " " + s.toString() + "\n";
		}
		return rta;
	}

}
