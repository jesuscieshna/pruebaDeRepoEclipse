package model.repositoriesInterfaces;

import java.util.List;
import java.util.Optional;

import model.data.PedidoComercial;
import model.data.Vendedor;

public interface PedidoComercialRepositorio extends CommonRepositoriable<Long, PedidoComercial>{
	public List<PedidoComercial> findByVendedor(Vendedor vendedor);
}
