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

	//Déclaration des objets nécessaires à la phase de test
	ConseillerDao conseillerdaotest;
	Conseiller conseillertest, conseillertest2;

	//Instanciation des objets avant chaque test
	@Before
	public void avantChaqueTest() {
		conseillerdaotest = new ConseillerDao();
		conseillertest = new Conseiller();
		conseillertest2 = new Conseiller("nomtest", "prenomtest", "logintest", "pwdtest");
	}

	/**
	 * Méthode testcreer1()
	 * teste que le conseiller créé par la méthode est bien celui entré en paramètre
	 */
	@Test
	public void testcreer1() {
		Conseiller resultat = conseillerdaotest.creer(conseillertest);
		Assert.assertEquals(conseillertest, resultat);
	}

	/**
	 * Méthode testcreer2()
	 * teste que la méthode creer() ne retourne pas un null
	 */
	@Test
	public void testcreer2() {
		Conseiller resultat = conseillerdaotest.creer(conseillertest);
		Assert.assertNotNull(resultat);
	}
	
	/**
	 * Méthode testcreer3()
	 * teste que l'objet entré en paramètre de creer() et l'objet retourné par creer() sont les mêmes
	 */
	@Test
	public void testcreer3() {
		Conseiller resultat = conseillerdaotest.creer(conseillertest);
		Assert.assertSame(conseillertest, resultat);
	}
	
	/**
	 * Méthode testcreer4()
	 * teste que les propriétés de l'objet entré en paramètre de creer() sont les mêmes que celles de l'objet retourné par creer()
	 */
	@Test
	public void testcreer4() {
		Conseiller resultat = conseillerdaotest.creer(conseillertest2);
		Assert.assertEquals(resultat.getNom(), "nomtest");
		Assert.assertEquals(resultat.getPrenom(), "prenomtest");
		Assert.assertEquals(resultat.getLogin(), "logintest");
		Assert.assertEquals(resultat.getPwd(), "pwdtest");
	}
	
	/**
	 * Méthode testmodifier1()
	 * teste que l'objet à modifier et l'objet modifié ne sont pas les mêmes
	 */
	@Test
	public void testmodifier1() {
		Conseiller resultat = conseillerdaotest.modifier(conseillertest);
		Assert.assertNotSame(resultat, conseillertest);
	}
	
	/**
	 * Méthode testmodifier2()
	 * teste que l'objet retourné par la méthode modifier() n'est pas un null
	 */
	@Test
	public void testmodifier2() {
		Conseiller resultat = conseillerdaotest.modifier(conseillertest);
		Assert.assertNotNull(resultat);
	}

	//Suppression des objets après chaque test
	@After
	public void ApresChaqueTest() {
		conseillertest = null;
		conseillerdaotest = null;
		conseillertest2 = null;
	}
}
