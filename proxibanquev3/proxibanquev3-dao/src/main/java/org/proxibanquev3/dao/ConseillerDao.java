package org.proxibanquev3.dao;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.proxibanquev3.domaine.Client;
import org.proxibanquev3.domaine.Conseiller;

/**
 * @author Marie Martelat & Marie Jacquin
 * Classe permettant la persistence des objets de type Conseiller
 */
public class ConseillerDao extends Dao<Conseiller> implements IConseillerDao{
	
	/**
	 * @param em entity manager
	 */
	public ConseillerDao(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void creer(Conseiller conseiller) {
		super.creer(conseiller);
	}
	
	@Override
	public Conseiller select(Object primaryKey) {
		return super.select(primaryKey);
	}
	
	@Override
	public Conseiller modifier(Conseiller conseiller) {
		return super.modifier(conseiller);
	}
	
	@Override
	public void supprimer(Conseiller conseiller) {
		super.supprimer(conseiller);
	}
	
	@PostConstruct
	public void logApresConstruction(){
		System.out.println("Après création ConseillerDao");
	}

	@Override
	public ArrayList<Client> selectAll() {
		// TODO Auto-generated method stub
		return (ArrayList<Client>)em.createQuery("From Client").getResultList();//
	}
}