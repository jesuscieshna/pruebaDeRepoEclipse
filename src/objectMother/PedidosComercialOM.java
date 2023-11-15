package objectMother;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import model.data.Articulo;
import model.data.Cliente;
import model.data.LineaPedido;
import model.data.Pedido;
import model.data.PedidoComercial;
import model.data.Ruta;
import model.data.Vendedor;

public class PedidosComercialOM {
	
	public ArrayList<PedidoComercial> getPedidosComercialesParaTest(){
		ArrayList<PedidoComercial> pedidos = new ArrayList<>();
		List<Vendedor> vendedores = new VendedorOM().getVendedores();
		List<Cliente> clientes = new ClientesOM().getClientes();
		List<Set<LineaPedido>> lineas = new LineaPedidoOM().getLineasDePedido();
		for (int i = 0; i < 5; i++) {
			PedidoComercial pedido = new PedidoComercial(i, LocalDate.of(2010+i, 3, 3), clientes.get(i), lineas.get(i), vendedores.get(i));
			pedidos.add(pedido);
		}
		return pedidos;
	}
//	public ArrayList<PedidoComercial> getPedidosComercialesAleatorio(){
//		ArrayList<PedidoComercial> listaPedidosComerciales = new ArrayList();
//		//este es aleatorio mas dificil para hacer tests
//		for(int i=0; i<=27; i++) {	
//			listaPedidosComerciales.add(new PedidoComercial(i, generateLocaldate(), getRandomCliente(), getRandomLineaPedido(), getRandomVendedor()));
//		}
//		
//		return listaPedidosComerciales;
//	}
//	
//	public HashSet<LineaPedido> getRandomLineaPedido() {
//		return (HashSet<LineaPedido>) new LineaPedidoOM().getLineasDePedido();
//	}
//	
//	public LocalDate generateLocaldate() {
//		return LocalDate.of(new Random().nextInt(24)+2000, new Random().nextInt(12)+1, new Random().nextInt(25)+1);
//	}
//	
//	public Vendedor getRandomVendedor() {
//		VendedorOM vendedorOM = new VendedorOM();
//		ArrayList<Vendedor> listaVendedor= (ArrayList<Vendedor>) vendedorOM.getVendedores();
//		return listaVendedor.get(new Random().nextInt(listaVendedor.size()));
//	}
//	
//	public Cliente getRandomCliente() {
//		ClientesOM clienteOM = new ClientesOM();
//		ArrayList<Cliente> listaCliente = (ArrayList<Cliente>) clienteOM.getClientes();
//		return listaCliente.get(new Random().nextInt(listaCliente.size()));
//		
//	}
	


}
