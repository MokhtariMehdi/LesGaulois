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
        System.out.println(nom + " a re�u un coup de force " + forceCoup);
        // Logique pour g�rer la r�duction de force ou la d�faite du Romain
    }
}