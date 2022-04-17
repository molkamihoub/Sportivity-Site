package enicarthage.tn.SportivitySite.Model;

import java.util.Objects;

public class Admin extends Personne {
	private String role;

	public Admin(String nom,String prenom,String email) {
		// TODO Auto-generated constructor stub
		super(nom,prenom,email);
		role="Admin";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(role);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(role, other.role);
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
