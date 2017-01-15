package org.proxibanquev3.dao;

import org.proxibanquev3.domaine.Client;

public interface IClientDao extends IDao<Client>{

	Client select(Object primaryKey);

	Client modifier(Client object);

	void supprimer(Client object);

	Client creer(Client object);

}
