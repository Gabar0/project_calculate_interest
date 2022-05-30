
public class EinAusgabe {


	public static void schreibeZweiLeerzeilen() {
        System.out.println();
        System.out.println();
    }


    public static void schreibeLinie() {
        System.out
                .println("--------------------------------------------------");
    }

    public static void schreibeBegruessung() {
        String name = System.getProperty("user.name");
        System.out.println("Hallo liebe/r " + name);
    }



    public static void schreibeZinsenEinJahr(double z) {
        EinAusgabe.schreibeLinie();
        System.out.println ("Zinsen nach 1 Jahr : " + z + " €");
        EinAusgabe.schreibeLinie();
    }

    public static void schreibeZinsen5Jahre(double z) {
        EinAusgabe.schreibeLinie();
        System.out.println ("Zinsen nach 5 Jahren : " + z + " €");
        EinAusgabe.schreibeLinie();
    }

    public static void schreibeZinsen10Jahre(double z) {
        EinAusgabe.schreibeLinie();
        System.out.println ("Zinsen nach 10 Jahren : " + z + " €");
        EinAusgabe.schreibeLinie();
    }

    public static void schreibVerdoppelung(double z) {
        EinAusgabe.schreibeLinie();
        System.out.println (" Anzahl der erforderliche Jahren bis sich das angelegte Kapital beim angegebenen Zinssatz verdoppelt: " + z + " Jahre ");
        EinAusgabe.schreibeLinie();
    }
}
