package org.proxibanquev3.domaine;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 * @author Marie Martelat & Marie Jacquin
 * Classe permettant d'instancier des objets de type Client
 */
@Entity
public class Client implements Serializable {

	/**
	 * numéro de version
	 */
	private static final long serialVersionUID = 1L;
	
	// Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idClient;
	
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	
	@ManyToOne
	private Conseiller conseiller;// =  new Conseiller();

	// Constructeurs
	/**
	 * @param nom nom du client
	 * @param prenom prénom du client
	 * @param email e-mail du client
	 * @param adresse adresse du client
	 * @param conseiller conseiller du client
	 */
	public Client(String nom, String prenom, String email, String adresse, Conseiller conseiller) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.conseiller= conseiller;
	
	}

	public Client() {
		super();
	}

	//Getters & Setters
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

//	@Override
//	public String toString() {
//		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
//				+ ", adresse=" + adresse + ", conseiller=" + conseiller + "]";
//	}

}
