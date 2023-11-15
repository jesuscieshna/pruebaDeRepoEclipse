package model.repositoriesInterfaces;

import java.util.List;
import java.util.Optional;

import model.data.Ruta;
import model.data.Vendedor;

public interface VendedorRepositorio extends CommonRepositoriable<String, Vendedor>{
	public List<Vendedor> findByRoutes(Ruta... rutas) ;
}
