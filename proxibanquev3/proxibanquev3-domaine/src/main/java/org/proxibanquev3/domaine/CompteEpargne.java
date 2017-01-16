package org.proxibanquev3.domaine;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * @author Marie Martelat & Marie Jacquin Classe permettant d'instancier des
 *         objets de type CompteEpargne
 *
 */
@Entity
public class CompteEpargne extends Compte implements Serializable {

	/**
	 * numéro de version
	 */
	private static final long serialVersionUID = 1L;

	// Attribut

	private static final double remuneration = 0.3;

	public CompteEpargne(double solde, int numero, String type, Client client) {
		super(solde, numero, type, client);

		// TODO Auto-generated constructor stub
	}

	public CompteEpargne() {
		// TODO Auto-generated constructor stub
	}

	public double getRemuneration() {
		return remuneration;
	}

}
