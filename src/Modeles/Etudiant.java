package Modeles;

import java.time.LocalDate;

public class Etudiant {
   
    protected String matricule;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    protected String telephone;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    protected LocalDate dateNaiss;

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
}
