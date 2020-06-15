package rs.ac.bg.fon.ai.projekat.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Insets;

public class GlavniGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GlavniGUI frame = new GlavniGUI();
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
	public GlavniGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setMinimumSize(new Dimension(10, 30));
		panel.setPreferredSize(new Dimension(100, 50));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Izaberite Grad:");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setPreferredSize(new Dimension(100, 30));
		panel.add(lblNewLabel);
		
		JComboBox cmbGrad = new JComboBox();
		cmbGrad.setPreferredSize(new Dimension(100, 20));
		panel.add(cmbGrad);
		
		JButton btnUcitaj = new JButton("Ucitaj");
		btnUcitaj.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnUcitaj.setHorizontalTextPosition(SwingConstants.CENTER);
		panel.add(btnUcitaj);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel trenutnaTemp = new JPanel();
		trenutnaTemp.setBounds(10, 11, 470, 232);
		panel_1.add(trenutnaTemp);
		
		JPanel slikaTrenutna = new JPanel();
		slikaTrenutna.setBounds(514, 11, 244, 156);
		panel_1.add(slikaTrenutna);
		slikaTrenutna.setLayout(null);
		
		JLabel lblSlika = new JLabel("New label");
		lblSlika.setBounds(0, 0, 244, 156);
		slikaTrenutna.add(lblSlika);
		
		JPanel narednihDana = new JPanel();
		narednihDana.setBounds(10, 264, 748, 183);
		panel_1.add(narednihDana);
	}
}
