package control.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.Articulo;
import model.data.Cliente;
import model.data.Pedido;
import model.data.Vendedor;
import model.repositories.ArticuloRepositorio;
import model.repositories.ClienteRepositorio;
import model.repositories.VendedorRepositorioFOM;
import model.repositoriesFichero.PedidoRepositorio;
import model.repositoriesInterfaces.ArticuloRepositoriable;
import model.repositoriesInterfaces.ClienteRepositoriable;
import model.repositoriesInterfaces.PedidoComercialRepositorio;
import model.repositoriesInterfaces.PedidoRepositoriable;

public class VentaService {

	private PedidoRepositoriable pedidoRepositorio;
	private ArticuloRepositoriable articuloRepositorio;
	private ClienteRepositoriable clienteRepositorio;
	
	public VentaService(PedidoRepositoriable pedidoRepositorio, ArticuloRepositoriable articuloRepositorio,
			ClienteRepositoriable clienteRepositorio) {
		super();
		this.articuloRepositorio = articuloRepositorio;
		this.clienteRepositorio = clienteRepositorio;
		this.pedidoRepositorio = pedidoRepositorio;
	}


	public List<Pedido> getPedidosByClienteDni(String dni){
		return pedidoRepositorio.findPedidosByCliente(clienteRepositorio.findById(dni));
	}


	public List<Pedido> findPedidosByCliente(Optional<Cliente> findClienteByDni) {
		return pedidoRepositorio.findPedidosByCliente(findClienteByDni);
	}


	public List<Cliente> findClientes() {
		return clienteRepositorio.findAll();
	}


	public Optional<Cliente> findClienteByDni(String dni) {
		return clienteRepositorio.findById(dni);
	}


	public List<Pedido> getPedidosWithArticulo(Integer idArticulo) {
		return pedidoRepositorio.findPedidosWithArticulo(articuloRepositorio.findById(idArticulo).orElseThrow());
	}


	public List<Articulo> getArticuloByPrizeRange(float minimo, float maximo) {
		return articuloRepositorio.findByRange(minimo, maximo);
	}


	public List<Pedido> getPedidosByVendedor(Vendedor vendedor) {
		return pedidoRepositorio.findByVendedor(vendedor)
				.stream()
				.map((pedido)->{return (Pedido)pedido;})
				.collect(Collectors.toList());
	}
	
}
