package ejercicio1;

public class ExVerificarDNI extends RuntimeException{
	
	public ExVerificarDNI() {
		
	}

	@Override
	public String getMessage() {
		
		return "El DNI ingresado no es valido";
	}
	
	
}
