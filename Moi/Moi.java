public class Moi {
    private static String name;
    private static String prenom;
    private static String university;
    static Moi me;

    private Moi (final String n,final String p, final String u) {
        name = n;
        prenom = p;
        university = u;
    }

    public static Moi methode(String n,String p,String u) {
        if (me == null ) {
            me = new Moi(n,p,u);
            return me;
        }
        else {
            System.out.println("Impossible de créer une autre ...");
            System.out.println(name);
            System.out.println(prenom);
            System.out.println("Qui étudie à  " + university);
            System.out.println("--------------------------------------------");
            return me;
        }

    }
    public static void Affiche () {
        System.out.println("Toi : ");
        System.out.println("Nom : " + name);
        System.out.println("Prénom : " + prenom);
        System.out.println("Qui étudie à : " + university);
    }
}

