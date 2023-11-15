package objectMother;

import java.util.ArrayList;
import java.util.List;

import model.data.Ruta;
import model.data.Vendedor;

public class VendedorOM {
	public List<Vendedor> getVendedores(){
		ArrayList<Vendedor> vendedorList = new ArrayList<>();
		vendedorList.add(new Vendedor("12345", "John Doe", Ruta.central));
		vendedorList.add(new Vendedor("67890", "Jane Smith", Ruta.periferia));
		vendedorList.add(new Vendedor("54321", "Bob Johnson", Ruta.sur));
		vendedorList.add(new Vendedor("98765", "Alice Brown", Ruta.norte));
		vendedorList.add(new Vendedor("13579", "Eve Wilson", Ruta.complementaria));
		return vendedorList;
	}
}

