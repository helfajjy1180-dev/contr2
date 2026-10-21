
package contr2.com;

public class Main {

    public static void main(String[] args) {

        
        LivreurMoto m1 = new LivreurMoto("2632", "alami", 10, 4);
        LivreurMoto m2 = new LivreurMoto("3562", "moumne", 8, 2);

        LivreurCamion c1 = new LivreurCamion("536", "anam", 15, 0.20);
        LivreurCamion c2 = new LivreurCamion("234-B", "denyl", 20, 0.10);

        Livreur[] livreur = {m1, m2, c1, c2};

      
        Commande C1 = new Commande("C1", "30 km");
        Commande C2 = new Commande("C2", "40 km");

        
        System.out.println("LISTE DES LIVREURS");

        for (int i = 0; i < livreur.length; i++) {
            System.out.println("\nLivreur " + (i + 1));
            livreur[i].afficherDetails();

            if (livreur[i].getResponsable() != null) {
                System.out.println(
                    "Responsable : "
                    + livreur[i].getResponsable().getNom()
                );
            } else {
                System.out.println("Responsable : Aucun");
            }
        }

      
        Livraison[] livraison = {
            new Livraison(30, m1, C1),
            new Livraison(20, m2, C1),
            new Livraison(40, c1, C2),
            new Livraison(50, c2, C2)
        };

       
        double montantTotal = 0;

        System.out.println("\nLISTE DES LIVRAISONS");

        for (int i = 0; i < livraison.length; i++) {
            livraison[i].afficherRecapitulatif();
            montantTotal += livraison[i].calculerMontant();
        }

        System.out.printf(
            "\nMontant total des livraisons : %.2f DH%n",
            montantTotal
        );

     
        int nombreSupervises = 0;

        for (int i = 0; i < livreur.length; i++) {
            if (livreur[i].getResponsable() == m1) {
                nombreSupervises++;
            }
        }

        System.out.println(
            "Nombre de livreurs directement supervisés par "
            + m1.getNom() + " : " + nombreSupervises
        );
    }
}
