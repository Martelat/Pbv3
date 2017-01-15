package org.proxibanquev3.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)

@Suite.SuiteClasses({
	ClientDaoTest.class,
	CompteDaoTest.class,
	ConseillerDaoTest.class
})
public class SuiteTests {

}
