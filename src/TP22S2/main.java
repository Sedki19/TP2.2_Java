package TP22S2;

public class main {

	public static void main(String[] args) {
		Departement d = new Departement (1);
		
		d.ajoutEmploye(new employe(1,"ahmed",530.2,1));
		employe e = new employe(2,"mohamed",630.2,2);
		d.ajoutEmploye(e);
		d.ajoutEmploye(new employe(3,"samir",430,1));
		d.ajoutEmploye(new employe(3,"test",0,1));
		d.ajoutEmploye(new employe(4,"mortadha",3530.2,1));
		
		
		d.retirerEmploye(e);
		/*
		System.out.println(d.existeE(1));
		
		
		
		d.afficheDep();
		
		System.out.println("Employer a max salaire : "+d.getEmpSalMax());
		
		*/
		
		Departement d2 = new Departement (2);
		
		d2.ajoutEmploye(e);
		d2.ajoutEmploye(new employe(7,"hamadi",1200,2));
		d2.ajoutEmploye(new employe(10,"alex",1230,2));
		
		
		
		Departement d3 = new Departement (3);
		
		d3.ajoutEmploye(new employe(8,"nawfel",800,3));
		
		
		
		
		
		Entreprise E = new Entreprise ("S Entreprise");
		
		E.ajoutDep(d);
		E.ajoutDep(d2);
		E.ajoutDep(d3);
		
		E.afficheE();
		
		E.UpdateDep(e, 1);
		
		System.out.println("-----------------------------------------------");
		
		E.afficheE();
		
		System.out.println(E.existeD(d2)+"-"+E.existeD(new Departement(45)));
		
		E.DepMinCapacity();
		
		
	}

}
