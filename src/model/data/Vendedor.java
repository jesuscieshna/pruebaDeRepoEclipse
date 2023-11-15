package model.data;

public class Vendedor extends Persona {
	public final boolean rutaEquals(Object other) {
		return ruta.equals(other);
	}

	private Ruta ruta;

	public Vendedor(String dNICliente, String nombre, Ruta ruta) {
		super(dNICliente, nombre);
		this.ruta = ruta;
	}

	public Ruta getRuta() {
		return ruta;
	}

	private void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ruta == null) ? 0 : ruta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedor other = (Vendedor) obj;
		if (ruta != other.ruta)
			return false;
		return true;
	}

	
	
}
