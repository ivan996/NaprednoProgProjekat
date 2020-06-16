package rs.ac.bg.fon.ai.projekat.SO;

import java.awt.Image;

import javax.swing.ImageIcon;

public class SODodajSliku {

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
