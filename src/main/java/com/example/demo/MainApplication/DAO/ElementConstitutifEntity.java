<<<<<<< HEAD
package com.example.demo.MainApplication.DAO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "element_constitutif", schema = "projetagile", catalog = "")
@IdClass(ElementConstitutifEntityPK.class)
public class ElementConstitutifEntity {
    private String codeFormation;
    private String codeUe;
    private String codeEc;
    private int noEnseignant;
    private String designation;
    private String description;
    private Byte nbhCm;
    private Byte nbhTd;
    private Byte nbhTp;

    @Id
    @Column(name = "CODE_FORMATION")
    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    @Id
    @Column(name = "CODE_UE")
    public String getCodeUe() {
        return codeUe;
    }

    public void setCodeUe(String codeUe) {
        this.codeUe = codeUe;
    }

    @Id
    @Column(name = "CODE_EC")
    public String getCodeEc() {
        return codeEc;
    }

    public void setCodeEc(String codeEc) {
        this.codeEc = codeEc;
    }

    @Id
    @Column(name = "NO_ENSEIGNANT")
    public int getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(int noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    @Basic
    @Column(name = "DESIGNATION")
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "NBH_CM")
    public Byte getNbhCm() {
        return nbhCm;
    }

    public void setNbhCm(Byte nbhCm) {
        this.nbhCm = nbhCm;
    }

    @Basic
    @Column(name = "NBH_TD")
    public Byte getNbhTd() {
        return nbhTd;
    }

    public void setNbhTd(Byte nbhTd) {
        this.nbhTd = nbhTd;
    }

    @Basic
    @Column(name = "NBH_TP")
    public Byte getNbhTp() {
        return nbhTp;
    }

    public void setNbhTp(Byte nbhTp) {
        this.nbhTp = nbhTp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElementConstitutifEntity that = (ElementConstitutifEntity) o;
        return noEnseignant == that.noEnseignant &&
                Objects.equals(codeFormation, that.codeFormation) &&
                Objects.equals(codeUe, that.codeUe) &&
                Objects.equals(codeEc, that.codeEc) &&
                Objects.equals(designation, that.designation) &&
                Objects.equals(description, that.description) &&
                Objects.equals(nbhCm, that.nbhCm) &&
                Objects.equals(nbhTd, that.nbhTd) &&
                Objects.equals(nbhTp, that.nbhTp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeFormation, codeUe, codeEc, noEnseignant, designation, description, nbhCm, nbhTd, nbhTp);
    }
}
=======
package com.example.demo.MainApplication.DAO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "element_constitutif", schema = "projetagile", catalog = "")
@IdClass(ElementConstitutifEntityPK.class)
public class ElementConstitutifEntity {
    private String codeFormation;
    private String codeUe;
    private String codeEc;
    private int noEnseignant;
    private String designation;
    private String description;
    private Byte nbhCm;
    private Byte nbhTd;
    private Byte nbhTp;

    @Id
    @Column(name = "CODE_FORMATION")
    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    @Id
    @Column(name = "CODE_UE")
    public String getCodeUe() {
        return codeUe;
    }

    public void setCodeUe(String codeUe) {
        this.codeUe = codeUe;
    }

    @Id
    @Column(name = "CODE_EC")
    public String getCodeEc() {
        return codeEc;
    }

    public void setCodeEc(String codeEc) {
        this.codeEc = codeEc;
    }

    @Id
    @Column(name = "NO_ENSEIGNANT")
    public int getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(int noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    @Basic
    @Column(name = "DESIGNATION")
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "NBH_CM")
    public Byte getNbhCm() {
        return nbhCm;
    }

    public void setNbhCm(Byte nbhCm) {
        this.nbhCm = nbhCm;
    }

    @Basic
    @Column(name = "NBH_TD")
    public Byte getNbhTd() {
        return nbhTd;
    }

    public void setNbhTd(Byte nbhTd) {
        this.nbhTd = nbhTd;
    }

    @Basic
    @Column(name = "NBH_TP")
    public Byte getNbhTp() {
        return nbhTp;
    }

    public void setNbhTp(Byte nbhTp) {
        this.nbhTp = nbhTp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElementConstitutifEntity that = (ElementConstitutifEntity) o;
        return noEnseignant == that.noEnseignant &&
                Objects.equals(codeFormation, that.codeFormation) &&
                Objects.equals(codeUe, that.codeUe) &&
                Objects.equals(codeEc, that.codeEc) &&
                Objects.equals(designation, that.designation) &&
                Objects.equals(description, that.description) &&
                Objects.equals(nbhCm, that.nbhCm) &&
                Objects.equals(nbhTd, that.nbhTd) &&
                Objects.equals(nbhTp, that.nbhTp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeFormation, codeUe, codeEc, noEnseignant, designation, description, nbhCm, nbhTd, nbhTp);
    }
}
>>>>>>> 3e9671bca416637a528adfa3ea13b75234c574a6
