package controleur;

import vue.Arene;
import vue.ChoixJoueur;
import vue.EntreeJeu;

/**
 * Contr�leur et point d'entr�e de l'applicaton 
 * @author emds
 *
 */
public class Controle {

	private EntreeJeu frmEntreeJeu ;
	private ChoixJoueur frmChoixJoueur;
	private Arene frmArene;

	/**
	 * M�thode de d�marrage
	 * @param args non utilis�
	 */
	public static void main(String[] args) {
		new Controle();
	}
	
	/**
	 * Constructeur
	 */
	private Controle() {
		this.frmEntreeJeu = new EntreeJeu() ;
		this.frmEntreeJeu.setVisible(true);
	}
	
	public  Controle(int i) {
		frmEntreeJeu.dispose();
		this.frmChoixJoueur = new ChoixJoueur();
		this.frmChoixJoueur.setVisible(true);
	}
	public Controle(String str) {
		frmChoixJoueur.dispose();
		this.frmArene = new Arene();
		this.frmArene.setVisible(true);
	}
}
