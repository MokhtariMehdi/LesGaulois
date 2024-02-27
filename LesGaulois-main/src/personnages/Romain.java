package personnages;

class Romain {
    private String nom;
    private int force;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void recevoirCoup(int forceCoup) {
        System.out.println(nom + " a reçu un coup de force " + forceCoup);
        // Logique pour gérer la réduction de force ou la défaite du Romain
    }
}