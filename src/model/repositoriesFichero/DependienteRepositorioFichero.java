package model.repositoriesFichero;
import model.data.Dependiente;
import model.repositoriesInterfaces.DependienteRepositoriable;

public class DependienteRepositorioFichero extends RepositorioFicheroMapeado<String, Dependiente> implements DependienteRepositoriable{
	
	public DependienteRepositorioFichero(String nombreIdentificadorFichero) {
		super(nombreIdentificadorFichero);
	}


}
