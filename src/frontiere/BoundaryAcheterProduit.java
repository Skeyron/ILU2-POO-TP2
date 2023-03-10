package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}
	
	public void afficherVendeurs(String[] vendeurs) {
		for (int i = 0; i < vendeurs.length; i++) {
			System.out.println(i+1 +"-" + vendeurs[i]);
		}
	}
	
	public void acheterProduit(String nomAcheteur) {
		if (!controlAcheterProduit.verifIdentite(nomAcheteur)) {
			System.out.println("Désolé, seuls les habitants du village peuvent acheter !");
		}
		System.out.println("Que voulez-vous acheter ? \n");
		String produit = scan.nextLine();
		String[] vendeurs =controlAcheterProduit.Vendeurs(produit);
		afficherVendeurs(vendeurs);
		
		
	}
}
