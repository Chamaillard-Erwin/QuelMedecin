package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe qui définit une médecin spécialiste :
 * Attributs
 * Constructeur
 * Méthode d'affichage
 * @author echamaillard2021
 */
public class MedecinSpecialiste extends MedecinGeneraliste {

    //Attributs de l'instance
    private MedecinGeneraliste medecin;
    private int newTarif;
    private String spec;

    /**
     * Constructeur de la classe spécialiste qui utilise le constructeur de la classe MedeciGeneraliste
     * @param nom
     * @param prenom
     * @param numeroDeTelephone
     * @param adresse
     * @param spec
     * @param tarif
     */
    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String spec, int tarif) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.newTarif = tarif;
        this.spec = spec;

    }

    /**
     * On surcharge la méthode d'affichage car différent du père
     */
    @Override
    public void afficher() {
        System.out.printf("%s %s %nTéléphone : %s %nTarif : %d€ %n", this.nom.toUpperCase(), this.prenom, this.numeroDeTelephone, this.newTarif);
        this.adresse.afficher();
        System.out.println("Créneaux :");

       for (Creneau cren : this.creneauTab) {

            if (cren != null) {
                cren.afficher();
            }

        }
    }

}
