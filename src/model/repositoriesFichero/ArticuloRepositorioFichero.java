package model.repositoriesFichero;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.Articulo;
import model.repositoriesInterfaces.ArticuloRepositoriable;
import objectMother.ArticulosOM;

public class ArticuloRepositorioFichero extends RepositorioFicheroMapeado<Integer, Articulo>
		implements ArticuloRepositoriable {

	public ArticuloRepositorioFichero(String nombreIdentificadorFicheros) {
		super(nombreIdentificadorFicheros);
	}

	public List<Articulo> findByRange(float minimo, float maximo) {
		return findAll().stream().filter((articulo) -> {
			return articulo.getPrecio() >= minimo;
		}).filter((articulo) -> {
			return articulo.getPrecio() <= maximo;
		}).collect(Collectors.toList());
	}
}
