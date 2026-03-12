public class Univers {
    private static String nom_univ;
    static Univers A;

    private Univers (final String p) {
        nom_univ = p;
    }

    public static Univers methode(String r) {
        if (A == null ) {
            A = new Univers (r);
            return A;
        }
        else {
            System.out.println("Univers déjà crée");
            return A;
        }

    }
    public static void Affiche () {
        System.out.println("Univers " + nom_univ);
    }
}

