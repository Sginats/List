package saraksts;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Gramata {
private int id, skaits, lppSk;
private String nosaukums, autors, izdevnieciba;
private LocalDate panemts, atgriezts;
private double cena;

public Gramata(int id, String nosaukums, String autors, String izdevnieciba, int lppSk, double cena, int skaits) {
    this.id = id;
    this.skaits = skaits;
    this.lppSk = lppSk;
    this.nosaukums = nosaukums;
    this.autors = autors;
    this.izdevnieciba = izdevnieciba;
    this.cena = cena;
  }

public String getNosaukums() {
    return nosaukums;
}
public void info() {
	JOptionPane.showMessageDialog(null, "ID: " + id + "\nNosaukums: " + nosaukums + "\nAutors: " + autors +
            "\nIzdevniecība: " + izdevnieciba + "\nLappušu skaits: " + lppSk + "\nCena: " + cena + " EUR");
}
public void panemtGramatu() {
	if (skaits > 0) {
		skaits--;
		panemts = LocalDate.now();
		atgriezts = panemts.plusMonths(1);
		JOptionPane.showMessageDialog(null,
				"Grāmata '" + nosaukums + "' ir veiksmīgi paņemta!\nAtgriešanas datums: " + atgriezts);
	} else {
		JOptionPane.showMessageDialog(null, "Diemžēl grāmata '" + nosaukums + "' nav pieejama pašlaik.", "Paziņojums",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
}
