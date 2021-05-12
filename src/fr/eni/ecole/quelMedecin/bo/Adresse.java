package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe qui permet de créer des instances d'adresse avec une
 * procédure d'affichage
 * @author echamaillard2021
 */
public class Adresse {
    //Attributs de l'instance
    private String mentionComp = null;
    private int noVoie;
    private String typeVoie = "";
    private String nomVoie;
    private int codePostal;

    private String nomCommune;
    //Constructeur complet de l'adresse
    public Adresse(String mentionComp, int noVoie, String typeVoie, String nomVoie, int codePostal, String nomCommune) {
        this(noVoie, typeVoie, nomVoie, codePostal, nomCommune);
        this.mentionComp = mentionComp;

    }
    //Constructeur optionel de l'adresse
    public Adresse(int noVoie,String typeVoie, String nomVoie, int codePostal, String nomCommune) {
        this.noVoie = noVoie;
        this.nomVoie = nomVoie;
        this.codePostal = codePostal;
        this.typeVoie = "";
        this.nomCommune = nomCommune;
    }

    /**
     * Permet d'afficher les adresses
     */
    public void afficher() {
        if(this.mentionComp != null) {
            System.out.printf("%s %n", this.mentionComp);
        }

        System.out.printf("%d%s %s %n%05d %s %n", this.noVoie, this.typeVoie, this.nomVoie, this.codePostal, this.nomCommune);
    }

}
