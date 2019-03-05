package com.example.demo.MainApplication.DAO;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "unite_enseignement", schema = "projetagile", catalog = "")
@IdClass(UniteEnseignementEntityPK.class)
public class UniteEnseignementEntity {
    private String codeFormation;
    private String codeUe;
    private int noEnseignant;
    private String designation;
    private String semestre;
    private String description;
    private Long nbhCm;
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
    @Column(name = "SEMESTRE")
    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
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
    public Long getNbhCm() {
        return nbhCm;
    }

    public void setNbhCm(Long nbhCm) {
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
        UniteEnseignementEntity that = (UniteEnseignementEntity) o;
        return noEnseignant == that.noEnseignant &&
                Objects.equals(codeFormation, that.codeFormation) &&
                Objects.equals(codeUe, that.codeUe) &&
                Objects.equals(designation, that.designation) &&
                Objects.equals(semestre, that.semestre) &&
                Objects.equals(description, that.description) &&
                Objects.equals(nbhCm, that.nbhCm) &&
                Objects.equals(nbhTd, that.nbhTd) &&
                Objects.equals(nbhTp, that.nbhTp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeFormation, codeUe, noEnseignant, designation, semestre, description, nbhCm, nbhTd, nbhTp);
    }
}
