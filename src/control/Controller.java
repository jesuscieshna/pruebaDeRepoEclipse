package control;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import abstractFactoryDataPersistenceSystem.AbstractFactoryDataPersistence;
import control.services.VentaService;
import control.services.EmpleadosService;
import model.data.Articulo;
import model.data.Cliente;
import model.data.Dependiente;
import model.data.Pedido;
import model.data.Vendedor;

public class Controller {
	private VentaService clienteService;
	private EmpleadosService empleadosService;
	
	

	public Controller(AbstractFactoryDataPersistence factory) {
		super();
		empleadosService=new EmpleadosService(factory.getRepositorioVendedor(),factory.getRepositorioDependiente());
//		empleadosService=new EmpleadosService(new VendedorRepositorioFicheros());
		clienteService = new VentaService(factory.getRepositorioPedido(),factory.getRepositorioArticulo()
				, factory.getRepositorioCliente());
		
	}
	//Bicontroller
	/**
	 * Todos los pedidos de un cliente (busca por dni) 
	 */
	public List<Pedido> getPedidosByClienteDni(String dni) {
		return clienteService.getPedidosByClienteDni(dni);
	}
	/**
	 * Necesito la lista completa de clientes
	 */
	public List<Cliente> getClientes(){
		return clienteService.findClientes();
	}
	/**
	 * necesito un cliente por id
	 */
	public Optional<Cliente> getClienteBydni(String dni){
		return clienteService.findClienteByDni(dni);
	}
	/**
	 * Todos los articulos 
	 */
//	public List<Articulo> getArticulos(){
//		return articuloRepositorio.findAll();
//	}
	/**
	 * Todos los articulos en un rango de precios
	 */
	public List<Articulo> getArticulosBetweenPrecios(float minimo,float maximo){
		//clausula guarda
		if(minimo<=maximo)
			return clienteService.getArticuloByPrizeRange(minimo,maximo);
		return new LinkedList<Articulo>();
	}
	/**
	 * Los dependientes, la lista de todos
	 */
	public List<Dependiente> getDpendientes(){
		return empleadosService.getDpendientes();
	}
	/**
	 * Los vendedores con una ruta sur o central
	 */
	public List<Vendedor> getVendedoresRutaSurOCentral(){
		return empleadosService.getVendedoresRutaSurOCentral();
	}
	/**
	 * Los pedidos donde se vende un articulo concreto
	 */
	public List<Pedido> getPedidosWithArticulo(Integer idArticulo){
		return clienteService.getPedidosWithArticulo(idArticulo);
	}
	/**
	 * Para un cliente, la facturacion total entre dos fechas
	 */
	/**
	 * Lista de los pedidos vendidos por un Vendedor con id concreto
	 */
	public List<Pedido> getPedidosByVendedor(String idVendedor){
		return clienteService.getPedidosByVendedor(empleadosService.getVendedorById(idVendedor).orElseThrow());
	}
}
