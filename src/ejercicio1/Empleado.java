package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona{
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

	
	
	
}
