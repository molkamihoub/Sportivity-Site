package enicarthage.tn.SportivitySite.Model;

import java.util.Objects;

public class Personne {
	private String nom;
	private String prenom;
	private String email;
	
	public Personne(String nom,String prenom,String email) {
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
	}

	public Personne() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, nom, prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return Objects.equals(email, other.email) && Objects.equals(nom, other.nom)
				&& Objects.equals(prenom, other.prenom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
