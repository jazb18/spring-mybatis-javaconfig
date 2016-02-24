package pe.jazb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.jazb.dao.CiudadMapDAO;
import pe.jazb.domain.Ciudad;
import pe.jazb.domain.datos;

@Service("HelloWorldService")
public class HelloWorldServiceImp implements HelloWorldService {
	
	@Autowired
	CiudadMapDAO ciudadMapDAO; 
	public String mensaje(datos datos) {
		// TODO Auto-generated method stub
		return datos.getNombre();
	}
	
	public void GrabarCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		ciudadMapDAO.grabarCiudad(ciudad);
	}

}
