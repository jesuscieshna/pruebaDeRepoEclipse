package model.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import model.adapters.Keyable;

public class PedidoComercial extends Pedido implements Serializable{
	// propiedades
	private Vendedor vendedor;

	public PedidoComercial(long numeroDeSerie, LocalDate fecha, Cliente cliente,
			Set<LineaPedido> lineasPedido,Vendedor vendedor) {
		super(numeroDeSerie, fecha, cliente, lineasPedido);
		this.vendedor = vendedor;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	private void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	

	
}
