package model.repositoriesInterfaces;

import java.util.List;
import java.util.Optional;

import model.data.Articulo;

public interface ArticuloRepositoriable extends CommonRepositoriable<Integer, Articulo>{
	public List<Articulo> findByRange(float minimo, float maximo);
}
