package saraksts;

import java.util.LinkedList;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Biblioteka {
	static String virknesParbaude(String zinojums, String nokl) {
		String ievade;
		do {
			ievade = JOptionPane.showInputDialog(null,zinojums,nokl);
		}while(Pattern.matches("^[\\p{L} ]+$", ievade));
		return ievade;
	}
	static int skaitlaParbaude(String zinojums, int tips) {
		String ievade;
		int skaitlis;
		while(true) {
			ievade = JOptionPane.showInputDialog(null, zinojums, "Skaitļa ievade", JOptionPane.INFORMATION_MESSAGE);
			if (ievade == null)
				return -1;
			try {
				skaitlis = Integer.parseInt(ievade);
				if (tips == 1 && skaitlis <= 0) {
					JOptionPane.showMessageDialog(null, "Lūdzu, ievadi pozitīvu skaitli!", "Kļūda",
							JOptionPane.WARNING_MESSAGE);
					continue;
				}
				return skaitlis;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Ievadītā vērtība nav derīgs skaitlis!", "Kļūda",
						JOptionPane.ERROR_MESSAGE);
				continue;
			}
		}
	}
	public static void main(String[] args) {
		String nosaukums, autors, izdevnieciba, izvelne;
		int id = 1, skaits, lppSk, indekss;
		double cena;
		LinkedList<Gramata> plaukts = new LinkedList<>();
		String[] darbibas = { "Pievienot grāmatu", "Noņemt grāmatu", "Apskatīt grāmatu", "Iznomāt grāmatu", "Apturēt"};
		do {
			izvelne = (String)JOptionPane.showInputDialog(null, "Izvēlies darbību", "Darbību saraksts", JOptionPane.INFORMATION_MESSAGE, null, darbibas, darbibas[0]);
			
			if(izvelne == null);
				izvelne = "Apturēt";
            switch(izvelne) {
            case "Pievienot grāmatu":
            	nosaukums =
            	virknesParbaude("Ievadi grāmatas nosaukumu:", "Zaļā pasaka");
            	if(nosaukums == null)
            		break;
                autors =
                virknesParbaude("Ievadi grāmatas autoru:", "Andrējs Upīts");
                if(autors == null)
                	break;
                izdevnieciba =
                		virknesParbaude("Ievadi grāmatas izdevniecību:", "Zvaigzne ABC");
                if(izdevnieciba == null)
                	break;
                break;
            }
		}while(!izvelne.equals("Apturēt"));

	}

}
