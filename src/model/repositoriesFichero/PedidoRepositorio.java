package model.repositoriesFichero;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.Articulo;
import model.data.Cliente;
import model.data.Pedido;
import model.data.PedidoAlmacen;
import model.data.PedidoComercial;
import model.data.Vendedor;
import model.repositoriesInterfaces.PedidoAlmacenRepositorio;
import model.repositoriesInterfaces.PedidoComercialRepositorio;
import model.repositoriesInterfaces.PedidoRepositoriable;
import objectMother.PedidosComercialOM;

public class PedidoRepositorio implements PedidoRepositoriable{
	PedidoComercialRepositorio pedidoComercialRepo;
	PedidoAlmacenRepositorio pedidoAlamcenRepo;
	
	public PedidoRepositorio(String pedidosComercialesPath, String pedidoAlmacenPath) {
		pedidoComercialRepo = new PedidoComercialRepositorioFichero(pedidosComercialesPath);
		pedidoAlamcenRepo = new PedidoAlmacenRepositorioFichero(pedidoAlmacenPath);
	}

	public List<Pedido> findPedidosByCliente(Optional<Cliente> findClienteByDni) {
		return findAll().stream()
				.filter(pedido-> pedido.getCliente().equals(findClienteByDni.get()))
				.collect(Collectors.toList());
	}

	public List<Pedido> findPedidosWithArticulo(Articulo articulo) {
		return findAll().stream().filter((pedido)->{
			System.out.println(pedido.getKey());
			return pedido.contains(articulo);
		}).collect(Collectors.toList());
	}

	public List<Pedido> findAll() {
		List<Pedido> aux = pedidoComercialRepo.findAll().stream()
				.map(pedido->(Pedido)pedido)
				.collect(Collectors.toList());
		aux.addAll(pedidoAlamcenRepo.findAll().stream()
				.map(pedido->(Pedido)pedido)
				.collect(Collectors.toList()));
		return aux;
	}

	@Override
	public void add(PedidoComercial pedidoComercial) {
		pedidoComercialRepo.add(pedidoComercial);
	}

	@Override
	public void add(PedidoAlmacen pedidoAlmacen) {
		pedidoAlamcenRepo.add(pedidoAlmacen);
	}

	@Override
	public void findById(Long id) {
		findAll().stream().filter(e->e.getNumeroDeSerie().equals(id));
	}

	@Override
	public void borrar(Long id) {
		pedidoComercialRepo.borrar(id);
		pedidoAlamcenRepo.borrar(id);
	}

	@Override
	public List<PedidoComercial> findByVendedor(Vendedor vendedor) {
		return pedidoComercialRepo.findByVendedor(vendedor);
	}
	
	




	
}
