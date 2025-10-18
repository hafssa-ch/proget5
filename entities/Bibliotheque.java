package entities;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
	private Document[] documents;
	private int nbDocuments;

	public Bibliotheque(int capacite) {
		documents = new Document[capacite];
		nbDocuments = 0;
	}

	public boolean ajouter(Document doc) {
		if (nbDocuments < documents.length) {
			documents[nbDocuments++] = doc;
			return true;
		}
		return false;
	}

	public boolean supprimer(Document doc) {
		for (int i = 0; i < nbDocuments; i++) {
			if (documents[i].getNumEnreg() == doc.getNumEnreg()) {
				// Décalage des éléments
				for (int j = i; j < nbDocuments - 1; j++) {
					documents[j] = documents[j + 1];
				}
				documents[--nbDocuments] = null;
				return true;
			}
		}
		return false;
	}

	public Document document(int numEnreg) {
		for (int i = 0; i < nbDocuments; i++) {
			if (documents[i].getNumEnreg() == numEnreg) {
				return documents[i];
			}
		}
		return null;
	}

	public void afficherDocuments() {
		if (nbDocuments == 0) {
			System.out.println("La bibliothèque est vide.");
		} else {
			for (int i = 0; i < nbDocuments; i++) {
				System.out.println(documents[i]);
			}
		}
	}

	public void afficherAuteurs() {
		List<String> auteurs = new ArrayList<>();
		for (int i = 0; i < nbDocuments; i++) {
			if (documents[i].getAuteur() != null && !auteurs.contains(documents[i].getAuteur())) {
				auteurs.add(documents[i].getAuteur());
			}
		}
		if (auteurs.isEmpty()) {
			System.out.println("Aucun auteur enregistré.");
		} else {
			System.out.println("Auteurs : " + String.join(", ", auteurs));
		}
	}
}
