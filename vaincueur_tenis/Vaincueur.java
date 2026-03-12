public class Vaincueur {
    private static String nom;
    static Vaincueur A;

    private Vaincueur (final String n) {
        nom = n;
    }

    public static Vaincueur methode(String n) {
        if (A == null ) {
            A = new Vaincueur(n);
            return A;
        }
        else {
            return A;
        }

    }
    public static void Affiche () {
        System.out.println("Le vaincueur du tenis est : " + nom);
    }
}

