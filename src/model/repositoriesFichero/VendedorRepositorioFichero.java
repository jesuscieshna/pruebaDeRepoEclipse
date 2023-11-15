package model.repositoriesFichero;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.data.Ruta;
import model.data.Vendedor;
import model.repositoriesInterfaces.VendedorRepositorio;

public class VendedorRepositorioFichero extends RepositorioFicheroMapeado<String, Vendedor> implements VendedorRepositorio{

	public VendedorRepositorioFichero(String nombreIdentificadorFichero) {
		super(nombreIdentificadorFichero);
	}

	@Override
	public List<Vendedor> findByRoutes(Ruta... rutas) {
		return findAll().stream().filter((vendedor) -> {
			return Arrays.asList(rutas).stream()
					.anyMatch((ruta)->{return vendedor.rutaEquals(ruta);});
		})
		.collect(Collectors.toList());
	}

	

}
