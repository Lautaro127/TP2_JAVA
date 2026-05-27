package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio2 {

	public static void main(String[] args) {
		Polideportivo polideportivo1 = new Polideportivo("Centro Deportivo Municipal", 5000.0, 1);

		Polideportivo polideportivo2 = new Polideportivo("Complejo Olímpico", 8500.5, 2);

		Polideportivo polideportivo3 = new Polideportivo("Gimnasio del Parque", 3200.75, 3);

		Edificio_de_oficinas edificio1 = new Edificio_de_oficinas(12000.0, 45);

		Edificio_de_oficinas edificio2 = new Edificio_de_oficinas(8500.5, 30);
		
		
		ArrayList<Edificio> lista = new ArrayList<Edificio>();
		lista.add(polideportivo1);
		lista.add(polideportivo2);
		lista.add(polideportivo3);
		lista.add(edificio1);
		lista.add(edificio2);
		
		Iterator<Edificio> i = lista.iterator();
		
		while(i.hasNext()) {
			Edificio aux = new Edificio();
			aux = i.next();
			System.out.println(aux.toString());
		}

	}

}
