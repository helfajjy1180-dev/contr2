package contr2.com;


public abstract class Livreur {
	protected String identifiant ;
	protected String nom ;
	protected double  tarifKm ;
	private Livreur responsable;
	public Livreur(String identifiant, String nom, double tarifKm) {
		
		this.identifiant = identifiant;
		this.nom = nom;
		this.tarifKm = tarifKm;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public String getNom() {
		return nom;
	}

	public abstract double calculerFrais( double distance );
	 public void afficherDetails() {
	        System.out.println("identifiant : " + identifiant);
	        System.out.println("Nom : " + nom);
	        System.out.println("tarifkm : " + tarifKm);
	    }

	    public void setResponsable(Livreur responsable) {
	        if (responsable == this) {
	        	 System.out.println(
	                "Un livreure ne peut pas etre un respnsable."
	            );
	        }
	        this.responsable = responsable;
	    }

	    public Livreur getResponsable() {
	        return responsable;
	    }
}

