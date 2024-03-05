package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;

	public Village(String nom, int i) {
		this.nom = nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public Gaulois[] getVillageois() {
		return villageois;
	}

	public void setVillageois(Gaulois[] villageois) {
		this.villageois = villageois;
	}

	public int getNbVillageois() {
		return nbVillageois;
	}

	public void setNbVillageois(int nbVillageois) {
		this.nbVillageois = nbVillageois;
	}

	public int getNbVillageoisMaximum() {
		return nbVillageoisMaximum;
	}

	public void setNbVillageoisMaximum(int nbVillageoisMaximum) {
		this.nbVillageoisMaximum = nbVillageoisMaximum;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois+=1;
	}
	
	public Gaulois trouverHabitant(int nbVillageois) {
		return villageois[nbVillageois];
	}
	
	public static void main(String[] args) {
	        Village village = new Village("Village des Irréductibles", 30);
	        village.ajouterHabitant(new Gaulois("Abraracourcix", 6));
	        village.ajouterHabitant(new Gaulois("Astérix", 8));
	        Gaulois gaulois = village.trouverHabitant(1);
	        if (gaulois != null) {
	            System.out.println(gaulois);
	        } else {
	            System.out.println("Habitant non trouvé ou index invalide.");
	        }
	        Gaulois gauloisHorsLimites = village.trouverHabitant(30); // Utilisation d'un index hors limites sans provoquer d'exception
	        if (gauloisHorsLimites != null) {
	            System.out.println(gauloisHorsLimites);
	        } else {
	            System.out.println("Habitant non trouvé ou index invalide.");
	        }
}
}
