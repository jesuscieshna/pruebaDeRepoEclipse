package model.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.data.Cliente;
import model.repositoriesInterfaces.ClienteRepositoriable;
import model.repositoriesInterfaces.CommonRepositoriable;
import objectMother.ClientesOM;

public class ClienteRepositorio implements ClienteRepositoriable, CommonRepositoriable<String, Cliente>{
	private List<Cliente> lista;
	
	public ClienteRepositorio() {
		lista=new ArrayList<>();
		ClientesOM clientesOM = new ClientesOM();
		lista = clientesOM.getClientes();
	}

	@Override
	public Optional<Cliente> findById(String dni) {
		return lista.stream().filter(cliente -> cliente.getdNICliente().equals(dni)).findFirst();
	}
	@Override
	public boolean add(Cliente t) {
		return lista.add(t);
	}
	@Override
	public List<Cliente> findAll() {
		return lista;
	}
	@Override
	public boolean borrar(String k) {
		// TODO Auto-generated method stub
		return false;
	}

}
