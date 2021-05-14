/**
 * Classe qui permet de définir un rendez-vous en fonction d'un créneau et d'un patient
 *  Attributs
 *  Constructeur
 *  Méthode d'affichage du rendez-vous
 * @author echamaillard2021
 */


package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RendezVous {
    //Attributs de l'instance
    private Creneau creneau;
    private Patient patient;
    private LocalDate date;

    /**
     * Constructeur de la classe
     * @param creneau
     * @param patient
     * @param date
     */
    public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
        this.creneau = creneau;
        this.patient = patient;
        this.date = date;
    }

    /**
     * Méthode qui affiche les détails du rendez-vous
     */
    public void afficher() {
        System.out.printf("Rendez-vous du %s " , this.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        this.creneau.afficher();
        System.out.printf("avec le Dr %s %n", this.creneau.getMedecin().getNom());
        this.patient.afficher();
    }


}
