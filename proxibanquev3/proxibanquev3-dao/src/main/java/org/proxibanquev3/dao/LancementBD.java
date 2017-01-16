package org.proxibanquev3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.proxibanquev3.domaine.Client;
import org.proxibanquev3.domaine.Conseiller;
import org.proxibanquev3.dao.ConseillerDao;

public class LancementBD {

	public static void main(String[] args) {
		// 1 : Ouverture unité de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3-pu");
		EntityManager em = emf.createEntityManager();

		// 2 : Ouverture transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		// 3 : Instanciation Objet métier
		ConseillerDao conseillerdao = new ConseillerDao();
		ClientDao clientdao = new ClientDao();
		Conseiller conseiller = new Conseiller("jean01", "acteur");
		Client client1 = new Client("Jack", "Marie", "j.mgmail.com", "rue du pont", conseiller);

		// 4 : Persistance Objet/Relationnel : création d'un enregistrement en
		// base

		conseillerdao.creer(conseiller);
		clientdao.creer(client1);

		// 5 : Fermeture transaction
		tx.commit();

		// 6 : Fermeture unité de travail JPA
		em.close();
		emf.close();
	}

}
