package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado extends Persona implements Comparable<Empleado>{
	private static int legajoContador = 999;
	private final int legajo;
	private String puesto;
	
	public Empleado() {
		super();
		legajoContador++;
		legajo = legajoContador;
		puesto = "Sin nombre de puesto";
	}
	
	public Empleado(String dni,String nombre,String apellido,LocalDate fechaDeNacimiento,String genero,String dirección,String teléfono,String email,String puesto) {
		super(dni, nombre, apellido, fechaDeNacimiento, genero,dirección, teléfono, email);
		legajoContador++;
		legajo = legajoContador;
		this.puesto = puesto;
	}
	
	public static int proximoLegajo() {
		return legajoContador + 1;
	}
	
	@Override
	public String toString() {
	    return super.toString() + "\n" + "Legajo: " + legajo + "\n" + "Puesto: " + puesto;
	}

	@Override
	public int compareTo(Empleado o) {
			
		//Sin lógica (el TP no lo requería)
		return 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(legajo, puesto);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return legajo == other.legajo && Objects.equals(puesto, other.puesto);
	}

	
	
	
}
