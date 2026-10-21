package contr2.com;

public class Livraison {
 private double distance ;
 private Livreur livreur ;
 private  Commande commande ;
 public Livraison(double distance, Livreur livreur, Commande commande) {
	
	this.distance = distance;
	this.livreur = livreur;
	this.commande = commande;
 }
 public double  calculerMontant () {
	 return livreur.calculerFrais(distance);
	
}
 public void afficherRecapitulatif() {
        
        System.out.println(" livreur : " + livreur);
        System.out.println("commande :" + commande);
        livreur.afficherDetails();	     
        System.out.println("distance : " + distance + " km");
        System.out.println("Montant : " + calculerMontant() + " DH");
    }

 
}
