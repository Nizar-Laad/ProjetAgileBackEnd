package com.example.demo.MainApplication.DAO;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ElementConstitutifEntityPK implements Serializable {
    private String codeFormation;
    private String codeUe;
    private String codeEc;
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

    @Column(name = "CODE_EC")
    @Id
    public String getCodeEc() {
        return codeEc;
    }

    public void setCodeEc(String codeEc) {
        this.codeEc = codeEc;
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
        ElementConstitutifEntityPK that = (ElementConstitutifEntityPK) o;
        return noEnseignant == that.noEnseignant &&
                Objects.equals(codeFormation, that.codeFormation) &&
                Objects.equals(codeUe, that.codeUe) &&
                Objects.equals(codeEc, that.codeEc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeFormation, codeUe, codeEc, noEnseignant);
    }
}
