package org.proxibanquev3.service;


import java.util.Collection;

import org.proxibanquev3.domaine.Client;
import org.proxibanquev3.domaine.Conseiller;

public interface IConseillerService {
	
	Collection<Client> selectAll();
	
	Conseiller authentification(Conseiller conseiller);

}
