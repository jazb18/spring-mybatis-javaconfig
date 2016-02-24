package pe.jazb.domain;

import java.io.Serializable;

public class datos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public datos() {
		// TODO Auto-generated constructor stub
	}

	private String nombre;
	private String apellido;
	private String edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "datos [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

}
