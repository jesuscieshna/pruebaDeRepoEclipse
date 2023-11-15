package model.data;

import java.io.Serializable;

import model.adapters.Keyable;

public class Cliente extends Persona implements Serializable{
	
	//Todos los clientes con descuento tienen el mismo descuento
	private static float descuento=0.2f;
	private boolean descuentoAplicado;
	
	public Cliente(String dNICliente, String nombre, boolean descuentoAplicado) {
		super(dNICliente, nombre);
		this.descuentoAplicado = descuentoAplicado;
	}

	private static float getDescuento() {
		return descuento;
	}

	private boolean isDescuentoAplicado() {
		return descuentoAplicado;
	}

	private void setDescuentoAplicado(boolean descuentoAplicado) {
		this.descuentoAplicado = descuentoAplicado;
	}
	
	

	
}
