package contr2.com;

public class LivreurCamion extends Livreur {

	private  double tauxMajortion;

	public LivreurCamion(String identifiant, String nom, double tarifKm, double tauxMajortion) {
		super(identifiant, nom, tarifKm);
		this.tauxMajortion = tauxMajortion;
	}

	@Override
	public double calculerFrais(double distance) {
		
		return tarifKm *distance * (1+ tauxMajortion) ;
	}
	
	
}
