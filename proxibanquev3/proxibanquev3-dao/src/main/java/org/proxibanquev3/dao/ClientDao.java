package org.proxibanquev3.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.proxibanquev3.domaine.Client;

/**
 * @author Marie Martelat & Marie Jacquin
 * Classe permettant la persistence des objets de type Client
 */
public class ClientDao extends Dao<Client>  implements IClientDao{
	
	/**
	 * @param em entity manager
	 */
	public ClientDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	public ClientDao() {
		super();
	}

	@Override
	public Client creer(Client client) {
		super.creer(client);
		return client;
	}
	
	@Override
	public Client select(Object primaryKey) {
		return super.select(primaryKey);
	}
	
	@Override
	public Client modifier(Client client) {
		return super.modifier(client);
	}
	
	@Override
	public void supprimer(Client client) {
		super.supprimer(client);
	}
	
	@PostConstruct
	public void logApresConstruction(){
		System.out.println("Après création ClientDao");
	}
}
