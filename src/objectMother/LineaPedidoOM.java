package objectMother;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import model.data.Articulo;
import model.data.LineaPedido;

public class LineaPedidoOM {
	private List<Set<LineaPedido>> lineas = new ArrayList<>();

	public List<Set<LineaPedido>> getLineasDePedido() {
		LinkedList<Articulo> articulos = (LinkedList<Articulo>) new ArticulosOM().getArticulos();
		lineas.add(Set.of(new LineaPedido(articulos.get(0),3)));
		lineas.add(Set.of(new LineaPedido(articulos.get(1),4)));
		lineas.add(Set.of(new LineaPedido(articulos.get(2),1)));
		lineas.add(Set.of(new LineaPedido(articulos.get(3),2)));
		lineas.add(Set.of(new LineaPedido(articulos.get(4),6)));
		
		return lineas;
	}
}
