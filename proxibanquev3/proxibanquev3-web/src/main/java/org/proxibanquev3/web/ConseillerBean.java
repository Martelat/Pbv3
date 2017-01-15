package org.proxibanquev3.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.proxibanquev3.domaine.Client;
import org.proxibanquev3.domaine.Conseiller;
import org.proxibanquev3.service.ConseillerService;

@ManagedBean(name = "conseillerBean")
@SessionScoped
public class ConseillerBean implements Serializable {

	/**
	 * numéro de version
	 */
	private static final long serialVersionUID = 1L;

	// Protpriété
	
	@ManagedProperty(value = "")
	String login;
	@ManagedProperty(value = "")
	String pwd;
	@ManagedProperty(value = "")
	Conseiller conseiller = new Conseiller();
	
	ConseillerService conseillerService;// injection
	Collection<Client> listClient = new ArrayList<Client>();

	// Constructeur
	public ConseillerBean() {
		// TODO Auto-generated constructor stub
	}

	// Méthode

	public void authentification() {
		ConseillerService conseillerservice = new ConseillerService();
		Conseiller authconseiller = new Conseiller(this.login, this.pwd);
		conseillerservice.authentification(authconseiller);

	}

	public Collection<Client> selectAll() {
		return listClient = conseillerService.selectAll();
	}

	// Getters Setters

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public ConseillerService getConseillerService() {
		return conseillerService;
	}

	public void setConseillerService(ConseillerService conseillerService) {
		this.conseillerService = conseillerService;
	}

	public Collection<Client> getListClient() {
		return listClient;
	}

	public void setListClient(Collection<Client> listClient) {
		this.listClient = listClient;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	
	

}
