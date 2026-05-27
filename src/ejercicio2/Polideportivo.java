package ejercicio2;

public class Polideportivo extends Edificio implements Instalacion_deportiva{
	private String nombre;
	private int tipoInstalacion; //En el PDF no se indicaba que numero corresponde a que tipo de edificio
	
	public Polideportivo() {
		super();
		nombre = "Sin nombre";
		tipoInstalacion = -1;
	}
	
	public Polideportivo(String nombre, double superficie, int tipoInstalacion) {
		super(superficie);
		this.nombre = nombre;
		this.tipoInstalacion = tipoInstalacion;
	}
	
	
	
	
	public int getTipoEdificio() {
		return tipoInstalacion;
	}

	public void setTipoEdificio(int tipoEdificio) {
		this.tipoInstalacion = tipoEdificio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	@Override
	public int getTipoDeInstalacion() {
		
		return tipoInstalacion;
	}

	@Override
	public String toString() {
		return super.toString() + " Nombre: " + nombre + ", tipoEdificio: " + tipoInstalacion;
	}

	
	
	
}
