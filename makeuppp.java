package com.maram.Makeuppp.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.ForeignKey;

@Entity
@Table(name = "makeup")
public class makeuppp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMakeup;

    private String nomMakeup;
    @Column(name = "prix_makeup")
    private Double prix;
    private Date dateCreation;

    @ManyToOne
    @JoinColumn(
        name = "type_id",
        foreignKey = @ForeignKey(name = "FK_makeuppp_type")
    )
    private Type type;

    public makeuppp() {
        super();
    }

    public makeuppp(String nomMakeup, Double prix, Date dateCreation) {
        this.nomMakeup = nomMakeup;
        this.prix = prix;
        this.dateCreation = dateCreation;
    }

    public Long getIdMakeup() {
        return idMakeup;
    }

    public void setIdMakeup(Long idMakeup) {
        this.idMakeup = idMakeup;
    }

    public String getNomMakeup() {
        return nomMakeup;
    }

    public void setNomMakeup(String nomMakeup) {
        this.nomMakeup = nomMakeup;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "makeuppp [idMakeup=" + idMakeup
                + ", nomMakeup=" + nomMakeup
                + ", prix=" + prix
                + ", dateCreation=" + dateCreation + "]";
    }
}
