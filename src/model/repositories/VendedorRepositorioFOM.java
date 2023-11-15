package model.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.Ruta;
import model.data.Vendedor;
import model.repositoriesInterfaces.CommonRepositoriable;
import model.repositoriesInterfaces.VendedorRepositorio;
import objectMother.VendedorOM;

public class VendedorRepositorioFOM implements VendedorRepositorio, CommonRepositoriable<String, Vendedor> {
	List<Vendedor> vendedores=new VendedorOM().getVendedores();

	public List<Vendedor> findByRoutes(Ruta... rutas) {
		ArrayList<Vendedor> vendedoresResult = new ArrayList<Vendedor>();
		Arrays.asList(rutas).stream().forEach((ruta) -> {
			vendedoresResult.addAll(vendedores.stream().filter((vendedor) -> {
				return vendedor.rutaEquals(ruta);
			}).collect(Collectors.toList()));
		});
		return vendedoresResult;
	}

	public List<Vendedor> findByRoutesDos(Ruta... rutas) {
		return vendedores.stream().filter((vendedor) -> {
				return Arrays.asList(rutas).stream()
						.anyMatch((ruta)->{return vendedor.rutaEquals(ruta);});
			})
			.collect(Collectors.toList());
	}

	public Optional<Vendedor> findById(String idVendedor) {
		return vendedores.stream().filter(vendedor -> vendedor.getdNICliente().equals(idVendedor))
				.findFirst();
	}

	@Override
	public boolean add(Vendedor t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Vendedor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean borrar(String k) {
		// TODO Auto-generated method stub
		return false;
	}

}
