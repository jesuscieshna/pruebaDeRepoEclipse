package model.repositoriesFichero;

import java.util.List;
import java.util.Optional;

import model.data.PedidoAlmacen;
import model.repositoriesInterfaces.PedidoAlmacenRepositorio;

public class PedidoAlmacenRepositorioFichero extends RepositorioFicheroMapeado<Long, PedidoAlmacen> implements PedidoAlmacenRepositorio {

	public PedidoAlmacenRepositorioFichero(String nombreIdentificadorFichero) {
		super(nombreIdentificadorFichero);
		add(new PedidoAlmacen(89, null, null, null, null));
	}

}
