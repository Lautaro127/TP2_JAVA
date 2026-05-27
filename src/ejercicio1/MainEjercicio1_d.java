package ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {

	public static void main(String[] args) {
		HashSet<Persona> hashSet = new HashSet<Persona>();
		
		Persona p = new Persona("12345678A", "Juan", "Gómez", LocalDate.of(1985, 5, 15), "Masculino", "Calle Mayor 123", "600123456", "juan.gomez@example.com");
		Persona p2 = new Persona("87654321B", "María", "López", LocalDate.of(1990, 8, 22), "Femenino", "Avenida Libertad 456", "612345678", "maria.lopez@example.com");
		Persona p3 = new Persona("23456789C", "Carlos", "Martínez", LocalDate.of(1978, 3, 10), "Masculino", "Plaza Central 789", "623456789", "carlos.martinez@example.com");
		Persona p4 = new Persona("34567890D", "Ana", "Sánchez", LocalDate.of(1995, 11, 5), "Femenino", "Callejón del Arte 321", "634567890", "ana.sanchez@example.com");
		Persona p5 = new Persona("45678901E", "Pedro", "Ramírez", LocalDate.of(1982, 7, 30), "Masculino", "Boulevard del Sol 654", "645678901", "pedro.ramirez@example.com");
		
		hashSet.add(p);
		hashSet.add(p2);
		hashSet.add(p3);
		hashSet.add(p4);
		hashSet.add(p5);
		
		Iterator<Persona> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			Persona aux = new Persona();
			aux = iterator.next();
			
			System.out.println(aux.toString());
			System.out.println();
		}
	}

}
