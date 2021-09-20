package tarea1;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PanelCambioNotas extends JPanel {
	private JTextField txtCambionota;
	private JTextField txtCambionota_1;
	private JTextField txtCambionota_2;
	private JTextField txtCambionota_3;
	private JTextField txtCambionota_4;
	private JCheckBox chckbxEstudiante;
	private JCheckBox chckbxEstudiante_1;
	private JCheckBox chckbxEstudiante_2;
	private JCheckBox chckbxEstudiante_3;
	private JCheckBox chckbxEstudiante_4;
	
	private FrameNotas principal;
	
	public PanelCambioNotas(FrameNotas principal) {
		this();
		this.principal = principal;
	}
	/**
	 * Create the panel.
	 */
	public PanelCambioNotas() {
		setBorder(new TitledBorder(null, "Cambio de Notas", TitledBorder.CENTER, TitledBorder.BELOW_TOP, null, null));
		setLayout(new GridLayout(6, 3, 5, 5));
		
		chckbxEstudiante = new JCheckBox("Estudiante 1");
		add(chckbxEstudiante);
		
		txtCambionota = new JTextField();
		add(txtCambionota);
		txtCambionota.setColumns(10);
		
		chckbxEstudiante_1 = new JCheckBox("Estudiante 2");
		add(chckbxEstudiante_1);
		
		txtCambionota_1 = new JTextField();
		txtCambionota_1.setColumns(10);
		add(txtCambionota_1);
		
		chckbxEstudiante_2 = new JCheckBox("Estudiante 3");
		add(chckbxEstudiante_2);
		
		txtCambionota_2 = new JTextField();
		txtCambionota_2.setColumns(10);
		add(txtCambionota_2);
		
		chckbxEstudiante_3 = new JCheckBox("Estudiante 4");
		add(chckbxEstudiante_3);
		
		txtCambionota_3 = new JTextField();
		txtCambionota_3.setColumns(10);
		add(txtCambionota_3);
		
		chckbxEstudiante_4 = new JCheckBox("Estudiante 5");
		add(chckbxEstudiante_4);
		
		txtCambionota_4 = new JTextField();
		txtCambionota_4.setColumns(10);
		add(txtCambionota_4);
		
		JButton btnCambiarNotas = new JButton("Cambiar Notas");
		btnCambiarNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> confirmEstudiantes = new ArrayList<String>();
				String txtNota1 = "";
				String txtNota2 = "";
				String txtNota3 = "";
				String txtNota4 = "";
				String txtNota5 = "";
				String nota;
				
				if(chckbxEstudiante.isSelected()) {
					nota = txtCambionota.getText();
					txtNota1 = nota;
				}
				if(chckbxEstudiante_1.isSelected()) {
					nota = txtCambionota_1.getText();
					txtNota2 = nota;
				}
				if(chckbxEstudiante_2.isSelected()) {
					nota = txtCambionota_2.getText();
					txtNota3 = nota;
				}
				if(chckbxEstudiante_3.isSelected()) {
					nota = txtCambionota_3.getText();
					txtNota4 = nota;
				}
				if(chckbxEstudiante_4.isSelected()) {
					nota = txtCambionota_4.getText();
					txtNota5 = nota;
				}
				
				confirmEstudiantes.add(txtNota1);
				confirmEstudiantes.add(txtNota2);
				confirmEstudiantes.add(txtNota3);
				confirmEstudiantes.add(txtNota4);
				confirmEstudiantes.add(txtNota5);
				
				principal.cambiarNotas(confirmEstudiantes);
			}
		});
		add(btnCambiarNotas);

	}

		/*
	public JCheckBox getChckbxEstudiante() {
		return chckbxEstudiante;
	}
	public JCheckBox getChckbxEstudiante_1() {
		return chckbxEstudiante_1;
	}
	public JCheckBox getChckbxEstudiante_2() {
		return chckbxEstudiante_2;
	}
	public JCheckBox getChckbxEstudiante_3() {
		return chckbxEstudiante_3;
	}
	public JCheckBox getChckbxEstudiante_4() {
		return chckbxEstudiante_4;
	}
	*/
}
