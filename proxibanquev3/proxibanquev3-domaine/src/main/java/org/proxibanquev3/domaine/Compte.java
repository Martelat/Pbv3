package org.proxibanquev3.domaine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Marie Martelat & Marie Jacquin
 * Classe permettant d'instancier des objets de type Compte
 */
@Entity
public class Compte implements Serializable {

	/**
	 * numéro de version
	 */
	private static final long serialVersionUID = 1L;
	
	//Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCompte;
	
	private double solde;
	private int numero;
	private String type;
	
	@ManyToOne
	private Client client;
	
	//Constructeurs
	/**
	 * @param solde solde du compte
	 * @param numero numéro de compte
	 * @param type type de compte
	 * @param client client associé
	 */
	public Compte(double solde, int numero, String type, Client client) {
		super();
		this.solde = solde;
		this.numero = numero;
		this.type = type;
		this.client = client;
		
		
	}

	public Compte() {
		super();
	}

	//Getters & Setters
	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

//	public Client getClient() {
//		return client;
//	}
//
//	public void setClient(Client client) {
//		this.client = client;
//	}
//	
	
	
	
}
