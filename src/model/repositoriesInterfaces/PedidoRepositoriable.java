package model.repositoriesInterfaces;


import java.util.List;
import java.util.Optional;

import model.data.Articulo;
import model.data.Cliente;
import model.data.Pedido;
import model.data.PedidoAlmacen;
import model.data.PedidoComercial;
import model.data.Vendedor;

public interface PedidoRepositoriable{
	public  List<Pedido> findPedidosByCliente(Optional<Cliente> findClienteByDni);
	public List<Pedido> findPedidosWithArticulo(Articulo articulo);
	public void add(PedidoComercial pedidoComercial);
	public void add(PedidoAlmacen pedidoAlmacen);
	public void findById(Long id);
	public void borrar(Long id);
	public List<PedidoComercial> findByVendedor(Vendedor vendedor);
	
	
}
