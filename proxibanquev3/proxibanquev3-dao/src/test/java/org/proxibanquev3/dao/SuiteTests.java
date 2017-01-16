package org.proxibanquev3.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * @author Marie Martelat & Marie Jacquin
 * Classe permettant de lancer la suite de tests des classes ClientDaoTest, CompteDaoTest et ConseillerDaoTest
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
	ClientDaoTest.class,
	CompteDaoTest.class,
	ConseillerDaoTest.class
})
public class SuiteTests {

}
