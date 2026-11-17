
package com.maram.Makeuppp.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

@Entity
public class Type {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long idType;

	@Column(name = "nom")
	private String nomType;

    @OneToMany(mappedBy = "type")
    private List<makeuppp> makeuppp;

    public Type() {
        super();
    }

    public Type(String nomType) {
        this.nomType = nomType;
    }

    public Long getIdType() {
        return idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getNomType() {
        return nomType;
    }

    public void setNomType(String nomType) {
        this.nomType = nomType;
    }

    public List<makeuppp> getMakeuppp() {
        return makeuppp;
    }

    public void setMakeuppp(List<makeuppp> makeuppp) {
        this.makeuppp = makeuppp;
    }
}
