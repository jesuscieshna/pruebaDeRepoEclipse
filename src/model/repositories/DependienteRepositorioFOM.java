package model.repositories;

import java.util.List;
import java.util.Optional;

import model.data.Dependiente;
import model.repositoriesInterfaces.DependienteRepositoriable;

public class DependienteRepositorioFOM implements DependienteRepositoriable{

	@Override
	public boolean add(Dependiente t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Dependiente> findById(String k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dependiente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean borrar(String k) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
