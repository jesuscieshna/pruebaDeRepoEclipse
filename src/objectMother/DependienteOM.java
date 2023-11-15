package objectMother;

import java.util.ArrayList;
import java.util.List;

import model.data.Dependiente;

public class DependienteOM {
	public List<Dependiente> getDependientes(){
		ArrayList<Dependiente> dependienteList = new ArrayList<>();
		dependienteList.add(new Dependiente("12345", "John Doe", 1));
		dependienteList.add(new Dependiente("67890", "Jane Smith", 2));
		dependienteList.add(new Dependiente("54321", "Bob Johnson", 3));
		dependienteList.add(new Dependiente("98765", "Alice Brown", 4));
		dependienteList.add(new Dependiente("13579", "Eve Wilson", 5));
		return dependienteList;
	};
}
