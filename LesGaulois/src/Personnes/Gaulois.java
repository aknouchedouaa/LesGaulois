package Personnes;
import village_gaulois.village;
public class Gaulois {
	private String nom;
    private int force;
    private int effetPotion = 1;
    private village village;
    public Gaulois(String nom, int force) {
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
        return "Le Gaulois " + nom + " : ";
    }

    @Override
    public String toString() {
        return nom;
    }

    public void frapper(Romain romain) {
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        romain.recevoirCoup((force * effetPotion) / 3);
        if (effetPotion > 1) {
            effetPotion--;
        }
    }

    public void boirePotion(int forcePotion) {
        this.effetPotion = forcePotion;
    }

    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        System.out.println(asterix);
    }
    
    public void setVillage(village village) {
        this.village = village;
    }
    
    public void sePresenter() {
        String chaine = "Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". ";
        if (village != null) {
            if (this == village.getChef()) {
                chaine += "Je suis le chef du village " + village.getNom() + ".";
            } else {
                chaine += "J'habite le village " + village.getNom() + ".";
            }
        } else {
            chaine += "Je voyage de villages en villages.";
        }
        chaine += "\"";
        System.out.println(chaine);
}}