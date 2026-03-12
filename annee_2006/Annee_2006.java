public class Annee_2006 {
    private static String mois;
    static Annee_2006 res;

    private Annee_2006 (final String m) {
        mois = m;
    }

    public static Annee_2006 methode(String m) {
        if (res == null ) {
            res = new Annee_2006 (m);
            return res;
        }
        else {
            System.out.println("Il n'y a qu'un seul mois " + mois + " 2006");
            return res;
        }

    }
    public static void AfficheMois () {
        System.out.println("Date : " + mois + " 2006");
    }
}

