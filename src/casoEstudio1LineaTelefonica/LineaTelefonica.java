package casoEstudio1LineaTelefonica;

public class LineaTelefonica {
	private int numeroLlamadas;
	private int numeroMinutos;
	private double costoLlamadas;
	
	public void inicializar() {
		this.numeroLlamadas = 0;
		this.numeroMinutos = 0;
		this.costoLlamadas = 0;
	}
	
	public void reiniciar() {
		this.inicializar();
	}
	
	public double darCostoLlamadas() {
		return costoLlamadas;
	}
	public int darNumeroLlamadas() {
		return numeroLlamadas;
	}
	public int darNumeroMinutos() {
		return numeroMinutos;
	}
	
	public void agregarLlamadaLocal(int minutos) {
		this.costoLlamadas += minutos*35;
		this.numeroMinutos += minutos;
		this.numeroLlamadas += 1;
	}
	
	public void agregarLlamadaLargaDistancia(int minutos) {
		this.costoLlamadas += minutos*380;
		this.numeroMinutos += minutos;
		this.numeroLlamadas += 1;
	}
	
	public void agregarLlamadaCelular(int minutos) {
		this.costoLlamadas += minutos*999;
		this.numeroMinutos += minutos;
		this.numeroLlamadas += 1;
	}
}
