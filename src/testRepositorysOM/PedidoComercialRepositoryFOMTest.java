package testRepositorysOM;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import control.services.EmpleadosService;
import control.services.VentaService;
import model.data.Pedido;
import model.data.PedidoComercial;
import model.data.Vendedor;
import model.repositories.ClienteRepositorio;
import model.repositories.PedidoComercialRepositoryFOM;
import model.repositories.VendedorRepositorioFOM;
import model.repositoriesFichero.PedidoRepositorio;
import objectMother.PedidosComercialOM;
import objectMother.VendedorOM;

class PedidoComercialRepositoryFOMTest {
	
	@Test
	void findByVendedorTest() {
		PedidoComercialRepositoryFOM repository = new PedidoComercialRepositoryFOM();
		Vendedor vendedor = new VendedorOM().getVendedores().get(0);
		PedidoComercial pedido = repository.findAll().get(0);
		assertEquals(pedido, repository.findByVendedor(vendedor).get(0));

	}
	
	@Test
	void getPedidoComercialByVendedor(){
		VentaService ventaService=new VentaService(null, null, null, new PedidoComercialRepositoryFOM());
		EmpleadosService empleadosService=new EmpleadosService(new VendedorRepositorioFOM(), null);
		
		String dni = "12345";
		List<Pedido> actual=ventaService.getPedidosByVendedor(empleadosService.getVendedorById(dni).get());
		Long expected = 0L;
		assertEquals(expected, actual.get(0).getNumeroDeSerie());
	}

}
