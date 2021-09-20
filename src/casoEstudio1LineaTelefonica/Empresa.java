package casoEstudio1LineaTelefonica;

public class Empresa {
	private LineaTelefonica linea1 = new LineaTelefonica();
	private LineaTelefonica linea2 = new LineaTelefonica();
	private LineaTelefonica linea3 = new LineaTelefonica();
	
	public void inicializar() {
		linea1.inicializar();
		linea2.inicializar();
		linea3.inicializar();
	}
	
	public LineaTelefonica darLinea1() {	
		return linea1;
	}
	public LineaTelefonica darLinea2() {	
		return linea2;
	}
	public LineaTelefonica darLinea3() {
		return linea3;
	}
	
	
	public void agregarLlamadaLocalLinea1(int minutos) {
		linea1.agregarLlamadaLocal(minutos);
	}
	public void agregarLlamadaLocalLinea2(int minutos) {
		linea2.agregarLlamadaLocal(minutos);
	}
	public void agregarLlamadaLocalLinea3(int minutos) {
		linea3.agregarLlamadaLocal(minutos);
	}
	public void agregarLlamadaLargaDistanciaLinea1(int minutos) {
		linea1.agregarLlamadaLargaDistancia(minutos);
	}
	public void agregarLlamadaLargaDistanciaLinea2(int minutos) {
		linea2.agregarLlamadaLargaDistancia(minutos);
	}
	public void agregarLlamadaLargaDistanciaLinea3(int minutos) {
		linea3.agregarLlamadaLargaDistancia(minutos);
	}
	public void agregarLlamadaCelularLinea1(int minutos) {
		linea1.agregarLlamadaCelular(minutos);
	}
	public void agregarLlamadaCelularLinea2(int minutos) {
		linea2.agregarLlamadaCelular(minutos);
	}
	public void agregarLlamadaCelularLinea3(int minutos) {
		linea3.agregarLlamadaCelular(minutos);
	}
	
	public int darTotalNumeroLlamadas() {
		int suma = linea1.darNumeroLlamadas() + linea2.darNumeroLlamadas() + linea3.darNumeroLlamadas();
		return suma;
	}
	
	public int darTotalMinutos() {
		int suma = linea1.darNumeroMinutos() + linea2.darNumeroMinutos() + linea3.darNumeroMinutos();
		return suma;
	}
	
	public double darTotalCostoLlamadas(){
		double suma = linea1.darCostoLlamadas() + linea2.darCostoLlamadas() + linea3.darCostoLlamadas();
		return suma;
	}
	
	public double darCostoPromedioMinuto(){
		//System.out.println(darTotalCostoLlamadas()+"/"+darTotalMinutos());
		double suma = darTotalCostoLlamadas()/darTotalNumeroLlamadas();
		return suma;
	}
	
	public void reiniciar() {
		inicializar();
	}
}
