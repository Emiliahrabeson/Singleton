public class Planete_terre {
    private static String nom_planete;
    static Planete_terre Terre;

    private Planete_terre (final String terre) {
        nom_planete = terre;
    }

    public static Planete_terre methode(String t) {
        if (Terre == null ) {
            Terre = new Planete_terre(t);
            return Terre;
        }
        else {
            System.out.println("Impossible de creer la planète terre 2 fois");
            return Terre;
        }

    }
    public static void Affiche () {
        System.out.println("Planete : " + nom_planete);
    }
}

