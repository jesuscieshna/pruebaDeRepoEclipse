package objectMother;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.data.Articulo;

public class ArticulosOM {

	public List<Articulo> getArticulos(){
		//Esta es una lista mutable
		int[] ids= {1,2,3,4,5};
		String[] nombres= {"sierra","tuerca","Tornillo","clavo","arandela"};
		float[] precios= {23f,23f,23f,23f,23f};
		LinkedList <Articulo> articulos=new LinkedList<>();
		for (int i = 0; i < precios.length; i++) {
			articulos.add(new Articulo(ids[i], nombres[i], precios[i]));
		} 
		return articulos;
		
		//esta es inumutable
//		return List.of(
//				new Articulo(1, "Tornillo", 23f),
//				new Articulo(1, "Tornillo", 23f),
//				new Articulo(1, "Tornillo", 23f),
//				new Articulo(1, "Tornillo", 23f),
//				new Articulo(1, "Tornillo", 23f),
//				new Articulo(1, "Tornillo", 23f),
//				new Articulo(1, "Tornillo", 23f),
//				new Articulo(1, "Tornillo", 23f)
//				);
		
	}
}
