package testRepositorysOM;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import control.services.VentaService;
import control.services.EmpleadosService;
import model.data.Ruta;
import model.data.Vendedor;
import model.repositories.PedidoComercialRepositoryFOM;
import model.repositories.VendedorRepositorioFOM;
import model.repositoriesInterfaces.PedidoComercialRepositorio;
import objectMother.VendedorOM;

class VendedorFOMTest {
	VendedorRepositorioFOM vendedorRepositorio;
	
	@BeforeEach
	void beforeEach() {
		vendedorRepositorio = new VendedorRepositorioFOM();
	}
	
	@Test 
	void findByIdTest(){
		String dni = "12345";
		assertTrue(vendedorRepositorio.findById(dni).isPresent());
		dni = "000000";
		assertFalse(vendedorRepositorio.findById(dni).isPresent());
	}
	
	@Test
	void findByRoutesTest() {
		List<Vendedor> vendedores = new VendedorOM().getVendedores();
		List<Vendedor> expected = List.of(vendedores.get(0),vendedores.get(2));
		List<Vendedor> actual = vendedorRepositorio.findByRoutes(Ruta.sur,Ruta.central);
		assertTrue(expected.containsAll(actual));
		assertTrue(actual.containsAll(vendedorRepositorio.findByRoutesDos(Ruta.sur,Ruta.central)));
	}

	
	

	
}
