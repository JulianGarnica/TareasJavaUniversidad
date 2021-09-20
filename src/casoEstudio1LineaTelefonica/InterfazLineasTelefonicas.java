package casoEstudio1LineaTelefonica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class InterfazLineasTelefonicas extends JFrame {

	private JPanel contentPane;
	public Empresa empresa = new Empresa();
	private PanelTotales panelTotales;
	private PanelLineaTelefonica panelLineaTelefonica;
	private PanelLineaTelefonica panelLineaTelefonica_1;
	private PanelLineaTelefonica panelLineaTelefonica_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazLineasTelefonicas frame = new InterfazLineasTelefonicas();
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
	public InterfazLineasTelefonicas () {
		empresa.inicializar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 2, 0, 0));
		
		panelTotales = new PanelTotales();
		contentPane.add(panelTotales);
		
		panelLineaTelefonica = new PanelLineaTelefonica(this, 1);
		contentPane.add(panelLineaTelefonica);
		
		panelLineaTelefonica_1 = new PanelLineaTelefonica(this, 2);
		contentPane.add(panelLineaTelefonica_1);
		
		panelLineaTelefonica_2 = new PanelLineaTelefonica(this, 3);
		contentPane.add(panelLineaTelefonica_2);
	}
	
	public void agregarLlamada(int numeroLinea) {
		
	}
	public void reiniciar() {
		empresa.reiniciar();
	}
	
	public void actualizar() {
		PanelTotales.actualizar(empresa);
	}
	
}
