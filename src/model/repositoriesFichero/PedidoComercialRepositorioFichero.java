package model.repositoriesFichero;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.adapters.AdaptadorSerializadoMapeable;
import model.data.Cliente;
import model.data.PedidoComercial;
import model.data.Vendedor;
import model.repositoriesInterfaces.PedidoComercialRepositorio;
import objectMother.PedidosComercialOM;

public class PedidoComercialRepositorioFichero extends RepositorioFicheroMapeado<Long, PedidoComercial>
		implements PedidoComercialRepositorio {

	public PedidoComercialRepositorioFichero(String nombreIdentificadorFichero) {
		super(nombreIdentificadorFichero);
	}

	@Override
	public List<PedidoComercial> findByVendedor(Vendedor vendedor) {
		if (Optional.of(vendedor).isPresent()) {
			return findAll().stream().filter(pedido -> pedido.getVendedor().equals(vendedor))
					.collect(Collectors.toList());
		}
		return null;
	}
}
