package model.repositoriesInterfaces;

import java.util.List;
import java.util.Optional;

public interface CommonRepositoriable <K,T>{

	public boolean add(T t);
	
	public Optional<T> findById(K k);
	
	public List<T> findAll();
	
	public boolean borrar(K k);
}
