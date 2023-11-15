package testRepositoriesFichero;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import model.data.Cliente;
import model.repositories.ClienteRepositorio;
import model.repositoriesFichero.ClienteRepositorioFichero;
import objectMother.ClientesOM;
@TestInstance(Lifecycle.PER_CLASS)
class ClienteRepoTest {
	ClienteRepositorioFichero repo;
	String path = "testFiles/ClientesTest";
	@BeforeAll
	void initFiles() {
		repo = new ClienteRepositorioFichero(path);
		new ClientesOM().getClientes().forEach(e->repo.add(e));
	}
	
	@Test
	void findClienteByDni() {
		ArrayList<Cliente> lista = (ArrayList<Cliente>) new ClientesOM().getClientes();
		String dni = lista.get(0).getdNICliente();
		assertEquals(lista.get(0), repo.findById(dni).get());
	}

}
