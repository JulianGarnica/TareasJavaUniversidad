package tarea1;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PanelOpcionesGenerales extends JPanel {
	private FrameNotas principal;
	
	public PanelOpcionesGenerales(FrameNotas principal) {
		this();
		this.principal = principal;
	}
	
	/**
	 * Create the panel.
	 */
	public PanelOpcionesGenerales() {
		setBorder(new TitledBorder(null, "Opciones Generales", TitledBorder.CENTER, TitledBorder.BELOW_TOP, null, null));
		setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				principal.actualizar("0.0", "0.0", "0.0", "0.0", "0.0");
			}
		});
		add(btnReiniciar);
		
		JButton btnAumentar = new JButton("Aumentar");
		btnAumentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> notas = principal.pedirNotas();
				String nota1 = "";
				String nota2 = "";
				String nota3 = "";
				String nota4 = "";
				String nota5 = "";
				for (int i=0; i < notas.size(); i++) {
					Double nIterado = Double.parseDouble(notas.get(i));
					if(nIterado < 5) {
						switch (i) {
						case 0:
							nota1 = Double.toString(nIterado+.5);
							break;
						case 1:
							nota2 = Double.toString(nIterado+.5);
							break;
						case 2:
							nota3 = Double.toString(nIterado+.5);
							break;
						case 3:
							nota4 = Double.toString(nIterado+.5);
							break;
						case 4:
							nota5 = Double.toString(nIterado+.5);
							break;
						}
					}else {
						switch (i) {
						case 0:
							nota1 = Double.toString(nIterado);
							break;
						case 1:
							nota2 = Double.toString(nIterado);
							break;
						case 2:
							nota3 = Double.toString(nIterado);
							break;
						case 3:
							nota4 = Double.toString(nIterado);
							break;
						case 4:
							nota5 = Double.toString(nIterado);
							break;
						}
					}
				}
				
				principal.actualizar(nota1, nota2, nota3, nota4, nota5);
				
			}
		});
		add(btnAumentar);
		
		JButton btnQuitar = new JButton("Quitar");
		btnQuitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> notas = principal.pedirNotas();
				String nota1 = "";
				String nota2 = "";
				String nota3 = "";
				String nota4 = "";
				String nota5 = "";
				for (int i=0; i < notas.size(); i++) {
					Double nIterado = Double.parseDouble(notas.get(i));
					if(nIterado > 0) {
						switch (i) {
						case 0:
							nota1 = Double.toString(nIterado-.5);
							break;
						case 1:
							nota2 = Double.toString(nIterado-.5);
							break;
						case 2:
							nota3 = Double.toString(nIterado-.5);
							break;
						case 3:
							nota4 = Double.toString(nIterado-.5);
							break;
						case 4:
							nota5 = Double.toString(nIterado-.5);
							break;
						}
					}else {
						switch (i) {
						case 0:
							nota1 = Double.toString(nIterado);
							break;
						case 1:
							nota2 = Double.toString(nIterado);
							break;
						case 2:
							nota3 = Double.toString(nIterado);
							break;
						case 3:
							nota4 = Double.toString(nIterado);
							break;
						case 4:
							nota5 = Double.toString(nIterado);
							break;
						}
					}
				}
				
				principal.actualizar(nota1, nota2, nota3, nota4, nota5);
			}
		});
		add(btnQuitar);

	}

}
