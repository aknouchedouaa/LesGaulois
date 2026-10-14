package Personnes;

public class Romain {
	private String nom;
    private int force;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le Romain " + nom + " : ";
    }

    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force < 1) {
            force = 0;
            parler("J'abandonne !");
        } else {
            parler("Aïe");
        }
    }
    
    private boolean isInvariantVerified() {
        return this.force >= 0;
    }
    
    private Equipement[] equipements = new Equipement[2];
    private int nbEquipement = 0;

    private void ajouterEquipement(Equipement equipement, int index) {
        equipements[index] = equipement;
        nbEquipement++;
        System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
    }

    public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
        case 2:
            System.out.println("Le soldat " + nom + " est déjà bien protégé !");
            break;
        case 1:
            if (equipements[0] == equipement) {
                System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
            } else {
                ajouterEquipement(equipement, 1);
            }
            break;
        default:
            ajouterEquipement(equipement, 0);
            break;
        }
    }
}
