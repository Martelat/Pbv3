package org.proxibanquev3.domaine;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Marie Martelat & Marie Jacquin
 * Classe permettant d'instancier des objets de type Conseiller
 */
@Entity
public class Conseiller implements Serializable {

	/**
	 * numéro de version
	 */
	private static final long serialVersionUID = 1L;
	
	//Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idConseiller;
	
	private String nom;
	private String prenom;
	private String login;
	private String pwd;
	
	@OneToMany
	private ArrayList<Client> listClient;
	
	//Constructeurs
	/**
	 * @param nom nom du conseiller
	 * @param prenom prénom du conseiller
	 * @param login login du conseiller
	 * @param pwd mot de passe du conseiller
	 */
	public Conseiller(String nom, String prenom, String login, String pwd) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.pwd = pwd;
	}

	public Conseiller() {
		super();
	}

	//Getters & Setters
	public int getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

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
	
	
}
