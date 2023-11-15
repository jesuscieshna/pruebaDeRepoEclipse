package model.repositoriesFichero;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.adapters.AdaptadorSerializadoMapeable;
import model.adapters.Keyable;
import model.data.Articulo;
import model.repositoriesInterfaces.CommonRepositoriable;

public class RepositorioFicheroMapeado<K, T extends Serializable & Keyable<K>> implements CommonRepositoriable<K, T> {
	private List<T> lista;
	private AdaptadorSerializadoMapeable<K, T> adaptador;
	private String listPath;
	private String mapPath;
	private String indexPath;

	public RepositorioFicheroMapeado(String nombreIdentificadorFichero) {
		lista = new ArrayList<T>();
		construirPaths(nombreIdentificadorFichero);
		adaptador = new AdaptadorSerializadoMapeable<>(listPath, mapPath, indexPath);
		lista = leerTodos();
	}

	protected AdaptadorSerializadoMapeable<K, T> getAdaptador() {
		return adaptador;
	}

	private void construirPaths(String nombre) {
		listPath = nombre + ".dat";
		mapPath = nombre + "Mapa.dat";
		indexPath = nombre + "Index.dat";
	}

	private List<T> leerTodos() {
		return adaptador.leerTodos();
	}

	@Override
	public boolean add(T t) {
		if (adaptador.grabar(t)) {
			lista.add((T)t);
			return true;
		}
		return false;
	}

	@Override
	public Optional<T> findById(K k) {
		for (T t : lista) {
			if (t.getKey().equals(k))
				return Optional.of(t);
		}
		return Optional.ofNullable(null);
	}

	@Override
	public List<T> findAll() {
		return lista;
	}

	@Override
	public boolean borrar(K k) {
		if (adaptador.borrar(k)) {
			lista.remove(lista.stream().filter(element -> element.getKey() == k).findFirst().get());
			return true;
		}
		return false;
	}

}
