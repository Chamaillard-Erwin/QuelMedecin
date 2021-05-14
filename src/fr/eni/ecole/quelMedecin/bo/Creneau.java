/**
 * Classe qui définit un créneau
 * Attributs
 *
 * @author echamaillard2021
 */

package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;

public class Creneau {

    //Attributs de la classe
    private LocalTime debut;
    private int duree;
    private MedecinGeneraliste medecin;

    /**
     * Constructeur d'un créneau horaire
     * @param debut
     * @param duree
     * @param medecin
     */
    public Creneau (LocalTime debut, int duree, MedecinGeneraliste medecin) {
        this.debut = debut;
        this.duree = duree;
        this.medecin = medecin;
        medecin.ajouterCreneau(this);
    }

    /**
     * Méthode qui affiche les détails d'un créneau horaire
     */
    public void afficher() {
       System.out.printf("%s - %s (%d minutes)%n",
                this.debut,
                this.debut.plusMinutes(this.duree),
                this.duree);
    }

    //Getter pour récupérer un médecin
    public MedecinGeneraliste getMedecin() {

        return this.medecin;
    }
}