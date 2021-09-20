package tarea1;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class PanelNotas extends JPanel {
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtNota4;
	private JTextField txtNota5;
	private FrameNotas principal;
	
	public PanelNotas(FrameNotas principal) {
		this();
		this.principal = principal;
	}
	/**
	 * Create the panel.
	 */
	public PanelNotas() {
		setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Notas", TitledBorder.CENTER, TitledBorder.BELOW_TOP, null, new Color(51, 51, 51)));
		setLayout(new GridLayout(5, 2, 5, 5));
		
		JLabel lblEstudiante = new JLabel("Estudiante 1");
		add(lblEstudiante);
		
		txtNota1 = new JTextField();
		txtNota1.setEditable(false);
		txtNota1.setText("0.0");
		add(txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblEstudiante_1 = new JLabel("Estudiante 2");
		add(lblEstudiante_1);
		
		txtNota2 = new JTextField();
		txtNota2.setEditable(false);
		txtNota2.setText("0.0");
		add(txtNota2);
		txtNota2.setColumns(10);
		
		JLabel lblEstudiante_2 = new JLabel("Estudiante 3");
		add(lblEstudiante_2);
		
		txtNota3 = new JTextField();
		txtNota3.setEditable(false);
		txtNota3.setText("0.0");
		add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblEstudiante_3 = new JLabel("Estudiante 4");
		add(lblEstudiante_3);
		
		txtNota4 = new JTextField();
		txtNota4.setEditable(false);
		txtNota4.setText("0.0");
		add(txtNota4);
		txtNota4.setColumns(10);
		
		JLabel lblEstudiante_4 = new JLabel("Estudiante 5");
		add(lblEstudiante_4);
		
		txtNota5 = new JTextField();
		txtNota5.setEditable(false);
		txtNota5.setText("0.0");
		add(txtNota5);
		txtNota5.setColumns(10);

	}
	
	public void actualizar(String E1,String E2,String E3,String E4,String E5) {
		txtNota1.setText(E1);
		txtNota2.setText(E2);
		txtNota3.setText(E3);
		txtNota4.setText(E4);
		txtNota5.setText(E5);
	}
	
	public ArrayList<String> tomarCuadrosNotas(){
		ArrayList<String> notas = new ArrayList<String>();
		notas.add(txtNota1.getText());
		notas.add(txtNota2.getText());
		notas.add(txtNota3.getText());
		notas.add(txtNota4.getText());
		notas.add(txtNota5.getText());
		return notas;
	}

}
