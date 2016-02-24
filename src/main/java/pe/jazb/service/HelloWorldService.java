package pe.jazb.service;

import pe.jazb.domain.Ciudad;
import pe.jazb.domain.datos;

public interface HelloWorldService {
	
	public String mensaje(datos datos);

	public void GrabarCiudad(Ciudad ciudad);
}
