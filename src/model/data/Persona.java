package model.data;

import java.io.Serializable;

import model.adapters.Keyable;

public class Persona implements Serializable, Keyable<String>{
	private String dNICliente;
	private String nombre;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dNICliente == null) ? 0 : dNICliente.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dNICliente == null) {
			if (other.dNICliente != null)
				return false;
		} else if (!dNICliente.equals(other.dNICliente))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}



	public Persona(String dNICliente, String nombre) {
		super();
		this.dNICliente = dNICliente;
		this.nombre = nombre;
	}
	public String getdNICliente() {
		return dNICliente;
	}

	public void setdNICliente(String dNICliente) {
		this.dNICliente = dNICliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String getKey() {
		return dNICliente;
	}

}