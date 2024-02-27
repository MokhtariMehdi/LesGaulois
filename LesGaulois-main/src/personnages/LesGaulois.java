package personnages;

public class LesGaulois {
    private String nom;
    private int force;
    private int effetPotion = 1;

    public LesGaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "« " + texte + " »");
    }

    private String prendreParole() {
        return "Le gaulois " + nom + " : ";
    }

    public void frapper(Romain romain) {
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        romain.recevoirCoup(force / 3);
    }

    @Override
    public String toString() {
        return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
    }

    // Exemple de test pour la classe Gaulois
    public static void main(String[] args) {
        LesGaulois asterix = new LesGaulois("Astérix", 10);
        Romain brutus = new Romain("Brutus", 5);
        
        asterix.parler("Bonjour !");
        asterix.frapper(brutus);
    }
}

