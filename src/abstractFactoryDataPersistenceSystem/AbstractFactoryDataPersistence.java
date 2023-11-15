package abstractFactoryDataPersistenceSystem;

import model.repositoriesInterfaces.ArticuloRepositoriable;
import model.repositoriesInterfaces.ClienteRepositoriable;
import model.repositoriesInterfaces.DependienteRepositoriable;
import model.repositoriesInterfaces.PedidoAlmacenRepositorio;
import model.repositoriesInterfaces.PedidoComercialRepositorio;
import model.repositoriesInterfaces.PedidoRepositoriable;
import model.repositoriesInterfaces.VendedorRepositorio;

public abstract class AbstractFactoryDataPersistence {
	public abstract ArticuloRepositoriable getRepositorioArticulo();
	public abstract ClienteRepositoriable getRepositorioCliente();
	public abstract DependienteRepositoriable getRepositorioDependiente();
	public abstract PedidoRepositoriable getRepositorioPedido();
	public abstract VendedorRepositorio getRepositorioVendedor();
}
