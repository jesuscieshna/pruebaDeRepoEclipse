package abstractFactoryDataPersistenceSystem;

import model.repositoriesFichero.ArticuloRepositorioFichero;
import model.repositoriesFichero.ClienteRepositorioFichero;
import model.repositoriesFichero.DependienteRepositorioFichero;
import model.repositoriesFichero.PedidoAlmacenRepositorioFichero;
import model.repositoriesFichero.PedidoComercialRepositorioFichero;
import model.repositoriesFichero.PedidoRepositorio;
import model.repositoriesFichero.VendedorRepositorioFichero;
import model.repositoriesInterfaces.ArticuloRepositoriable;
import model.repositoriesInterfaces.ClienteRepositoriable;
import model.repositoriesInterfaces.DependienteRepositoriable;
import model.repositoriesInterfaces.PedidoAlmacenRepositorio;
import model.repositoriesInterfaces.PedidoComercialRepositorio;
import model.repositoriesInterfaces.PedidoRepositoriable;
import model.repositoriesInterfaces.VendedorRepositorio;

public class AbstractFactoryFichero extends AbstractFactoryDataPersistence {

	@Override
	public ArticuloRepositoriable getRepositorioArticulo() {
		return new ArticuloRepositorioFichero("Articulos");
	}

	@Override
	public ClienteRepositoriable getRepositorioCliente() {
		return new ClienteRepositorioFichero("Clientes");
	}

	@Override
	public DependienteRepositoriable getRepositorioDependiente() {
		return new DependienteRepositorioFichero("Dependientes");
	}

	@Override
	public PedidoRepositoriable getRepositorioPedido() {
		return new PedidoRepositorio("PedidosComerciales","PedidosAlmacen");
	}

	@Override
	public VendedorRepositorio getRepositorioVendedor() {
		return new VendedorRepositorioFichero("Vendedores");
	}

}
