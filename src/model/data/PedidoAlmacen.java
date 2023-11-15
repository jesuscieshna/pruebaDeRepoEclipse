package model.data;

import java.time.LocalDate;
import java.util.Set;

public class PedidoAlmacen extends Pedido{
	//propiedades
	private Dependiente dependiente;

	public PedidoAlmacen(long numeroDeSerie, LocalDate fecha, Cliente cliente, Set<LineaPedido> lineasPedido,
			Dependiente dependiente) {
		super(numeroDeSerie, fecha, cliente, lineasPedido);
		this.dependiente = dependiente;
	}

	private Dependiente getDependiente() {
		return dependiente;
	}

	private void setDependiente(Dependiente dependiente) {
		this.dependiente = dependiente;
	}

	
}
