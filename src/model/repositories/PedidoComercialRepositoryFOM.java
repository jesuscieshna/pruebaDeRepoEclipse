package model.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.PedidoComercial;
import model.data.Vendedor;
import model.repositoriesInterfaces.CommonRepositoriable;
import model.repositoriesInterfaces.PedidoComercialRepositorio;
import objectMother.PedidosComercialOM;

public class PedidoComercialRepositoryFOM implements PedidoComercialRepositorio,CommonRepositoriable<Long, PedidoComercial> {
	
	private ArrayList<PedidoComercial> lista;
	
	public PedidoComercialRepositoryFOM() {
		lista = new PedidosComercialOM().getPedidosComercialesParaTest();
		if(lista.get(0)==null) System.out.println("Algo mal");
	}
	
	@Override
	public List<PedidoComercial> findByVendedor(Vendedor vendedor) {
		if(Optional.of(vendedor).isPresent()) {
			return lista.stream()
					.filter(pedido->pedido.getVendedor().equals(vendedor))
					.collect(Collectors.toList());
		}
		return null;
	}

	public ArrayList<PedidoComercial> findAll() {
		return lista;
	}

	@Override
	public boolean add(PedidoComercial t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<PedidoComercial> findById(Long k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean borrar(Long k) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
