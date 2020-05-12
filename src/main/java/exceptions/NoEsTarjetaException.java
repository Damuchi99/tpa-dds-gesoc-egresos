package exceptions;

public class NoEsTarjetaException extends RuntimeException {
	public NoEsTarjetaException(String mensaje) {
		super(mensaje);
	}
}
