package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	
	
	public Persona() {
		setDni("Sin DNI");
		setNombre("Sin nombre");
		setApellido("Sin apellido");
		setFechaNacimiento(LocalDate.of(1900, 01, 01));
		setGenero("Sin genero");
		setDireccion("Sin direccion");
		setTelefono("Sin telefono");
		setEmail("Sin correo");
	}
	
	public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String Email) {
		setDni(dni);
		setNombre(nombre);
		setApellido(apellido);
		setFechaNacimiento(fechaNacimiento);
		setGenero(genero);
		setDireccion(direccion);
		setTelefono(telefono);
		setEmail(Email);
	}
	

	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
	    return "DNI: " + dni + "\n" +
	           "Nombre: " + nombre + "\n" +
	           "Apellido: " + apellido + "\n" +
	           "FechaNacimiento: " + fechaNacimiento + "\n" +
	           "Género: " + genero + "\n" +
	           "Dirección: " + direccion + "\n" +
	           "Teléfono: " + telefono + "\n" +
	           "Email: " + email;
	}
	
	
	
	public static void exVerificarDNI(String dni) throws ExVerificarDNI {
		int contador = 0;
		char[] listaNumeros = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		
		for(int i = 0; i < dni.length();i++) {
			for(int q = 0; q < 10;q++) {
				if(dni.charAt(i) == listaNumeros[q]) {
					contador++;
				}
			}
		}
		
		if(contador != 8) {
			System.out.println("El DNI es incorrecto");
			ExVerificarDNI c = new ExVerificarDNI();
			throw c;
		}else {
			System.out.println("El DNI es valido");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, direccion, dni, email, fechaNacimiento, genero, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(dni, other.dni) && Objects.equals(email, other.email)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(genero, other.genero)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}
	
	
	
	
	
}
