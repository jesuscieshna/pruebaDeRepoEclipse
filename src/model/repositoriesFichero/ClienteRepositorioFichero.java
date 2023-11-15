package model.repositoriesFichero;

import java.util.List;
import java.util.Optional;

import model.adapters.AdaptadorSerializadoMapeable;
import model.data.Cliente;
import model.repositoriesInterfaces.ClienteRepositoriable;
import objectMother.ClientesOM;

public class ClienteRepositorioFichero extends RepositorioFicheroMapeado<String, Cliente>
	implements ClienteRepositoriable {

	public ClienteRepositorioFichero(String nombreIdentificadorFichero) {
		super(nombreIdentificadorFichero);
		new ClientesOM().getClientes().stream().forEach(e->add(e));
	}

}
