

public class Zinsrechnung {

	double betrag;
	double zinssatz;
	int anzahlJahre;

	public static double zinsen(double betrag, double zinssatz) {
		double zinsenFurEinJahr= (betrag*zinssatz/100);
		return Math.ceil(zinsenFurEinJahr);
	}

	public static double zinsen5(double betrag, double zinssatz, int anzahlJahre) {

		double BetragNach5Jahren= (betrag*Math.pow(1+zinssatz/100,anzahlJahre));
		double ZinsenNach5Jahren= BetragNach5Jahren - betrag;
		return Math.ceil(ZinsenNach5Jahren);

	}

	public static double zinsen10(double betrag, double zinssatz, int anzahlJahre) {

			double BetragNach10Jahren= (betrag*Math.pow(1+zinssatz/100,anzahlJahre));
			double ZinsenNach10Jahren= BetragNach10Jahren - betrag;
			return Math.ceil(ZinsenNach10Jahren);
	}

	public static double verdoppelung(double zinssatz) {
		double kapital= (Math.log(2)/Math.log(1+zinssatz/100));
		return Math.ceil(kapital);
	}

}



