package village_gaulois;

import Personnes.Gaulois;

public class village {

	private String nom;
	private Gaulois chef;
	private Gaulois[] villageois;
	private int nbVillageois;

	public village(String nom, Gaulois chef, Gaulois[] villageois) {
		super();
		this.nom = nom;
		this.chef = chef;
		this.villageois = villageois;
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			gaulois.setVillage(this);
		}
	}

	public Gaulois trouverVillageois(int numVillageois) {
		int indice = numVillageois - 1;
		if (indice >= 0 && indice < nbVillageois) {
			return villageois[indice];
		} else {
			System.out.println(" Il n y a pas autant d'habitants dans notre village ");
			return null;
		}
	}

	public void afficherVillageois() {
		System.out.println(
				"Dans le village \"" + nom + "\" du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		System.out.println("- " + chef.getNom());
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
}
