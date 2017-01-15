package org.proxibanquev3.dao;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.proxibanquev3.dao.ClientDao;
import org.proxibanquev3.domaine.Client;
import org.proxibanquev3.domaine.Compte;

/**
 * @author Marie Martelat & Marie Jacquin
 * Classe de test des méthodes CRUD de la classe CompteDao
 */
public class CompteDaoTest {

	ClientDao clientdaotest;
	Client clienttest;
	CompteDao comptedaotest;
	Compte comptetest, comptetest2;

	@Before
	public void avantChaqueTest() {
		clientdaotest = new ClientDao();
		comptedaotest = new CompteDao();
		clienttest = new Client();
		comptetest = new Compte();
		comptetest2= new Compte(1000.0, 5, "épargne", clienttest);
	}

	@Test
	public void testcreer1() {
		Compte resultat = comptedaotest.creer(comptetest);
		Assert.assertEquals(comptetest, resultat);
	}

	@Test
	public void testcreer2() {
		Compte resultat = comptedaotest.creer(comptetest);
		Assert.assertNotNull(resultat);
	}
	
	@Test
	public void testcreer3() {
		Compte resultat = comptedaotest.creer(comptetest);
		Assert.assertSame(comptetest, resultat);
	}
	
	@Test
	public void testcreer4() {
		clientdaotest.creer(clienttest);
		Compte resultat = comptedaotest.creer(comptetest2);
		//Assert.assertSame(resultat.getSolde(), 1000.0);
		Assert.assertEquals(resultat.getNumero(), 5);
		Assert.assertEquals(resultat.getType(), "épargne");
		Assert.assertEquals(resultat.getClient(), clienttest);
	}
	
	@Test
	public void testmodifier1() {
		Compte resultat = comptedaotest.modifier(comptetest);
		Assert.assertNotSame(resultat, comptetest);
	}
	
	@Test
	public void testmodifier2() {
		Compte resultat = comptedaotest.modifier(comptetest);
		Assert.assertNotNull(resultat);
	}
	

	@After
	public void ApresChaqueTest() {
		comptetest = null;
		comptedaotest = null;
	}
}
