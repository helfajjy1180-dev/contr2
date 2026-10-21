package contr2.com;

public class Commande {
private String numero ;
private String distance ;
public Commande(String numero, String distance) {
	super();
	this.numero = numero;
	this.distance = distance;
}
@Override
public String toString() {
	return "Commande [numero=" + numero + ", distance=" + distance + "]";
}


}
