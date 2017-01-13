package org.proxibanquev3.dao;

import java.util.ArrayList;

import org.proxibanquev3.domaine.Client;
import org.proxibanquev3.domaine.Conseiller;

public interface IConseillerDao extends IDao<Conseiller>{

	Conseiller select(Object primaryKey);

	Conseiller modifier(Conseiller object);

	void supprimer(Conseiller object);

	void creer(Conseiller object);
	
	ArrayList<Client> selectAll();
	
}
