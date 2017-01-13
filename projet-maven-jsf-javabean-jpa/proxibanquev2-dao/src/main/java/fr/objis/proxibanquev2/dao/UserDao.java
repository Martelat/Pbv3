package fr.objis.proxibanquev2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.objis.proxibanquev2.domaine.User;

public class UserDao {
	

	public void create(User user) {

		// 1. Ouverture unité de travail JPA

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();

		// 2. Ouverture de la transaction

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// 3. Persitence Objet/Relationnel : création d'un enregistrement en
		// base

		em.persist(user);

		// 4. Fermeture de la transaction

		tx.commit();

		// 5. Fermeture unité de travail JPA

		em.close();
		emf.close();
	}




}
