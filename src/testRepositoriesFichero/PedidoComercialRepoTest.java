package testRepositoriesFichero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import model.data.PedidoComercial;
import model.data.Vendedor;
import model.repositoriesFichero.PedidoComercialRepositorioFichero;
import objectMother.PedidosComercialOM;
import objectMother.VendedorOM;
@TestInstance(Lifecycle.PER_CLASS)

class PedidoComercialRepoTest {
	private final String path = "testFiles/PedidoComerciales";
	private PedidoComercialRepositorioFichero repo;
	@BeforeAll
	void initFiles() {
		repo = new PedidoComercialRepositorioFichero(path);
		new PedidosComercialOM().getPedidosComercialesParaTest().forEach(e->repo.add(e));
	}
	@Test
	void findByVendedor() {
		Vendedor vendedor = new VendedorOM().getVendedores().get(0);
		PedidoComercial pedido = repo.findAll().get(0);
		assertEquals(pedido, repo.findByVendedor(vendedor).get(0));
	}

}
