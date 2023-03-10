package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}
	
	public boolean verifIdentite(String nom) {
		return controlVerifierIdentite.verifierIdentite(nom);
	}
	
	
	public String[] Vendeurs(String produit) {
		Gaulois[] tab = village.rechercherVendeursProduit(produit);
		String[] vendeurs = new String[tab.length];
		for (int i = 0; i < vendeurs.length; i++) {
			vendeurs[i] = tab[i].getNom();
		}
		return vendeurs;
	}
	
	

	//TODO a completer
}
