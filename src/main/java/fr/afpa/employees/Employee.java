package fr.afpa.employees;

import java.time.LocalDate;

public class Employee {
    private long joursRestants = 0;
    private int matricule;
    private String nom;
    private String prenom;
    /** Salaire brut **/
    private float salaire;
    private LocalDate dateDeNaissance;
    private final int partSociale = 30;

    public Employee(int matricule, String nom, String prenom, float salaire, LocalDate dateNaissance) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.dateDeNaissance = dateNaissance;
    }

    public int getMatricule() {
        return matricule;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getJourAvantAnniv() {

        LocalDate aujourdHui = LocalDate.now();

        LocalDate prochainAnniversaire = LocalDate.of(
                aujourdHui.getYear(),
                dateDeNaissance.getMonthValue(),
                dateDeNaissance.getDayOfMonth());

        if (prochainAnniversaire.isBefore(aujourdHui) || prochainAnniversaire.isEqual(aujourdHui)) {
            prochainAnniversaire = prochainAnniversaire.plusYears(1);
        }

        this.joursRestants = prochainAnniversaire.toEpochDay() - aujourdHui.toEpochDay();

        return "Jours avant l'anniversaire : " + joursRestants;
    }

    public float getSalaireNet() {
        float salaireNet = this.salaire - (this.salaire * partSociale / 100f);
        return salaireNet;
    }

    public int getPartSociale() {
        return partSociale;
    }

    public String getPrenom() {
        return prenom;
    }

    public float getSalaire() {
        return salaire;
    }

    public String getNomPrenom() {
        return nom + " " + prenom;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public String toString() {
        return "Matricule: " + matricule + ", Nom: " + nom + ", Prenom: " + prenom + ", Salaire: " + salaire
                + ", Jour avant l'anniversaire: " + joursRestants;

    }

}
