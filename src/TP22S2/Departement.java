package TP22S2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Departement  implements Comparable<Departement>{
	private int idDep;
	Set<employe> LEmployes;
	public Departement(int idDep) {
		this.idDep = idDep;
		this.LEmployes = new HashSet <>();
	}
	
	public void ajoutEmploye(employe E)
	{
	this.LEmployes.add(E);
	}
	
	public void retirerEmploye(employe E)
	{
	this.LEmployes.remove(E);
	}
		public void afficheDep(){
			System.out.println("Department ID : "+this.idDep);
			for (employe i : this.LEmployes) {
				System.out.println(i);
			}
		}
		
		public boolean existeE(int cin)
		{
			return this.LEmployes.contains(new employe(cin, null, 0,1));
			
	
		}
		//retourner l'employé qui a le plus grand salaire ds le département
		// pensez un utiliser un treeSet
		public employe getEmpSalMax()
		{
			TreeSet <employe> treeSet = new TreeSet <>(this.LEmployes) ;
			
			return treeSet.last();
		//à compléter
		}

		public int getIdDep() {
			return idDep;
		}

		public void setIdDep(int idDep) {
			this.idDep = idDep;
		}

		@Override
		public int compareTo(Departement o) {
			return this.LEmployes.size()-o.LEmployes.size();
			
		}
		
		
}
