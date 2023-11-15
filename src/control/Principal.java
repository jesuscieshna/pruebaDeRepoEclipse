package control;

import java.util.Scanner;

import abstractFactoryDataPersistenceSystem.AbstractFactoryFichero;

public class Principal {
	public static void main(String[] args) {
		 Controller controler=null;
		 System.out.println("tipo de repositorios a usar\n1. Fichero\n2. FOM");
		 Scanner sc = new Scanner(System.in);
		 int opc = sc.nextInt();
		 switch(opc) {
		 	case 1: controler = new Controller(new AbstractFactoryFichero());
		 	break;
		 	case 2: //TODO FOM
		 	break;
		 }
		 controler.getArticulosBetweenPrecios(10f, 30f).forEach(e->System.out.println(e.getPrecio()));
		 System.out.println(controler.getClienteBydni("783748744").get().getNombre());
	}
}
