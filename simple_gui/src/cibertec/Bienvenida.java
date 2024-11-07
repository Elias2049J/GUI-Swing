package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class Bienvenida extends JFrame {

	private JPanel contentPane;
	private JLabel lblModelo;
	private JLabel lblCantidad;
	private JComboBox cboModelo;
	private JTextField txtCantidad;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JScrollPane scpScroll;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida frame = new Bienvenida();
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
	public Bienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(40, 41, 49, 14);
		contentPane.add(lblModelo);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(40, 82, 49, 14);
		contentPane.add(lblCantidad);
		
		cboModelo = new JComboBox();
		cboModelo.setToolTipText("Ingresar valores mayores a 5");
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Sherman", "Faguo", "Aldo", "Suburban"}));
		cboModelo.setBounds(85, 37, 133, 22);
		contentPane.add(cboModelo);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(95, 79, 123, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(244, 37, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(244, 78, 89, 23);
		contentPane.add(btnBorrar);
		
		scpScroll = new JScrollPane();
		scpScroll.setBounds(40, 124, 348, 128);
		contentPane.add(scpScroll);
		
		txtS = new JTextArea();
		scpScroll.setViewportView(txtS);
	}
}
