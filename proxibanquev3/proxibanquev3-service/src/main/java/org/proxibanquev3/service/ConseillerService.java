package org.proxibanquev3.service;

import java.util.ArrayList;

import org.proxibanquev3.dao.ConseillerDao;
import org.proxibanquev3.domaine.Client;

public class ConseillerService implements IConseillerService{

	ConseillerDao conseillerDao;//injection
	public ConseillerService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Client> selectAll() {
		// TODO Auto-generated method stub
		return conseillerDao.selectAll();
	}
	
	

}
