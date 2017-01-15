package org.proxibanquev3.dao;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.proxibanquev3.dao.ClientDao;
import org.proxibanquev3.domaine.Client;

public class ClientDaoTest {

	ClientDao clientdaotest;
	Client clienttest;

	@Before
	public void avantChaqueTest() {
		clientdaotest = new ClientDao();
		clienttest = new Client();
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
	

	@After
	public void ApresChaqueTest() {
		clienttest = null;
		clientdaotest = null;
	}

}
