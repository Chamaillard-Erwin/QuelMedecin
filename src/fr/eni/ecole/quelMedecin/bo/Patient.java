/**
 * Classe qui permet de creer des instance de type Patient avec nom, prénom, etc..
 * + une procédure d'affichage.
 * @author echamaillard2021
 */
package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Patient extends Personne {
    //Attributs d'instance
    private char sexe;
    private long noSecu;
    private LocalDate dateNaissance;
    private String comment;
    //Contructeur de la classe Patient
    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long noSecu, LocalDate dateNaissance, String comment, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.noSecu = noSecu;
        this.dateNaissance = dateNaissance;
        this.comment = comment;
        this.sexe = sexe;

    }
    //Méthode pour afficher un patient
    public void afficher() {

        System.out.printf("%s %s %n" +
                        "Téléphone : %s %n" +
                        "Sexe : %s %n" +
                        "Numéro de Sécurité sociale : %d %n" +
                        "Date de naissance : %s %n" +
                        "Commentaires : %s %n",
                this.nom.toUpperCase(),
                this.prenom, this.numeroDeTelephone, this.sexe == 'F' ? "Féminin" : "Masculin",
                this.noSecu, this.dateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)),
                this.comment == null ? "[Aucun commentaire]" : this.comment);
                this.adresse.afficher();
    }



}
