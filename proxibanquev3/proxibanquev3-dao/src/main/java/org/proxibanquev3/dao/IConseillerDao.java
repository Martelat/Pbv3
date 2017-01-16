package org.proxibanquev3.dao;


import java.util.Collection;

import org.proxibanquev3.domaine.Client;
import org.proxibanquev3.domaine.Conseiller;

public interface IConseillerDao extends IDao<Conseiller>{

	Conseiller select(Object primaryKey);

	Conseiller modifier(Conseiller object);

	void supprimer(Conseiller object);

	Conseiller creer(Conseiller object);
	
	Collection<Client> selectAll();
	
	Conseiller authentification(Conseiller conseiller);
	
	Conseiller SelectObject(Conseiller conseiller);
	
}
