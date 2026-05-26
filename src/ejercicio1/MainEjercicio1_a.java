package ejercicio1;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1.setDni("AA202020");
		p2.setDni("20202020");
		
		//Persona.exVerificarDNI(p1.getDni());
		Persona.exVerificarDNI(p2.getDni());

	}

}
