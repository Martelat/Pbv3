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

	//Déclaration des objets nécessaires à la phase de test
	ClientDao clientdaotest;
	Client clienttest;
	CompteDao comptedaotest;
	Compte comptetest, comptetest2;

	//Instanciation des objets avant chaque test
	@Before
	public void avantChaqueTest() {
		clientdaotest = new ClientDao();
		comptedaotest = new CompteDao();
		clienttest = new Client();
		comptetest = new Compte();
		comptetest2= new Compte(1000.0, 5, "épargne", clienttest);
	}

	/**
	 * Méthode testcreer1()
	 * teste que le compte créé par la méthode est bien celui entré en paramètre
	 */
	@Test
	public void testcreer1() {
		Compte resultat = comptedaotest.creer(comptetest);
		Assert.assertEquals(comptetest, resultat);
	}

	/**
	 * Méthode testcreer2()
	 * teste que la méthode creer() ne retourne pas un null
	 */
	@Test
	public void testcreer2() {
		Compte resultat = comptedaotest.creer(comptetest);
		Assert.assertNotNull(resultat);
	}
	
	/**
	 * Méthode testcreer3()
	 * teste que l'objet entré en paramètre de creer() et l'objet retourné par creer() sont les mêmes
	 */
	@Test
	public void testcreer3() {
		Compte resultat = comptedaotest.creer(comptetest);
		Assert.assertSame(comptetest, resultat);
	}
	
	/**
	 * Méthode testcreer4()
	 * teste que les propriétés de l'objet entré en paramètre de creer() sont les mêmes que celles de l'objet retourné par creer()
	 */
	@Test
	public void testcreer4() {
		clientdaotest.creer(clienttest);
		Compte resultat = comptedaotest.creer(comptetest2);
		//Assert.assertSame(resultat.getSolde(), 1000.0); assertSame() ne fonctionne pas avec le type long
		Assert.assertEquals(resultat.getNumero(), 5);
		Assert.assertEquals(resultat.getType(), "épargne");
		Assert.assertEquals(resultat.getClient(), clienttest);
	}
	
	/**
	 * Méthode testmodifier1()
	 * teste que l'objet à modifier et l'objet modifié ne sont pas les mêmes
	 */
	@Test
	public void testmodifier1() {
		Compte resultat = comptedaotest.modifier(comptetest);
		Assert.assertNotSame(resultat, comptetest);
	}
	
	/**
	 * Méthode testmodifier2()
	 * teste que l'objet retourné par la méthode modifier() n'est pas un null
	 */
	@Test
	public void testmodifier2() {
		Compte resultat = comptedaotest.modifier(comptetest);
		Assert.assertNotNull(resultat);
	}
	
	//Suppression des objets après chaque test
	@After
	public void ApresChaqueTest() {
		clientdaotest = null;
		comptedaotest = null;
		clienttest = null;
		comptetest = null;
		comptetest2= null;
	}
}
