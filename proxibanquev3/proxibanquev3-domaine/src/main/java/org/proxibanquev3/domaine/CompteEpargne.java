package org.proxibanquev3.domaine;

/**
 * @author Marie Martelat & Marie Jacquin
 * Classe permettant d'instancier des objets de type CompteEpargne
 *
 */
public class CompteEpargne extends Compte {
	
	/**
	 * numéro de version
	 */
	private static final long serialVersionUID = 1L;
	
	//Attribut
	private final double remuneration = 0.3;

	public CompteEpargne(double solde, int numero, String type, Client client) {
		super(solde, numero, type, client);
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne() {
		// TODO Auto-generated constructor stub
	}

}
