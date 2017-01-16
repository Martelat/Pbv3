package org.proxibanquev3.service;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.proxibanquev3.domaine.Conseiller;

/**
 * @author Marie Martelat & Marie Jacquin Classe de test des méthodes de
 *         ConseillerService
 */
public class ConseillerServiceTest {

	// Déclaration des objets nécessaires à la phase de test
	ConseillerService conseillerservicetest;
	Conseiller conseillertest;

	// Instanciation des objets avant chaque test
	@Before
	public void avantChaqueTest() {
		conseillerservicetest = new ConseillerService();
		conseillertest = new Conseiller("jean01", "acteur");
	}

	/**
	 * Méthode testauth1() teste que le conseiller entré en paramètre et le
	 * conseiller retourné par la méthode authentification() sont les mêmes
	 * objets
	 */
	@Test
	public void testauth1() {
		Conseiller resultat = conseillerservicetest.authentification(conseillertest);
		Assert.assertEquals(resultat, conseillertest);
	}

	/**
	 * Méthode testauth2() teste que l'objet retourné par la méthode
	 * authentification() n'est pas un null
	 */
	@Test
	public void testauth2() {
		Conseiller resultat = conseillerservicetest.authentification(conseillertest);
		Assert.assertNotNull(resultat);
	}

	// Suppression des objets après chaque test
	@After
	public void ApresChaqueTest() {
		conseillerservicetest = null;
		conseillertest = null;
	}
}