package ejercicio2;


public class Edificio {
	private double superficie;
	
	public Edificio() {
		superficie = 0;
	}
	
	public Edificio(double superficie) {
		this.superficie = superficie;
	}
	
	void setSuperficieEdificio(double superficie) {
		this.superficie = superficie;
	}
	
	double getSuperficieEdificio() {
		return superficie;
	}

	@Override
	public String toString() {
		return "Superficie=" + superficie;
	}
	
	
}
