package casoEstudio1LineaTelefonica;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class PanelLineaTelefonica extends JPanel {
	private JTextField txtvalortotallinea;
	private JTextField txtNumerosllamadas;
	private JTextField txtMinutosllamada;
	private JTextField txtNumerominutos;
	private JCheckBox chckbxLocal;
	private JCheckBox chckbxLargaDistancia;
	private JCheckBox chckbxCelular;
	private JButton btnAgregarLlamada;
	private InterfazLineasTelefonicas principal;
	private int numeroLinea;

	/**
	 * Create the panel.
	 */
	public PanelLineaTelefonica(InterfazLineasTelefonicas laPrincipal, int elNumeroLinea) {
		this(elNumeroLinea);
		this.principal = laPrincipal;
		this.numeroLinea = elNumeroLinea;
	}
	
	/**
	 * @wbp.parser.constructor
	 */
	public PanelLineaTelefonica(int elNumeroLinea) {
		setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "L\u00EDnea Telef\u00F3nica 0", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(51, 51, 51)));
		setLayout(new GridLayout(6, 3, 5, 5));
		
		JLabel label = new JLabel("");
		add(label);
		
		JLabel lblValorTotalLinea = new JLabel("Valor Total Linea");
		add(lblValorTotalLinea);
		
		txtvalortotallinea = new JTextField();
		txtvalortotallinea.setEditable(false);
		add(txtvalortotallinea);
		txtvalortotallinea.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		add(label_1);
		
		JLabel lblNumeroLlamadas = new JLabel("Numero Llamadas");
		add(lblNumeroLlamadas);
		
		txtNumerosllamadas = new JTextField();
		txtNumerosllamadas.setEditable(false);
		add(txtNumerosllamadas);
		txtNumerosllamadas.setColumns(10);
		
		JLabel label_5 = new JLabel("");
		add(label_5);
		
		JLabel lblNumeroMinutos = new JLabel("Numero Minutos");
		add(lblNumeroMinutos);
		
		txtNumerominutos = new JTextField();
		txtNumerominutos.setEditable(false);
		add(txtNumerominutos);
		txtNumerominutos.setColumns(10);
		
		JLabel lblMinutosLlamada = new JLabel("Minutos Llamada");
		add(lblMinutosLlamada);
		
		txtMinutosllamada = new JTextField();
		add(txtMinutosllamada);
		txtMinutosllamada.setColumns(10);
		
		JLabel label_2 = new JLabel("");
		add(label_2);
		
		chckbxLocal = new JCheckBox("Local");
		add(chckbxLocal);
		
		chckbxLargaDistancia = new JCheckBox("Larga Distancia");
		add(chckbxLargaDistancia);
		
		chckbxCelular = new JCheckBox("Celular");
		add(chckbxCelular);
		
		JLabel label_3 = new JLabel("");
		add(label_3);
		
		btnAgregarLlamada = new JButton("Agregar Llamada");
		btnAgregarLlamada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int minutos = Integer.parseInt(txtMinutosllamada.getText());
				boolean local = chckbxLocal.isSelected();
				boolean largaDistancia = chckbxLargaDistancia.isSelected();
				boolean celular = chckbxCelular.isSelected();
				
				if(local && !largaDistancia && !celular) {
					if(numeroLinea == 1) {principal.empresa.agregarLlamadaLocalLinea1(minutos);}
					else if(numeroLinea == 2) {principal.empresa.agregarLlamadaLocalLinea2(minutos);}
					else if(numeroLinea == 3) {principal.empresa.agregarLlamadaLocalLinea3(minutos);}
				}else if(!local && largaDistancia && !celular) {
					if(numeroLinea == 1) {principal.empresa.agregarLlamadaLargaDistanciaLinea1(minutos);}
					else if(numeroLinea == 2) {principal.empresa.agregarLlamadaLargaDistanciaLinea2(minutos);}
					else if(numeroLinea == 3) {principal.empresa.agregarLlamadaLargaDistanciaLinea3(minutos);}
				}else if(!local && !largaDistancia && celular) {
					if(numeroLinea == 1) {principal.empresa.agregarLlamadaCelularLinea1(minutos);}
					else if(numeroLinea == 2) {principal.empresa.agregarLlamadaCelularLinea2(minutos);}
					else if(numeroLinea == 3) {principal.empresa.agregarLlamadaCelularLinea3(minutos);}
				}
				
				if(numeroLinea == 1) {actualizar(principal.empresa.darLinea1());}
				else if(numeroLinea == 2) {actualizar(principal.empresa.darLinea2());}
				else if(numeroLinea == 3) {actualizar(principal.empresa.darLinea3());}
				//principal.agregarLlamada(txtMinutosllamada.getText(), chckbxLocal.isSelected(), chckbxLargaDistancia.isSelected(), chckbxCelular.isSelected());
			}
		});
		btnAgregarLlamada.setForeground(Color.DARK_GRAY);
		btnAgregarLlamada.setBackground(Color.CYAN);
		add(btnAgregarLlamada);
		
		JLabel label_4 = new JLabel("");
		label_4.setForeground(Color.DARK_GRAY);
		add(label_4);

	}
	
	public void actualizar(LineaTelefonica linea) {
		txtvalortotallinea.setText(formatearValor(linea.darCostoLlamadas()));
		txtNumerosllamadas.setText(formatearValorEntero(linea.darNumeroLlamadas()));
		txtNumerominutos.setText(formatearValorEntero(linea.darNumeroMinutos()));
		principal.actualizar();
	}
	
	private String formatearValor(double valor) {
		return String.valueOf(valor);
	}
	
	private String formatearValorEntero(int valor) {
		return String.valueOf(valor);
	}
}
