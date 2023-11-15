package model.data;

import java.io.Serializable;

import model.adapters.Keyable;

public class LineaPedido implements Serializable, Keyable<Articulo>{
	private Articulo articulo;
	private int cantidad;
	public LineaPedido(Articulo articulo, int cantidad) {
		super();
		this.articulo = articulo;
		this.cantidad = cantidad;
	}
	Articulo getArticulo() {
		return articulo;
	}
	private void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	private int getCantidad() {
		return cantidad;
	}
	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((articulo == null) ? 0 : articulo.hashCode());
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
		LineaPedido other = (LineaPedido) obj;
		if (articulo == null) {
			if (other.articulo != null)
				return false;
		} else if (!articulo.equals(other.articulo))
			return false;
		return true;
	}
	public float getSubTotal() {
		return getCantidad()*articulo.getPrecio();
	}
	@Override
	public Articulo getKey() {
		return articulo;
	}
	
	
}
