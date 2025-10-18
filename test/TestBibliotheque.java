package test;

import entities.Bibliotheque;
import entities.Document;
import java.util.Scanner;

public class TestBibliotheque {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrez le nombre maximum de documents : ");
		int n = sc.nextInt();
		sc.nextLine(); // consommer le retour à la ligne

		Bibliotheque biblio = new Bibliotheque(n);

		// Initialisation avec deux documents
		biblio.ajouter(new Document("Le Petit Prince", "Antoine de Saint-Exupéry"));
		biblio.ajouter(new Document("1984", "George Orwell"));

		int choix;
		do {
			System.out.println("\nMenu :");
			System.out.println("1 - Ajouter un document");
			System.out.println("2 - Afficher tous les documents");
			System.out.println("3 - Supprimer un document");
			System.out.println("4 - Chercher un document par numéro");
			System.out.println("5 - Afficher tous les auteurs");
			System.out.println("0 - Quitter");
			System.out.print("Votre choix : ");
			choix = sc.nextInt();
			sc.nextLine(); // consommer le retour à la ligne

			switch (choix) {
			case 1:
				System.out.print("Titre : ");
				String titre = sc.nextLine();
				System.out.print("Auteur : ");
				String auteur = sc.nextLine();
				if (biblio.ajouter(new Document(titre, auteur))) {
					System.out.println("Document ajouté avec succès !");
				} else {
					System.out.println("La bibliothèque est pleine !");
				}
				break;
			case 2:
				biblio.afficherDocuments();
				break;
			case 3:
				System.out.print("Numéro d'enregistrement à supprimer : ");
				int numSuppr = sc.nextInt();
				Document docASuppr = biblio.document(numSuppr);
				if (docASuppr != null && biblio.supprimer(docASuppr)) {
					System.out.println("Document supprimé !");
				} else {
					System.out.println("Document introuvable !");
				}
				break;
			case 4:
				System.out.print("Numéro d'enregistrement à chercher : ");
				int numCherche = sc.nextInt();
				Document doc = biblio.document(numCherche);
				if (doc != null) {
					System.out.println(doc);
				} else {
					System.out.println("Document introuvable !");
				}
				break;
			case 5:
				biblio.afficherAuteurs();
				break;
			case 0:
				System.out.println("Au revoir !");
				break;
			default:
				System.out.println("Choix invalide !");
			}
		} while (choix != 0);

		sc.close();
	}
}
