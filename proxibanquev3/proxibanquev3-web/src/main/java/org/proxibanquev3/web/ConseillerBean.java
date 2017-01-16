package org.proxibanquev3.web;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.proxibanquev3.domaine.Client;
import org.proxibanquev3.service.ConseillerService;

@ManagedBean(name = "conseillerBean")
@SessionScoped
public class ConseillerBean  implements Serializable {

	/**
	 * numéro de version
	 */
	private static final long serialVersionUID = 1L;

	String login;
	String pwd;
	ConseillerService conseillerService;//injection
	ArrayList<Client> listClient = new ArrayList<Client>();
	public ConseillerBean() {
		// TODO Auto-generated constructor stub
	}
	
	public void authentification(String login, String pwd)
	{
		//à completer
	}
	
	public ArrayList<Client> selectAll()
	{
		listClient = conseillerService.selectAll();
		
		return listClient;
	}
	

}
