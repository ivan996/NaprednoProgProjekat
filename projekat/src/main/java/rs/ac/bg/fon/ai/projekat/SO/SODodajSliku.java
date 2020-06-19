package rs.ac.bg.fon.ai.projekat.SO;

import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * Klasa sluzi za vrsenje sistemske operacije
 * @author Ivan Stanimirovic
 *
 */
public class SODodajSliku {
	/**
	 * Metoda vratiSLiku sluzi da bi se vratila odredjena slika na osnovu ulaznog parametra
	 * @param naziv predstavlja trenutno stanje neba
	 * @return instancu klase ImageIcon koja predstavlja sliku neba
	 */
	public ImageIcon vratiSliku(String naziv){	
		ImageIcon icon = null;
		Image image;
		switch (naziv) {
		case "Rain":
			icon = new ImageIcon("src/main/resources/icons/kisa.png");
			image = icon.getImage().getScaledInstance(200, 150,Image.SCALE_DEFAULT);
			icon = new ImageIcon(image);
			break;
		case "Clouds":
			icon = new ImageIcon("src/main/resources/icons/oblak.png");
			image = icon.getImage().getScaledInstance(200, 150,Image.SCALE_DEFAULT);
			icon = new ImageIcon(image);
			break;
		case "Snow":
			icon = new ImageIcon("src/main/resources/icons/sneg.png");
			image = icon.getImage().getScaledInstance(200, 150,Image.SCALE_DEFAULT);
			icon = new ImageIcon(image);
			break;
		default:
			icon = new ImageIcon("src/main/resources/icons/sunce.png");
			image = icon.getImage().getScaledInstance(200, 150,Image.SCALE_DEFAULT);
			icon = new ImageIcon(image);
			break;
		}
		
		return icon;
		
	}
	
}
