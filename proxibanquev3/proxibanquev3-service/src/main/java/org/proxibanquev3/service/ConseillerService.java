package org.proxibanquev3.service;


import java.util.Collection;

import org.proxibanquev3.dao.ConseillerDao;
import org.proxibanquev3.domaine.Client;
import org.proxibanquev3.domaine.Conseiller;

public class ConseillerService implements IConseillerService{

	ConseillerDao conseillerDao;//injection
	public ConseillerService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<Client> selectAll() {
		// TODO Auto-generated method stub
		return conseillerDao.selectAll();
	}

	@Override
	public String authentification(Conseiller conseiller) {
		
		Conseiller conseillerdao = conseillerDao.selectObject(conseiller);

		if (conseiller.getLogin().equalsIgnoreCase(conseillerdao.getLogin())
				&& conseiller.getPwd().equalsIgnoreCase(conseillerdao.getPwd()) && conseillerdao.getLogin() != null) {
			return "listClients.xhtml";
		} else {
			return "login.xhtml";
		}
		
	}

		
	}
	
	

	

