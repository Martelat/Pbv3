package org.proxibanquev3.dao;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.proxibanquev3.dao.ClientDao;
import org.proxibanquev3.domaine.Client;
import org.proxibanquev3.domaine.Conseiller;

/**
 * @author Marie Martelat & Marie Jacquin
 * Classe de test des methodes CRUD de la classe ClientDao
 */
public class ClientDaoTest {

	//Déclaration des objets nécessaires à la phase de test
	ClientDao clientdaotest;
	ConseillerDao conseillerdaotest;
	Conseiller conseillertest;
	Client clienttest, clienttest2;

	//Instanciation des objets avant chaque test
	@Before
	public void avantChaqueTest() {
		clientdaotest = new ClientDao();
		conseillerdaotest = new ConseillerDao();
		conseillertest = new Conseiller();
		clienttest = new Client();
		clienttest2 = new Client("nomtest", "prenomtest", "emailtest", "adressetest", conseillertest);
	}

	/**
	 * Méthode testcreer1()
	 * teste que le client créé par la méthode est bien celui entré en paramètre
	 */
	@Test
	public void testcreer1() {
		Client resultat = clientdaotest.creer(clienttest);
		Assert.assertEquals(clienttest, resultat);
	}

	/**
	 * Méthode testcreer2()
	 * teste que la méthode creer() ne retourne pas un null
	 */
	@Test
	public void testcreer2() {
		Client resultat = clientdaotest.creer(clienttest);
		Assert.assertNotNull(resultat);
	}
	
	/**
	 * Méthode testcreer3()
	 * teste que l'objet entré en paramètre de creer() et l'objet retourné par creer() sont les mêmes
	 */
	@Test
	public void testcreer3() {
		Client resultat = clientdaotest.creer(clienttest);
		Assert.assertSame(resultat, clienttest);
	}
	
	/**
	 * Méthode testcreer4()
	 * teste que les propriétés de l'objet entré en paramètre de creer() sont les mêmes que celles de l'objet retourné par creer()
	 */
	@Test
	public void testcreer4() {
		conseillerdaotest.creer(conseillertest);
		Client resultat = clientdaotest.creer(clienttest2);
		Assert.assertEquals(resultat.getNom(), "nomtest");
		Assert.assertEquals(resultat.getPrenom(), "prenomtest");
		Assert.assertEquals(resultat.getEmail(), "emailtest");
		Assert.assertEquals(resultat.getAdresse(), "adressetest");
		Assert.assertEquals(resultat.getConseiller(), conseillertest);
	}
	
	/**
	 * Méthode testmodifier1()
	 * teste que l'objet à modifier et l'objet modifié ne sont pas les mêmes
	 */
	@Test
	public void testmodifier1() {
		Client resultat = clientdaotest.modifier(clienttest);
		Assert.assertNotSame(resultat, clienttest);
	}
	
	/**
	 * Méthode testmodifier2()
	 * teste que l'objet retourné par la méthode modifier() n'est pas un null
	 */
	@Test
	public void testmodifier2() {
		Client resultat = clientdaotest.modifier(clienttest);
		Assert.assertNotNull(resultat);
	}
	
	//Suppression des objets après chaque test
	@After
	public void ApresChaqueTest() {
		clientdaotest = null;
		conseillerdaotest = null;
		conseillertest = null;
		clienttest = null;
		clienttest2 = null;
	}

}
