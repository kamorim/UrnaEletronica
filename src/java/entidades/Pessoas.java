/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Kin Amorim
 */
@Entity
@Table(name = "PESSOAS")
@NamedQueries({
    @NamedQuery(name = "Pessoas.findAll", query = "SELECT p FROM Pessoas p")
    , @NamedQuery(name = "Pessoas.findByIdpessoa", query = "SELECT p FROM Pessoas p WHERE p.idpessoa = :idpessoa")
    , @NamedQuery(name = "Pessoas.findByNomepessoa", query = "SELECT p FROM Pessoas p WHERE p.nomepessoa = :nomepessoa")
    , @NamedQuery(name = "Pessoas.findBySobrenomepessoa", query = "SELECT p FROM Pessoas p WHERE p.sobrenomepessoa = :sobrenomepessoa")})
public class Pessoas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPESSOA")
    private Integer idpessoa;
    @Size(max = 30)
    @Column(name = "NOMEPESSOA")
    private String nomepessoa;
    @Size(max = 60)
    @Column(name = "SOBRENOMEPESSOA")
    private String sobrenomepessoa;

    public Pessoas() {
    }

    public Pessoas(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    public Integer getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getNomepessoa() {
        return nomepessoa;
    }

    public void setNomepessoa(String nomepessoa) {
        this.nomepessoa = nomepessoa;
    }

    public String getSobrenomepessoa() {
        return sobrenomepessoa;
    }

    public void setSobrenomepessoa(String sobrenomepessoa) {
        this.sobrenomepessoa = sobrenomepessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpessoa != null ? idpessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoas)) {
            return false;
        }
        Pessoas other = (Pessoas) object;
        if ((this.idpessoa == null && other.idpessoa != null) || (this.idpessoa != null && !this.idpessoa.equals(other.idpessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Pessoas[ idpessoa=" + idpessoa + " ]";
    }
    
}
