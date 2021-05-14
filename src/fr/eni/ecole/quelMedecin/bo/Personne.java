package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe qui définit une personne :
 * Attributs et son constructeur
 *
 * @author echamaillard2021
 */

public class Personne {
    //Attributs de l'instance
    protected String nom;
    protected String prenom;
    protected String numeroDeTelephone;
    protected Adresse adresse;

    /**
     * Constructeur de la classe Personne
     * @param nom
     * @param prenom
     * @param numeroDeTelephone
     * @param adresse
     */
    public Personne (String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
    }

}
