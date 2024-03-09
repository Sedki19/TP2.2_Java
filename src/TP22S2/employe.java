package TP22S2;

import java.util.Objects;

public class employe implements Comparable<employe> {
	private int cin ;
	private String nom;
	private double salaire ;
	private int department;
	
	
	public employe(int cin, String nom, double salaire , int department) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
	}
	
	
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}


	@Override
	public String toString() {
		return "employe [cin=" + cin + ", nom=" + nom + ", salaire=" + salaire + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cin);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employe other = (employe) obj;
		return cin == other.cin;
	}



	@Override
	public int compareTo(employe o) {
		return (int) (this.salaire - o.getSalaire());
	}


	public int getDepartment() {
		return department;
	}


	public void setDepartment(int department) {
		this.department = department;
	}


	
	
	
	
	
	
}
