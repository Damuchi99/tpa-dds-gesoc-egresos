package domain;

import exceptions.NoEsTarjetaException;

public class MedioPago {
	private TipoMedioPago tipo;
	private int numero;
	
	public MedioPago(TipoMedioPago tipo) {
		this.tipo = tipo;
	}
	
	public MedioPago(TipoMedioPago tipo, int numero) {
		this.validarNumero(tipo, numero);
	}
	
	public boolean esTarjeta(TipoMedioPago tipo) {
		return tipo == TipoMedioPago.TARJETA_DE_CREDITO || tipo == TipoMedioPago.TARJETA_DE_DEBITO;
	}
	
	public void validarNumero(TipoMedioPago tipo, int n) {
		if(this.esTarjeta(tipo)) {
			this.setTipo(tipo);
			this.setNumero(n);
		}else {
			throw new NoEsTarjetaException("El metodo de pago ingresado no es tarjeta");
		}
	}

	public void setNumero(int n) {
		this.numero = n;
	}
	
	public int getNumero() {
		return this.numero;
	}

	public void setTipo(TipoMedioPago tipo) {
		this.tipo = tipo;		
	}

	public TipoMedioPago getTipo() {
		return this.tipo;
	}
}
