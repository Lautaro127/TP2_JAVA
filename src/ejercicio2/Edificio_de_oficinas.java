package ejercicio2;

public class Edificio_de_oficinas extends Edificio {
	private int numeroOficinas;
	
	public Edificio_de_oficinas() {
		super();
		numeroOficinas = -1;
	}
	
	public Edificio_de_oficinas(double superficie, int numeroOficinas) {
		super(superficie);
		this.numeroOficinas = numeroOficinas;
	}

	public int getNumeroOficinas() {
		return numeroOficinas;
	}

	public void setNumeroOficinas(int numeroOficinas) {
		this.numeroOficinas = numeroOficinas;
	}

	@Override
	public String toString() {
		return super.toString() + " NumeroOficinas=" + numeroOficinas;
	}
	
	
}
