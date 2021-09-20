package tarea1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameNotas extends JFrame {

	private JPanel contentPane;
	private PanelNotas panelNotas;
	private PanelCambioNotas panelCambioNotas;
	private PanelOpcionesGenerales panelOpcionesGenerales;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameNotas frame = new FrameNotas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameNotas() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panelNotas = new PanelNotas(this);
		contentPane.add(panelNotas, BorderLayout.WEST);
		
		panelCambioNotas = new PanelCambioNotas(this);
		contentPane.add(panelCambioNotas, BorderLayout.EAST);
		
		panelOpcionesGenerales = new PanelOpcionesGenerales(this);
		contentPane.add(panelOpcionesGenerales, BorderLayout.SOUTH);
		
		this.actualizar("1", "2", "3", "4", "5");
	}
	
	public void actualizar(String notaE1,String notaE2,String notaE3,String notaE4,String notaE5) {
		this.panelNotas.actualizar(notaE1,notaE2,notaE3,notaE4,notaE5);
	}
	
	public ArrayList<String> pedirNotas() {
		ArrayList<String> notas = this.panelNotas.tomarCuadrosNotas();
		return notas;
	}
	
	public void cambiarNotas(ArrayList<String> listaNotas) {
		
		ArrayList<String> notas = this.panelNotas.tomarCuadrosNotas();
			
		String nota1 = "";
		String nota2 = "";
		String nota3 = "";
		String nota4 = "";
		String nota5 = "";
		
		for(int i = 0; i < listaNotas.size(); i++) {
			String nIterado = listaNotas.get(i);
			
			if(nIterado.length() !=0) {
				switch (i) {
				case 0:
					nota1 = nIterado;
					break;
				case 1:
					nota2 = nIterado;
					break;
				case 2:
					nota3 = nIterado;
					break;
				case 3:
					nota4 = nIterado;
					break;
				case 4:
					nota5 = nIterado;
					break;
				}
			}else {
				switch (i) {
				case 0:
					nota1 = notas.get(i);
					break;
				case 1:
					nota2 = notas.get(i);
					break;
				case 2:
					nota3 = notas.get(i);
					break;
				case 3:
					nota4 = notas.get(i);
					break;
				case 4:
					nota5 = notas.get(i);
					break;
				}
			}
		}
		actualizar(nota1,nota2,nota3,nota4,nota5);
	}
	
}
