package fr.objis.proxibanquev2.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.objis.proxibanquev2.domaine.User;
import fr.objis.proxibanquev2.service.UserService;


@ManagedBean(name = "userbean")
@SessionScoped

public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private User utilisateur = new User();

	private List<User> userList = new ArrayList<User>(Arrays.asList(

			new User("Dupont", "Michel", "homme", "27/10/1977", "dupont@objis.com", "medium"),
			new User("Paulin", "Jacques", "homme", "12/06/1965", "paulin@objis.com", "medium"),
			new User("Participant", "Objis", "homme", "07/10/1987", "particpany@objis.com", "medium"),
			new User("Nathalie", "Tango", "femme", "17/07/1980", "nathalie@objis.com", "premium")));

	// Constructeur

	public UserBean(User utilisateur) {
		super();
		this.utilisateur = utilisateur;
	}

	public UserBean() {
		super();
	}

	// Getters & Setters

	public User getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(User utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	// Méthode
	public void addAction() {
		User user = new User (utilisateur.getPrenom(),utilisateur.getNom(),utilisateur.getGenre(),utilisateur.getDatedenaissance(),utilisateur.getEmail(),utilisateur.getNiveaudeservice());
		userList.add(user);
		UserService usersrv = new UserService();
		usersrv.createUser(user);
	}
	
	public void deleteAction(){
		
	}

}
