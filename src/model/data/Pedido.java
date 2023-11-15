package model.data;

import java.awt.Dimension;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;
import java.util.Map.Entry;

import model.adapters.Keyable;

import java.util.Set;

public abstract class Pedido implements Serializable, Keyable<Long>{
	//propiedades
	private Long numeroDeSerie;
	private LocalDate fecha;
	private Cliente cliente;
	private Set<LineaPedido> lineasPedido;
	
	public Pedido(long numeroDeSerie, LocalDate fecha, Cliente cliente, Set<LineaPedido> lineasPedido) {
		this.numeroDeSerie = numeroDeSerie;
		this.fecha = fecha;
		this.cliente = cliente;
		this.lineasPedido = lineasPedido;
	}
	
	public void addLinea(Articulo articulo,int cantidad) {
		lineasPedido.add(new LineaPedido(articulo, cantidad));
	}
	public void deleteLinea(Articulo articulo) {
		//TODO
	}
	
	public float getCuantia() {
		//recorre mapa para retornar total
		float total=0;
		for (LineaPedido linea : lineasPedido) {
			total+=linea.getSubTotal();
		}
		return total;
	}
	public boolean contains(Articulo articulo) {
		return lineasPedido.stream().anyMatch((linea)->{
			return linea.getArticulo().equals(articulo);
		});
	}

	public Long getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public Set<LineaPedido> getLineas(){
		return lineasPedido;
	}
	
	public Long getKey() {
		return getNumeroDeSerie();
	}
	
	public void info() {
		System.out.println(this.getNumeroDeSerie());
	}
	
	
	
}
