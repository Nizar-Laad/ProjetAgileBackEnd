package com.example.demo.MainApplication.DAO;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class UniteEnseignementEntityPK implements Serializable {
    private String codeFormation;
    private String codeUe;
    private int noEnseignant;

    @Column(name = "CODE_FORMATION")
    @Id
    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    @Column(name = "CODE_UE")
    @Id
    public String getCodeUe() {
        return codeUe;
    }

    public void setCodeUe(String codeUe) {
        this.codeUe = codeUe;
    }

    @Column(name = "NO_ENSEIGNANT")
    @Id
    public int getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(int noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniteEnseignementEntityPK that = (UniteEnseignementEntityPK) o;
        return noEnseignant == that.noEnseignant &&
                Objects.equals(codeFormation, that.codeFormation) &&
                Objects.equals(codeUe, that.codeUe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeFormation, codeUe, noEnseignant);
    }
}
