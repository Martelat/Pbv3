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

	ClientDao clientdaotest;
	ConseillerDao conseillerdaotest;
	Conseiller conseillertest;
	Client clienttest, clienttest2;

	@Before
	public void avantChaqueTest() {
		clientdaotest = new ClientDao();
		conseillerdaotest = new ConseillerDao();
		conseillertest = new Conseiller();
		clienttest = new Client();
		clienttest2 = new Client("nomtest", "prenomtest", "emailtest", "adressetest", conseillertest);
	}

	@Test
	public void testcreer1() {
		Client resultat = clientdaotest.creer(clienttest);
		Assert.assertEquals(clienttest, resultat);
	}

	@Test
	public void testcreer2() {
		Client resultat = clientdaotest.creer(clienttest);
		Assert.assertNotNull(resultat);
	}
	
	@Test
	public void testcreer3() {
		Client resultat = clientdaotest.creer(clienttest);
		Assert.assertSame(resultat, clienttest);
	}
	
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
	
	@Test
	public void testmodifier1() {
		Client resultat = clientdaotest.modifier(clienttest);
		Assert.assertNotSame(resultat, clienttest);
	}
	
	@Test
	public void testmodifier2() {
		Client resultat = clientdaotest.modifier(clienttest);
		Assert.assertNotNull(resultat);
	}
	
	@After
	public void ApresChaqueTest() {
		clienttest = null;
		clientdaotest = null;
	}

}
