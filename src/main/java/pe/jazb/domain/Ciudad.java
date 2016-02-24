package pe.jazb.domain;

import java.io.Serializable;

public class Ciudad implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 179086979869024480L;
	
	private int clave;
	private String nombre;
	private int poblacion;

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	@Override
	public String toString() {
		return "Ciudad [clave=" + clave + ", nombre=" + nombre + ", poblacion=" + poblacion + "]";
	}

}
