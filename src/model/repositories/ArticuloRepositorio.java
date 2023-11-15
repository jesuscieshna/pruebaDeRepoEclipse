package model.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.Articulo;
import model.repositoriesInterfaces.ArticuloRepositoriable;
import model.repositoriesInterfaces.CommonRepositoriable;
import objectMother.ArticulosOM;

public class ArticuloRepositorio implements ArticuloRepositoriable{

	List<Articulo> articulos;
	
	
	public ArticuloRepositorio() {
		super();
		articulos=new ArticulosOM().getArticulos();
	}

	public List<Articulo> findAll(){
		return articulos;
	}
	
	public Optional<Articulo> findById(Integer id) {
		for (Articulo articulo : articulos) {
			if(articulo.getId()==id)
				return Optional.of(articulo);
		}
		return Optional.ofNullable(null);
	}

	public List<Articulo> findByRange(float minimo, float maximo) {
		return articulos.stream()
				.filter((articulo)->{return articulo.getPrecio()>=minimo;})
				.filter((articulo)->{return articulo.getPrecio()<=maximo;})
				.collect(Collectors.toList());
	}

	@Override
	public boolean add(Articulo t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean borrar(Integer k) {
		// TODO Auto-generated method stub
		return false;
	}
}
