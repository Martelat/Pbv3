package org.proxibanquev3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public abstract class Dao<T> {
	
	protected Class<T> entityClass;
	protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3-pu");//injection
	protected EntityManager em = emf.createEntityManager();//injection
	EntityTransaction tx = this.em.getTransaction();

	/**
	 * @param object objet à enregistrer en base
	 */
	public T creer(T object) {

		
		tx.begin();

		// Création d'un enregistrement de formation dans la BDD
		this.em.persist(object);

		// Fermeture de la transaction, du gestionnaire d'entité et de sa fabrique
		tx.commit();
		return object;
	}

	/**
	 * @param primaryKey clé primaire de l'enregistrement en base que l'on veut lire
	 * @return objet en lecture
	 */
	public T select(Object primaryKey) {

		
		tx.begin();

		// Création d'un enregistrement de formation dans la BDD
		T returnedObject = (T) this.em.find(this.entityClass, primaryKey);

		tx.commit();
		
		return returnedObject;
	}

	/**
	 * @param object enregistrement en base que l'on souhaite modifier
	 * @return objet modifié
	 */
	public T modifier(T object) {

		
		tx.begin();

		// Création d'un enregistrement de formation dans la BDD
		T returnedObject = (T) this.em.merge(object);

		tx.commit();
		
		return returnedObject;
	}
	
	/**
	 * @param object enregistrement en base que l'on souhaite supprimer
	 */
	public void supprimer(T object) {

		
		tx.begin();

		// Suppression d'un enregistrement dans la BDD
		this.em.remove(object);

		tx.commit();
	}
}
