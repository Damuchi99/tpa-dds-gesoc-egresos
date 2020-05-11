package domain;

public class CuitIncorrectoExcepction extends RuntimeException {
	public CuitIncorrectoExcepction(String mensaje) {
		super(mensaje);
	}
}
