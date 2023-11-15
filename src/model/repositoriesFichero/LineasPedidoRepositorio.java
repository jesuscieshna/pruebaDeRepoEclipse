package model.repositoriesFichero;

import model.data.Articulo;
import model.data.LineaPedido;

public class LineasPedidoRepositorio extends RepositorioFicheroMapeado<Articulo, LineaPedido>{

	public LineasPedidoRepositorio(String nombreIdentificadorFichero) {
		super(nombreIdentificadorFichero);
	}

}
