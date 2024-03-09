package TP22S2;

import java.util.HashMap;

import java.util.Set;
import java.util.TreeMap;

public class Entreprise {
private String nomEntreprise;
HashMap<Integer, Departement> Liste_Deps;


public Entreprise(String nomEntreprise) {
	this.nomEntreprise = nomEntreprise;
	Liste_Deps = new HashMap<>();
}

public void ajoutDep(Departement d)
{
	this.Liste_Deps.put(d.getIdDep(),d);
}

public void retirerDep(Departement d)
{
	this.Liste_Deps.remove(d.getIdDep());
	}
	

public void afficheE()
{
	System.out.println("Le nom de l'entreprise est : "+this.nomEntreprise);
	Set<Integer> s = this.Liste_Deps.keySet();
	for (int i : s) {
	
		this.Liste_Deps.get(i).afficheDep();
		System.out.println("---------------");
	}
	}

public void UpdateDep(employe E, int idDep){
	Set<Integer> s = this.Liste_Deps.keySet();
	for (int i : s) {
		if (this.Liste_Deps.get(i).existeE(E.getCin())) {
			this.Liste_Deps.get(i).retirerEmploye(E);
			
			break;
		}
	}
	this.Liste_Deps.get(idDep).ajoutEmploye(E);
	}



	public boolean existeD(Departement d)
	{
		return this.Liste_Deps.containsValue(d);
	}
	
	
	public void DepMinCapacity()
	{
		TreeMap<Integer, Departement> treeMap = new TreeMap <>(this.Liste_Deps);
		
		treeMap.lastEntry().getValue().afficheDep();
		
	}
}