package org.proxibanquev3.web;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.proxibanquev3.domaine.Client;
import org.proxibanquev3.service.ConseillerService;

@ManagedBean(name = "conseillerBean")
@SessionScoped
public class ConseillerBean {

	String login;
	String pwd;
	ConseillerService conseillerService;//injection
	ArrayList<Client> listClient;
	public ConseillerBean() {
		// TODO Auto-generated constructor stub
	}
	
	public void authentification(String login, String pwd)
	{
		//à completer
	}
	
	public void selectAll()
	{
		listClient = conseillerService.selectAll();
	}
	

}
