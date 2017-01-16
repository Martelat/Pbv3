package org.proxibanquev3.domaine;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * @author Marie Martelat & Marie Jacquin Classe permettant d'instancier des
 *         objets de type CompteCourant
 *
 */
@Entity
public class CompteCourant extends Compte implements Serializable {

	/**
	 * numéro de version
	 */
	private static final long serialVersionUID = 1L;

	// Propriété

	private static final int decouvert = 1000;

	// Constructeur
	public CompteCourant(double solde, int numero, String type, Client client) {
		super(solde, numero, type, client);

		// TODO Auto-generated constructor stub
	}

	public CompteCourant() {
		// TODO Auto-generated constructor stub
	}

	public int getDecouvert() {
		return decouvert;
	}

}
