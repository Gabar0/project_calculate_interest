

import java.util.Scanner;



public class ZinsenBerechnen {

	public static void main(String[] args) throws InterruptedException{
		EinAusgabe.schreibeBegruessung();

		Scanner tastatur  = new Scanner(System.in);
		tastatur.useDelimiter(System.lineSeparator());


		int anzahlJahre;
		double zinsen1Jahr;
		double zinsen5Jahre;
		double zinsen10Jahre;
		double verdoppelung;

		System.out.println("Geben Sie bitte einen Betrag in Euro ein");
		double betrag = tastatur.nextDouble();
		EinAusgabe.schreibeZweiLeerzeilen();
		System.out.println("Bitte geben Sie einen Zinssatz ein "+ " (Pro Prozent)");
		double zinssatz = tastatur.nextDouble();
		EinAusgabe.schreibeZweiLeerzeilen();

		zinsen1Jahr = Zinsrechnung.zinsen(betrag, zinssatz)	;

		System.out.print("Bitte warten, Berechnung laeuft ");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.println(".");

        EinAusgabe.schreibeZinsenEinJahr(zinsen1Jahr);

        anzahlJahre=5;
        zinsen5Jahre= Zinsrechnung.zinsen5(betrag, zinssatz, anzahlJahre);
		EinAusgabe.schreibeZinsen5Jahre(zinsen5Jahre);

		anzahlJahre=10;
		zinsen10Jahre= Zinsrechnung.zinsen10(betrag, zinssatz, anzahlJahre);
		EinAusgabe.schreibeZinsen10Jahre(zinsen10Jahre);

		verdoppelung= Zinsrechnung.verdoppelung(zinssatz);
		EinAusgabe.schreibVerdoppelung(verdoppelung);


     }

}
