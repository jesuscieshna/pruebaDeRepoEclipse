package objectMother;

import java.util.ArrayList;
import java.util.List;

import model.data.Cliente;

public class ClientesOM {
	public List<Cliente> getClientes(){
		List<Cliente> lista = new ArrayList<>();
		Cliente cliente = new Cliente("783748744", "Pepito", true);
		lista.add(cliente);
		Cliente cliente2 = new Cliente("34839439", "Juan", false);
		lista.add(cliente2);
		Cliente cliente3 = new Cliente("234902304", "Alberto", false);
		lista.add(cliente3);
		Cliente cliente4 = new Cliente("723648234", "Jesus Maria", false);
		lista.add(cliente4);
		Cliente cliente5 = new Cliente("3784734887", "Santi miguez mamonazo", true);
		lista.add(cliente5);
		return lista;
	}
}
