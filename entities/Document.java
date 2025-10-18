package entities;

public class Document {
	private static int compteur = 0; // auto-incrément pour numEnreg
	private int numEnreg;
	private String titre;
	private String auteur;

	public Document(String titre, String auteur) {
		compteur++;
		this.numEnreg = compteur;
		this.titre = titre;
		this.auteur = auteur;
	}

	public int getNumEnreg() {
		return numEnreg;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Document [numEnreg=" + numEnreg + ", titre=" + titre + ", auteur=" + auteur + "]";
	}
}
