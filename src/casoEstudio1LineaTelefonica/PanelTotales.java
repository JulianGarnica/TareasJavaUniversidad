package casoEstudio1LineaTelefonica;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PanelTotales extends JPanel {
	private static JTextField txtValorTotal= new JTextField();
	private static JTextField txtTotalLlamadas= new JTextField();
	private static JTextField txtTotalMinutos= new JTextField();
	private static JTextField txtCostoPromedio= new JTextField();

	/**
	 * Create the panel.
	 */
	public PanelTotales() {
		setBorder(new TitledBorder(null, "Totales", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblValorTotal = new JLabel("Valor Total");
		add(lblValorTotal);
		
		
		
		add(txtValorTotal);
		txtValorTotal.setColumns(10);
		
		JLabel lblTotalLlamadas = new JLabel("Total Llamadas");
		add(lblTotalLlamadas);
		
		
		add(txtTotalLlamadas);
		txtTotalLlamadas.setColumns(10);
		
		JLabel lblTotalMinutos = new JLabel("Total Minutos");
		add(lblTotalMinutos);
		
		
		add(txtTotalMinutos);
		txtTotalMinutos.setColumns(10);
		
		JLabel lblCostoPromedio = new JLabel("Costo Promedio");
		add(lblCostoPromedio);
		
		
		add(txtCostoPromedio);
		txtCostoPromedio.setColumns(10);

	}
	
	public static void actualizar(Empresa empresa) {
		
		txtValorTotal.setText(formatearValor(empresa.darTotalCostoLlamadas()));
		txtTotalLlamadas.setText(formatearValorEntero(empresa.darTotalNumeroLlamadas()));
		txtTotalMinutos.setText(formatearValorEntero(empresa.darTotalMinutos()));
		txtCostoPromedio.setText(formatearValor(empresa.darCostoPromedioMinuto()));
	}
	
	private static String formatearValor(double valor) {
		return String.valueOf(valor);
	}
	
	private static String formatearValorEntero(int valor) {
		return String.valueOf(valor);
	}

}
