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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class Bienvenida extends JFrame {

    private JPanel contentPane;
    private JLabel lblModelo;
    private JLabel lblCantidad;
    private JComboBox<String> cboModelo;
    private JTextField txtCantidad;
    private JButton btnProcesar;
    private JButton btnBorrar;
    private JScrollPane scpScroll;
    private JTextArea txtAreaSalida;
    private JToggleButton tglbtnModoOscuro;
    private boolean esModoOscuro = false;

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

    public Bienvenida() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        lblModelo = new JLabel("Modelo");
        lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblCantidad = new JLabel("Cantidad");
        lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
        cboModelo = new JComboBox<>();
        cboModelo.setModel(new DefaultComboBoxModel<>(new String[] { "Sherman", "Faguo", "Aldo", "Suburban" }));
        txtCantidad = new JTextField();
        btnProcesar = new JButton("Procesar");
        btnBorrar = new JButton("Borrar");
        scpScroll = new JScrollPane();
        scpScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scpScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        txtAreaSalida = new JTextArea();
        scpScroll.setViewportView(txtAreaSalida);
        
        // Create the toggle button for dark mode
        tglbtnModoOscuro = new JToggleButton("Modo Oscuro");
        tglbtnModoOscuro.addActionListener(e -> toggleMode());

        GroupLayout layout = new GroupLayout(contentPane);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(scpScroll, GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        				.addComponent(tglbtnModoOscuro)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblCantidad)
        						.addComponent(lblModelo))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(cboModelo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(btnBorrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(btnProcesar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnProcesar)
        				.addComponent(cboModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblModelo))
        			.addGap(20)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnBorrar)
        				.addComponent(lblCantidad)
        				.addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(scpScroll, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(tglbtnModoOscuro)
        			.addContainerGap())
        );
        contentPane.setLayout(layout);

        actualizarUI();
    }

    private void toggleMode() {
        esModoOscuro = !esModoOscuro;
        actualizarUI();
    }

    private void actualizarUI() {
        if (esModoOscuro) {
            contentPane.setBackground(Color.DARK_GRAY);
            lblModelo.setForeground(Color.WHITE);
            lblCantidad.setForeground(Color.WHITE);
            cboModelo.setBackground(Color.GRAY);
            cboModelo.setForeground(Color.WHITE);
            txtCantidad.setBackground(Color.GRAY);
            txtCantidad.setForeground(Color.WHITE);
            btnProcesar.setBackground(Color.DARK_GRAY);
            btnProcesar.setForeground(Color.WHITE);
            btnBorrar.setBackground(Color.DARK_GRAY);
            btnBorrar.setForeground(Color.WHITE);
            scpScroll.setBackground(Color.DARK_GRAY);
            txtAreaSalida.setBackground(Color.DARK_GRAY);
            txtAreaSalida.setForeground(Color.WHITE);
            tglbtnModoOscuro.setText("Modo Claro");
        } else {
            contentPane.setBackground(Color.WHITE);
            lblModelo.setForeground(Color.BLACK);
            lblCantidad.setForeground(Color.BLACK);
            cboModelo.setBackground(Color.WHITE);
            cboModelo.setForeground(Color.BLACK);
            txtCantidad.setBackground(Color.WHITE);
            txtCantidad.setForeground(Color.BLACK);
            btnProcesar.setBackground(Color.LIGHT_GRAY);
            btnProcesar.setForeground(Color.BLACK);
            btnBorrar.setBackground(Color.LIGHT_GRAY);
            btnBorrar.setForeground(Color.BLACK);
            scpScroll.setBackground(Color.WHITE);
            txtAreaSalida.setBackground(Color.WHITE);
            txtAreaSalida.setForeground(Color.BLACK);
            tglbtnModoOscuro.setText("Modo Oscuro");
        }
    }
}
