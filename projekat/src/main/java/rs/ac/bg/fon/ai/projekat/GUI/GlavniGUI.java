package rs.ac.bg.fon.ai.projekat.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import rs.ac.bg.fon.ai.projekat.controler.Controler;
import rs.ac.bg.fon.ai.projekat.domen.Dan;
import rs.ac.bg.fon.ai.projekat.domen.Grad;
import rs.ac.bg.fon.ai.projekat.domen.Sat;
import rs.ac.bg.fon.ai.projekat.sesson.Sesson;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
/**
 * 
 * @author Ivan Stanimirovic
 *
 */
public class GlavniGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSlika;
	private JComboBox cmbGrad;
	private JLabel lblGrad;
	private JLabel lblStepeni;
	private JLabel lblVetar;
	private JPanel krozSate;
	private JLabel lblKmh;
	private JLabel lblPrva;
	private JLabel lblDruga;
	private JLabel lblTreca;
	private JLabel lblCetvrta;
	private JLabel lblPeta;
	private JLabel lblSesta;
	private JLabel lblPrva1;
	private JLabel lblDruga1;
	private JLabel lblTreca1;
	private JLabel lblCetvrta1;
	private JLabel lblPeta1;
	private JLabel lblSesta1;
	private JLabel lblSlika1;
	private JLabel lblSlika2;
	private JLabel lblSlika3;
	private JLabel lblSlika4;
	private JLabel lblSlika5;
	private JLabel lblSlika6;
	private JLabel lblSlika7;
	private JLabel lblSlika8;
	private JLabel lblDatum1;
	private JLabel lblDatum2;
	private JLabel lblDatum3;
	private JLabel lblDatum4;
	private JLabel lblDatum5;
	private JLabel lblDatum6;
	private JLabel lblDatum7;
	private JLabel lblDatum8;
	private JLabel lblTemp1;
	private JLabel lblTemp2;
	private JLabel lblTemp3;
	private JLabel lblTemp4;
	private JLabel lblTemp5;
	private JLabel lblTemp6;
	private JLabel lblTemp7;
	private JLabel lblTemp8;
	private JLabel lblMin1;
	private JLabel lblMin2;
	private JLabel lblMin3;
	private JLabel lblMin4;
	private JLabel lblMin5;
	private JLabel lblMin6;
	private JLabel lblMin7;
	private JLabel lblMin8;
	private JPanel trenutnaTemp;
	private JPanel slikaTrenutna;
	private JPanel narednihDana;
	private JLabel lblDobroDosli;
	private JLabel lblDatum;
	private JLabel lblMax;
	private JLabel lblMin;
	private JLabel lblPrognozaPoSatima;
	private JLabel lblPrognozaPoDanima;
	private JLabel lblTrenutnaPrognoza;
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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 557);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setMinimumSize(new Dimension(10, 30));
		panel.setPreferredSize(new Dimension(100, 50));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Izaberite Grad:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setPreferredSize(new Dimension(100, 30));
		panel.add(lblNewLabel);
		
		cmbGrad = new JComboBox();
		cmbGrad.setPreferredSize(new Dimension(100, 20));
		popuniCmbGrad();
		panel.add(cmbGrad);	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		trenutnaTemp = new JPanel();
		trenutnaTemp.setVisible(false);
		trenutnaTemp.setBackground(Color.DARK_GRAY);
		trenutnaTemp.setBounds(10, 11, 494, 232);
		panel_1.add(trenutnaTemp);
		trenutnaTemp.setLayout(null);
		trenutnaTemp.add(getLblGrad());
		trenutnaTemp.add(getLblStepeni());
		trenutnaTemp.add(getLblVetar());
		trenutnaTemp.add(getKrozSate());
		trenutnaTemp.add(getLblKmh());
		
		lblPrva = new JLabel("prva");
		lblPrva.setForeground(Color.WHITE);
		lblPrva.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrva.setBounds(10, 143, 70, 47);
		trenutnaTemp.add(lblPrva);
		
		lblDruga = new JLabel("prva");
		lblDruga.setForeground(Color.WHITE);
		lblDruga.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDruga.setBounds(86, 143, 70, 47);
		trenutnaTemp.add(lblDruga);
		
		lblTreca = new JLabel("prva");
		lblTreca.setForeground(Color.WHITE);
		lblTreca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTreca.setBounds(166, 143, 70, 47);
		trenutnaTemp.add(lblTreca);
		
		lblCetvrta = new JLabel("prva");
		lblCetvrta.setForeground(Color.WHITE);
		lblCetvrta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCetvrta.setBounds(246, 143, 70, 47);
		trenutnaTemp.add(lblCetvrta);
		
		lblPeta = new JLabel("prva");
		lblPeta.setForeground(Color.WHITE);
		lblPeta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPeta.setBounds(326, 143, 70, 47);
		trenutnaTemp.add(lblPeta);
		
		lblSesta = new JLabel("prva");
		lblSesta.setForeground(Color.WHITE);
		lblSesta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSesta.setBounds(411, 143, 70, 47);
		trenutnaTemp.add(lblSesta);
		
		lblPrva1 = new JLabel("prva");
		lblPrva1.setForeground(Color.WHITE);
		lblPrva1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrva1.setBounds(10, 186, 70, 36);
		trenutnaTemp.add(lblPrva1);
		
		lblDruga1 = new JLabel("prva");
		lblDruga1.setForeground(Color.WHITE);
		lblDruga1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDruga1.setBounds(86, 186, 70, 36);
		trenutnaTemp.add(lblDruga1);
		
		lblTreca1 = new JLabel("prva");
		lblTreca1.setForeground(Color.WHITE);
		lblTreca1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTreca1.setBounds(166, 186, 70, 36);
		trenutnaTemp.add(lblTreca1);
		
		lblCetvrta1 = new JLabel("prva");
		lblCetvrta1.setForeground(Color.WHITE);
		lblCetvrta1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCetvrta1.setBounds(246, 186, 70, 36);
		trenutnaTemp.add(lblCetvrta1);
		
		lblPeta1 = new JLabel("prva");
		lblPeta1.setForeground(Color.WHITE);
		lblPeta1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPeta1.setBounds(326, 186, 70, 36);
		trenutnaTemp.add(lblPeta1);
		
		lblSesta1 = new JLabel("prva");
		lblSesta1.setForeground(Color.WHITE);
		lblSesta1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSesta1.setBounds(411, 186, 70, 36);
		trenutnaTemp.add(lblSesta1);
		
		lblPrognozaPoSatima = new JLabel("Prognoza po satima:");
		lblPrognozaPoSatima.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrognozaPoSatima.setForeground(Color.WHITE);
		lblPrognozaPoSatima.setBounds(10, 121, 146, 25);
		trenutnaTemp.add(lblPrognozaPoSatima);
		
		lblTrenutnaPrognoza = new JLabel("Trenutna prognoza:");
		lblTrenutnaPrognoza.setForeground(Color.WHITE);
		lblTrenutnaPrognoza.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTrenutnaPrognoza.setBounds(10, 0, 146, 25);
		trenutnaTemp.add(lblTrenutnaPrognoza);
		
		slikaTrenutna = new JPanel();
		slikaTrenutna.setVisible(false);
		slikaTrenutna.setBackground(Color.LIGHT_GRAY);
		slikaTrenutna.setBounds(514, 11, 244, 156);
		panel_1.add(slikaTrenutna);
		slikaTrenutna.setLayout(null);
		
		lblSlika = new JLabel("Slika");
		lblSlika.setBounds(0, 0, 244, 156);
		slikaTrenutna.add(lblSlika);
		
		JButton btnUcitaj = new JButton("Ucitaj");
		btnUcitaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Grad grad = (Grad) cmbGrad.getSelectedItem();
				if(Controler.getInstance().ucitajPrognozu(grad)){				
					popuniPrognozu();
					popuniZaViseDana();
				}else{
					JOptionPane.showMessageDialog(null, "Doslo je do greske prilikom ucitavanja prognoze");
				}
			}
		});
		btnUcitaj.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnUcitaj.setHorizontalTextPosition(SwingConstants.CENTER);
		panel.add(btnUcitaj);

		narednihDana = new JPanel();
		narednihDana.setVisible(false);
		narednihDana.setBackground(Color.DARK_GRAY);
		narednihDana.setBounds(10, 264, 748, 193);
		panel_1.add(narednihDana);
		narednihDana.setLayout(null);
		
		lblSlika1 = new JLabel("Slika");
		lblSlika1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSlika1.setForeground(Color.WHITE);
		lblSlika1.setBounds(68, 11, 75, 46);
		narednihDana.add(lblSlika1);
		
		lblSlika2 = new JLabel("Slika");
		lblSlika2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSlika2.setForeground(Color.WHITE);
		lblSlika2.setBounds(153, 11, 75, 46);
		narednihDana.add(lblSlika2);
		
		lblSlika3 = new JLabel("Slika");
		lblSlika3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSlika3.setForeground(Color.WHITE);
		lblSlika3.setBounds(238, 11, 75, 46);
		narednihDana.add(lblSlika3);
		
		lblSlika4 = new JLabel("Slika");
		lblSlika4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSlika4.setForeground(Color.WHITE);
		lblSlika4.setBounds(323, 11, 75, 46);
		narednihDana.add(lblSlika4);
		
		lblSlika5 = new JLabel("Slika");
		lblSlika5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSlika5.setForeground(Color.WHITE);
		lblSlika5.setBounds(408, 11, 75, 46);
		narednihDana.add(lblSlika5);
		
		lblSlika6 = new JLabel("Slika");
		lblSlika6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSlika6.setForeground(Color.WHITE);
		lblSlika6.setBounds(493, 11, 75, 46);
		narednihDana.add(lblSlika6);
		
		lblSlika7 = new JLabel("Slika");
		lblSlika7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSlika7.setForeground(Color.WHITE);
		lblSlika7.setBounds(578, 11, 75, 46);
		narednihDana.add(lblSlika7);
		
		lblSlika8 = new JLabel("Slika");
		lblSlika8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSlika8.setForeground(Color.WHITE);
		lblSlika8.setBounds(663, 11, 75, 46);
		narednihDana.add(lblSlika8);
		
		lblDatum1 = new JLabel("datum");
		lblDatum1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatum1.setForeground(Color.WHITE);
		lblDatum1.setBounds(68, 68, 75, 32);
		narednihDana.add(lblDatum1);
		
		lblDatum2 = new JLabel("datum");
		lblDatum2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatum2.setForeground(Color.WHITE);
		lblDatum2.setBounds(153, 68, 75, 32);
		narednihDana.add(lblDatum2);
		
		lblDatum3 = new JLabel("datum");
		lblDatum3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatum3.setForeground(Color.WHITE);
		lblDatum3.setBounds(238, 68, 75, 32);
		narednihDana.add(lblDatum3);
		
		lblDatum4 = new JLabel("datum");
		lblDatum4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatum4.setForeground(Color.WHITE);
		lblDatum4.setBounds(323, 68, 75, 32);
		narednihDana.add(lblDatum4);
		
		lblDatum5 = new JLabel("datum");
		lblDatum5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatum5.setForeground(Color.WHITE);
		lblDatum5.setBounds(408, 68, 75, 32);
		narednihDana.add(lblDatum5);
		
		lblDatum6 = new JLabel("datum");
		lblDatum6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatum6.setForeground(Color.WHITE);
		lblDatum6.setBounds(493, 68, 75, 32);
		narednihDana.add(lblDatum6);
		
		lblDatum7 = new JLabel("datum");
		lblDatum7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatum7.setForeground(Color.WHITE);
		lblDatum7.setBounds(578, 68, 75, 32);
		narednihDana.add(lblDatum7);
		
		lblDatum8 = new JLabel("datum");
		lblDatum8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDatum8.setForeground(Color.WHITE);
		lblDatum8.setBounds(663, 68, 75, 32);
		narednihDana.add(lblDatum8);
		
		lblTemp1 = new JLabel("temp");
		lblTemp1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemp1.setForeground(Color.WHITE);
		lblTemp1.setBounds(68, 111, 75, 32);
		narednihDana.add(lblTemp1);
		
		lblTemp2 = new JLabel("temp");
		lblTemp2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemp2.setForeground(Color.WHITE);
		lblTemp2.setBounds(153, 111, 75, 32);
		narednihDana.add(lblTemp2);
		
		lblTemp3 = new JLabel("temp");
		lblTemp3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemp3.setForeground(Color.WHITE);
		lblTemp3.setBounds(238, 111, 75, 32);
		narednihDana.add(lblTemp3);
		
		lblTemp4 = new JLabel("temp");
		lblTemp4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemp4.setForeground(Color.WHITE);
		lblTemp4.setBounds(323, 111, 75, 32);
		narednihDana.add(lblTemp4);
		
		lblTemp5 = new JLabel("temp");
		lblTemp5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemp5.setForeground(Color.WHITE);
		lblTemp5.setBounds(408, 111, 75, 32);
		narednihDana.add(lblTemp5);
		
		lblTemp6 = new JLabel("temp");
		lblTemp6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemp6.setForeground(Color.WHITE);
		lblTemp6.setBounds(493, 111, 75, 32);
		narednihDana.add(lblTemp6);
		
		lblTemp7 = new JLabel("temp");
		lblTemp7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemp7.setForeground(Color.WHITE);
		lblTemp7.setBounds(578, 111, 75, 32);
		narednihDana.add(lblTemp7);
		
		lblTemp8 = new JLabel("temp");
		lblTemp8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemp8.setForeground(Color.WHITE);
		lblTemp8.setBounds(663, 111, 75, 32);
		narednihDana.add(lblTemp8);
		
		lblMin1 = new JLabel("min");
		lblMin1.setForeground(Color.WHITE);
		lblMin1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMin1.setBounds(68, 151, 75, 32);
		narednihDana.add(lblMin1);
		
		lblMin2 = new JLabel("min");
		lblMin2.setForeground(Color.WHITE);
		lblMin2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMin2.setBounds(153, 151, 75, 32);
		narednihDana.add(lblMin2);
		
		lblMin3 = new JLabel("min");
		lblMin3.setForeground(Color.WHITE);
		lblMin3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMin3.setBounds(238, 151, 75, 32);
		narednihDana.add(lblMin3);
		
		lblMin4 = new JLabel("min");
		lblMin4.setForeground(Color.WHITE);
		lblMin4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMin4.setBounds(323, 151, 75, 32);
		narednihDana.add(lblMin4);
		
		lblMin5 = new JLabel("min");
		lblMin5.setForeground(Color.WHITE);
		lblMin5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMin5.setBounds(408, 151, 75, 32);
		narednihDana.add(lblMin5);
		
		lblMin6 = new JLabel("min");
		lblMin6.setForeground(Color.WHITE);
		lblMin6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMin6.setBounds(493, 151, 75, 32);
		narednihDana.add(lblMin6);
		
		lblMin7 = new JLabel("min");
		lblMin7.setForeground(Color.WHITE);
		lblMin7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMin7.setBounds(578, 151, 75, 32);
		narednihDana.add(lblMin7);
		
		lblMin8 = new JLabel("min");
		lblMin8.setForeground(Color.WHITE);
		lblMin8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMin8.setBounds(663, 151, 75, 32);
		narednihDana.add(lblMin8);
		
		lblDatum = new JLabel("Datum:");
		lblDatum.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDatum.setForeground(Color.WHITE);
		lblDatum.setBounds(6, 78, 52, 14);
		narednihDana.add(lblDatum);
		
		lblMax = new JLabel("Max:");
		lblMax.setForeground(Color.WHITE);
		lblMax.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMax.setBounds(6, 122, 52, 14);
		narednihDana.add(lblMax);
		
		lblMin = new JLabel("Min:");
		lblMin.setForeground(Color.WHITE);
		lblMin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMin.setBounds(6, 162, 52, 14);
		narednihDana.add(lblMin);
		
		lblPrognozaPoDanima = new JLabel("Prognoza po danima:");
		lblPrognozaPoDanima.setForeground(Color.WHITE);
		lblPrognozaPoDanima.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrognozaPoDanima.setBounds(10, 0, 149, 25);
		narednihDana.add(lblPrognozaPoDanima);
		
		lblDobroDosli = new JLabel("Dobro dosli u aplikaciju");
		lblDobroDosli.setHorizontalAlignment(SwingConstants.CENTER);
		lblDobroDosli.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblDobroDosli.setBounds(0, 0, 778, 468);
		panel_1.add(lblDobroDosli);
	}

	private void popuniCmbGrad() {		
		for (Grad grad : Sesson.getInstance().getGradovi()) {
			cmbGrad.addItem(grad);
		}		
	}
	private void popuniPrognozu(){
		lblSlika.setText("");
		lblSlika.setIcon(Controler.getInstance().vratiSliku(Sesson.getInstance().getTrenutno().getStanje()));
		Grad gr = (Grad)cmbGrad.getSelectedItem();
		lblGrad.setText(gr.getNazivGrada());
		lblStepeni.setText(Sesson.getInstance().getTrenutno().getTrenutna() + "\u00B0C");
		lblKmh.setText(Sesson.getInstance().getTrenutno().getVetar() + " m/s");
		LinkedList<Sat> poSatima = Sesson.getInstance().getPoSatima();
		for(int i=0; i<poSatima.size(); i++){						
			Date datum = poSatima.get(i).getDatum();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");			
			String vreme = sdf.format(datum);
			double temp = poSatima.get(i).getTemp();		
			switch (i) {
			case 0:
				lblPrva.setText(vreme);
				lblPrva1.setText(temp+"\u00B0C");
				break;
			case 1:
				lblDruga.setText(vreme);
				lblDruga1.setText(temp+"\u00B0C");
				break;
			case 2:
				lblTreca.setText(vreme);
				lblTreca1.setText(temp+"\u00B0C");
				break;
			case 3:
				lblCetvrta.setText(vreme);
				lblCetvrta1.setText(temp+"\u00B0C");
				break;
			case 4:
				lblPeta.setText(vreme);
				lblPeta1.setText(temp+"\u00B0C");
				break;
			case 5:
				lblSesta.setText(vreme);
				lblSesta1.setText(temp+"\u00B0C");
				break;

			default:
				
				break;
			}
			if(i>5){
				break;
			}
		}
		lblDobroDosli.setVisible(false);
		slikaTrenutna.setVisible(true);
		trenutnaTemp.setVisible(true);
		
	}
	private JLabel getLblGrad() {
		if (lblGrad == null) {
			lblGrad = new JLabel("Grad");
			lblGrad.setForeground(Color.WHITE);
			lblGrad.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblGrad.setBounds(10, 27, 178, 47);
		}
		return lblGrad;
	}
	private JLabel getLblStepeni() {
		if (lblStepeni == null) {
			lblStepeni = new JLabel("Stepeni");
			lblStepeni.setForeground(Color.WHITE);
			lblStepeni.setFont(new Font("Tahoma", Font.BOLD, 45));
			lblStepeni.setHorizontalAlignment(SwingConstants.CENTER);
			lblStepeni.setBounds(226, 11, 234, 106);
		}
		return lblStepeni;
	}
	private JLabel getLblVetar() {
		if (lblVetar == null) {
			lblVetar = new JLabel("Vetar: ");
			lblVetar.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblVetar.setForeground(Color.WHITE);
			lblVetar.setBounds(10, 71, 59, 30);
		}
		return lblVetar;
	}
	private JPanel getKrozSate() {
		if (krozSate == null) {
			krozSate = new JPanel();
			krozSate.setForeground(Color.WHITE);
			krozSate.setBounds(494, 128, -489, 104);
		}
		return krozSate;
	}
	private JLabel getLblKmh() {
		if (lblKmh == null) {
			lblKmh = new JLabel("km/h");
			lblKmh.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblKmh.setForeground(Color.WHITE);
			lblKmh.setBounds(79, 69, 95, 34);
		}
		return lblKmh;
	}
	
	private void popuniZaViseDana(){
		LinkedList<Dan> poDanima = Sesson.getInstance().getPoDanima();
		for(int i=0; i<poDanima.size(); i++){						
			Date datum = poDanima.get(i).getDatum();
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM");			
			String vreme = sdf.format(datum);
			double max = poDanima.get(i).getMax();
			double min = poDanima.get(i).getMin();
			ImageIcon icon = Controler.getInstance().vratiMaluSliku(poDanima.get(i).getStanje());
			switch (i) {
			case 0:
				lblSlika1.setIcon(icon);
				lblSlika1.setText("");
				lblDatum1.setText(vreme);
				lblTemp1.setText(max+"\u00B0C");
				lblMin1.setText(min + "\u00B0C");
				break;
			case 1:
				lblSlika2.setIcon(icon);
				lblSlika2.setText("");
				lblDatum2.setText(vreme);
				lblTemp2.setText(max+"\u00B0C");
				lblMin2.setText(min + "\u00B0C");
				break;
			case 2:
				lblSlika3.setIcon(icon);
				lblSlika3.setText("");
				lblDatum3.setText(vreme);
				lblTemp3.setText(max+"\u00B0C");
				lblMin3.setText(min + "\u00B0C");
				break;
			case 3:
				lblSlika4.setIcon(icon);
				lblSlika4.setText("");
				lblDatum4.setText(vreme);
				lblTemp4.setText(max+"\u00B0C");
				lblMin4.setText(min + "\u00B0C");
				break;
			case 4:
				lblSlika5.setIcon(icon);
				lblSlika5.setText("");
				lblDatum5.setText(vreme);
				lblTemp5.setText(max+"\u00B0C");
				lblMin5.setText(min + "\u00B0C");
				break;
			case 5:
				lblSlika6.setIcon(icon);
				lblSlika6.setText("");
				lblDatum6.setText(vreme);
				lblTemp6.setText(max+"\u00B0C");
				lblMin6.setText(min + "\u00B0C");
				break;
			case 6:
				lblSlika7.setIcon(icon);
				lblSlika7.setText("");
				lblDatum7.setText(vreme);
				lblTemp7.setText(max+"\u00B0C");
				lblMin7.setText(min + "\u00B0C");
				break;
			case 7:
				lblSlika8.setIcon(icon);
				lblSlika8.setText("");
				lblDatum8.setText(vreme);
				lblTemp8.setText(max+"\u00B0C");
				lblMin8.setText(min + "\u00B0C");
				break;

			default:
				
				break;
			}
			if(i>7){
				break;
			}
		}
		narednihDana.setVisible(true);
	}
}
