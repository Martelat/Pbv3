package org.proxibanquev3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.proxibanquev3.domaine.Client;
import org.proxibanquev3.domaine.Conseiller;

public class LancementBD {

	public static void main(String[] args) {
		// 1 : Ouverture unité de travail JPA
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxibanquev3-pu");
				EntityManager em = emf.createEntityManager();
				
				// 2 : Ouverture transaction 
				EntityTransaction tx =  em.getTransaction();
				tx.begin();
				
				// 3 : Instanciation Objet métier
				Conseiller conseiller = new Conseiller("Dujardin", "Jean", "jean01", "acteur");
				Client client1 = new Client("Jacq","Marie", "Jack.m@gmail.com", "aller du geek", conseiller);
				Client client2 = new Client ("Marto", "Marie", "Marto.m@gmail.com", "allée des alpes", conseiller);
				

				// 4 : Persistance Objet/Relationnel : création d'un enregistrement en base
				em.persist(conseiller);
				em.persist(client2);
				em.persist(client1);
				
				// 5 : Fermeture transaction 
				 tx.commit();
				
				// 6 : Fermeture unité de travail JPA 
				em.close();
				emf.close();	
			}
		

	}
