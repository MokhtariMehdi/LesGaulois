package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "  " + texte + " "); //void car pas de return
		
	}

	private String prendreParole() { 
		return "Le gaulois " + nom + " : ";
	}


	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m choire de "
		+ romain.getNom());
		romain.recevoirCoup((force / 3) * effetPotion);
	}

	

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPo tion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion){
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
	}
	
	
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("asterix",8);
		System.out.println(asterix);
		
		asterix.parler(" bonjour ");
		asterix.prendreParole();
		
		Romain felix = new Romain("felix", 4);
		asterix.frapper(felix );
		
		asterix.boirePotion(2);
		asterix.frapper(felix );
		
	}

	
}