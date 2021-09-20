package interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class PanelBotones extends JPanel {
	private JButton btnIzquierda;
	private JButton btnAbajo;
	private JButton btnDerecha;
	private JButton btnArriba;
	private JButton btnReset;
	private JButton btnRotar;
	private int rotacion = 1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;

	/**
	 * Create the panel.
	 */
	public PanelBotones() {
		setBorder(new TitledBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Puntos Cardinales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)), "Puntos Cardinales", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(3, 3, 5, 5));
		
		label = new JLabel("");
		
		btnArriba = new JButton("Arriba");
		btnArriba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_2.setText("Norte");
			}
		});
		
		label_1 = new JLabel("");
		
		btnIzquierda = new JButton("Izquierda");
		btnIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_2.setText("Oeste");
			}
		});
		
		label_2 = new JLabel("");
		
		btnDerecha = new JButton("Derecha");
		btnDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_2.setText("Este");
			}
		});
		
		btnReset = new JButton("Reset");
		btnReset.setBackground(Color.CYAN);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_2.setText("");
				rotacion = 0;
				reacomodarBotones(rotacion);
				rotacion++;
			}
		});
		
		
		btnAbajo = new JButton("Abajo");
		btnAbajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_2.setText("Sur");
			}
		});
		
		btnRotar = new JButton("Rotar");
		btnRotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rotacion < 4) {
					//System.out.println(framePrincipal.rotar(rotacion));
					
					reacomodarBotones(rotacion);					
					rotacion++;
					
				}else {
					rotacion = 0;
					reacomodarBotones(rotacion);
					rotacion++;
				}
			}
		});
		btnRotar.setBackground(Color.ORANGE);
		
		add(label);
		add(btnArriba);
		add(label_1);
		add(btnIzquierda);
		add(label_2);
		add(btnDerecha);
		add(btnReset);
		add(btnAbajo);
		add(btnRotar);
	}
	

	public void eliminarBotones(){
		remove(label);
		remove(btnArriba);
		remove(label_1);
		remove(btnIzquierda);
		remove(label_2);
		remove(btnDerecha);
		remove(btnReset);
		remove(btnAbajo);
		remove(btnRotar);
	}
	
	public void reacomodarBotones(int rotar) {
		eliminarBotones();
		if (rotar == 0) {
			add(label);
			add(btnArriba);
			add(label_1);
			add(btnIzquierda);
			add(label_2);
			add(btnDerecha);
			add(btnReset);
			add(btnAbajo);
			add(btnRotar);
		}else if(rotar == 1) {
			add(label);
			add(btnIzquierda);
			add(label_1);
			add(btnAbajo);
			add(label_2);
			add(btnArriba);
			add(btnReset);
			add(btnDerecha);
			add(btnRotar);
		}else if(rotar == 2) {
			add(label);
			add(btnAbajo);
			add(label_1);
			add(btnDerecha);
			add(label_2);
			add(btnIzquierda);
			add(btnReset);
			add(btnArriba);
			add(btnRotar);
		}else if(rotar == 3) {
			add(label);
			add(btnDerecha);
			add(label_1);
			add(btnArriba);
			add(label_2);
			add(btnAbajo);
			add(btnReset);
			add(btnIzquierda);
			add(btnRotar);
		}
		updateUI();
		invalidate();
		repaint();
	}
}
