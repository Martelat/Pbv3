package org.proxibanquev3.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.proxibanquev3.domaine.Compte;

/**
 * @author Marie Martelat & Marie Jacquin
 * Classe permettant la persistence des objets de type Compte
 */
public class CompteDao extends Dao<Compte> implements ICompteDao{
	
	/**
	 * @param em entity manager
	 */
	public CompteDao(EntityManager em) {
		super();
		this.em = em;
	}

	public CompteDao() {
		super();
	}
	
	@Override
	public Compte creer(Compte compte) {
		super.creer(compte);
		return compte;
	}
	
	@Override
	public Compte select(Object primaryKey) {
		return super.select(primaryKey);
	}
	
	@Override
	public Compte modifier(Compte compte) {
		return super.modifier(compte);
	}
	
	@Override
	public void supprimer(Compte compte) {
		super.supprimer(compte);
	}
	
	@PostConstruct
	public void logApresConstruction(){
		System.out.println("Après création CompteDao");
	}
}
