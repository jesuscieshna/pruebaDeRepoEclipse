package testRepositorysOM;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.data.Cliente;
import model.repositories.ClienteRepositorio;
import objectMother.ClientesOM;

class ClienteRepositorioFOMTest {

	@Test
	void findClienteByDni() {
		ArrayList<Cliente> lista = (ArrayList<Cliente>) new ClientesOM().getClientes();
		String dni = lista.get(0).getdNICliente();
		assertEquals(lista.get(0), new ClienteRepositorio().findById(dni).get());
	}

}
