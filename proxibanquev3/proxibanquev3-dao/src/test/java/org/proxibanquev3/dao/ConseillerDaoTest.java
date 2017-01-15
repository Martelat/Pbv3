package org.proxibanquev3.dao;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.proxibanquev3.domaine.Conseiller;

/**
 * @author Marie Martelat & Marie Jacquin
 * Classe de test des méthodes CRUD de la classe ConseillerDao
 */
public class ConseillerDaoTest {

	ConseillerDao conseillerdaotest;
	Conseiller conseillertest, conseillertest2;

	@Before
	public void avantChaqueTest() {
		conseillerdaotest = new ConseillerDao();
		conseillertest = new Conseiller();
		conseillertest2 = new Conseiller("nomtest", "prenomtest", "logintest", "pwdtest");
	}

	@Test
	public void testcreer1() {
		Conseiller resultat = conseillerdaotest.creer(conseillertest);
		Assert.assertEquals(conseillertest, resultat);
	}

	@Test
	public void testcreer2() {
		Conseiller resultat = conseillerdaotest.creer(conseillertest);
		Assert.assertNotNull(resultat);
	}
	
	@Test
	public void testcreer3() {
		Conseiller resultat = conseillerdaotest.creer(conseillertest);
		Assert.assertSame(conseillertest, resultat);
	}
	
	@Test
	public void testcreer4() {
		Conseiller resultat = conseillerdaotest.creer(conseillertest2);
		Assert.assertEquals(resultat.getNom(), "nomtest");
		Assert.assertEquals(resultat.getPrenom(), "prenomtest");
		Assert.assertEquals(resultat.getLogin(), "logintest");
		Assert.assertEquals(resultat.getPwd(), "pwdtest");
	}
	
	@Test
	public void testmodifier1() {
		Conseiller resultat = conseillerdaotest.modifier(conseillertest);
		Assert.assertNotSame(resultat, conseillertest);
	}
	
	@Test
	public void testmodifier2() {
		Conseiller resultat = conseillerdaotest.modifier(conseillertest);
		Assert.assertNotNull(resultat);
	}

	@After
	public void ApresChaqueTest() {
		conseillertest = null;
		conseillerdaotest = null;
	}
}
