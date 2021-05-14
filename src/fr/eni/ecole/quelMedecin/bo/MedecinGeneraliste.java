package fr.eni.ecole.quelMedecin.bo;

import sun.font.CreatedFontTracker;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Classe qui permet de construire des instances de Médecin
 * avec Nom, prénom, coordonnées, tarif etc..
 *
 * @author echamaillard2021
 */
public class MedecinGeneraliste {
    //Attributs d'instance
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private Adresse adresse;
    private Creneau[] creneauTab = new Creneau[15];;
    //Attribut de classe
    private static int tarif =25;

    //Constructeur de la classe
    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
    }
    //Setters
    public String getNumeroDeTelephone() {
        return this.numeroDeTelephone;
    }
    public String getNom() {
        return this.nom;
    }
    public int getTarif() {
        return tarif;
    }
    //Getters
    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }
    public static void setTarif(int newTarif) {
        tarif = newTarif;
    }

    /**
     * Affiche les informations du médecin :
     * NOM Prénom
     * Téléphone : XXXXXXXXXX
     * Tarif : XX€
     */
    public void afficher() {
        System.out.printf("%s %s %nTéléphone : %s %nTarif : %d€ %n", this.nom.toUpperCase(), this.prenom, this.numeroDeTelephone, MedecinGeneraliste.tarif);
        this.adresse.afficher();
        System.out.println("Créneaux :");

        for (Creneau cren : this.creneauTab) {
            cren.afficher();
            if (cren == null) {
                System.out.println("NULL");
            }
        }
    }

    public void ajouterCreneau(Creneau creneau) {
        for (int i = 0; i < this.creneauTab.length ; i++) {
            if (creneauTab[i] == null) {
                creneauTab[i] = creneau;
                break;
            }
        }
    }

}
