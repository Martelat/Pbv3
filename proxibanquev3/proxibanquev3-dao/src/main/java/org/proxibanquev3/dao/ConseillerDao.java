package org.proxibanquev3.dao;


import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
	
	public ConseillerDao() {
		super();
		
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
	public Collection<Client> selectAll() {
		// TODO Auto-generated method stub
		return (Collection<Client>)em.createQuery("Select * from Client").getResultList();//
	}

	@Override
	public Conseiller authentification(Conseiller conseiller) {
		Conseiller pConseiller = select(conseiller);
		return pConseiller;
		
	}

	@Override
	public Conseiller selectObject(Conseiller conseiller) {
		
		return super.selectObject(conseiller);
	}

	@Override
	public Conseiller SelectObject(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}