package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("12345678A", "Ana", "García", LocalDate.of(1985, 3, 14), "F", "C/ Mayor 1, Madrid", "600111222", "ana.garcia@example.com", "Administración");
		Empleado e2 = new Empleado("23456789B", "Luis", "Martínez", LocalDate.of(1990, 7, 22), "M", "Av. Libertad 45, Barcelona", "600222333", "luis.martinez@example.com", "Ventas");
		Empleado e3 = new Empleado("34567890C", "María", "López", LocalDate.of(1979, 11, 5), "F", "Pº del Prado 10, Madrid", "600333444", "maria.lopez@example.com", "Recursos Humanos");
		Empleado e4 = new Empleado("45678901D", "Javier", "Sánchez", LocalDate.of(1995, 1, 30), "M", "C/ Gran Vía 20, Valencia", "600444555", "javier.sanchez@example.com", "IT");
		Empleado e5 = new Empleado("56789012E", "Sofía", "Fernández", LocalDate.of(1988, 5, 16), "F", "C/ Olivo 8, Sevilla", "600555666", "sofia.fernandez@example.com", "Marketing");
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		listaEmpleados.add(e1);
		listaEmpleados.add(e2);
		listaEmpleados.add(e3);
		listaEmpleados.add(e4);
		listaEmpleados.add(e5);
		
		ListIterator<Empleado> iterator = listaEmpleados.listIterator();
		
		while(iterator.hasNext()) {
			Empleado empleado = iterator.next();
			System.out.println(empleado.toString());
			System.out.println();
		}
	}

}
