package org.proxibanquev3.dao;

import org.proxibanquev3.domaine.Compte;

public interface ICompteDao extends IDao<Compte>{

	Compte select(Object primaryKey);

	Compte modifier(Compte object);

	void supprimer(Compte object);

	Compte creer(Compte object);
	
}
