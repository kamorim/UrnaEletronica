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
@Table(name = "PRESIDENTES")
@NamedQueries({
    @NamedQuery(name = "Presidentes.findAll", query = "SELECT p FROM Presidentes p")
    , @NamedQuery(name = "Presidentes.findByIdpresidente", query = "SELECT p FROM Presidentes p WHERE p.idpresidente = :idpresidente")
    , @NamedQuery(name = "Presidentes.findByIdpessoa", query = "SELECT p FROM Presidentes p WHERE p.idpessoa = :idpessoa")
    , @NamedQuery(name = "Presidentes.findByIdpartido", query = "SELECT p FROM Presidentes p WHERE p.idpartido = :idpartido")
    , @NamedQuery(name = "Presidentes.findByNumcandidatopresidente", query = "SELECT p FROM Presidentes p WHERE p.numcandidatopresidente = :numcandidatopresidente")
    , @NamedQuery(name = "Presidentes.findByVicepresidente", query = "SELECT p FROM Presidentes p WHERE p.vicepresidente = :vicepresidente")
    , @NamedQuery(name = "Presidentes.findBySloganpresidente", query = "SELECT p FROM Presidentes p WHERE p.sloganpresidente = :sloganpresidente")})
public class Presidentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPRESIDENTE")
    private Integer idpresidente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPESSOA")
    private int idpessoa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPARTIDO")
    private int idpartido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMCANDIDATOPRESIDENTE")
    private int numcandidatopresidente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 90)
    @Column(name = "VICEPRESIDENTE")
    private String vicepresidente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "SLOGANPRESIDENTE")
    private String sloganpresidente;

    public Presidentes() {
    }

    public Presidentes(Integer idpresidente) {
        this.idpresidente = idpresidente;
    }

    public Presidentes(Integer idpresidente, int idpessoa, int idpartido, int numcandidatopresidente, String vicepresidente, String sloganpresidente) {
        this.idpresidente = idpresidente;
        this.idpessoa = idpessoa;
        this.idpartido = idpartido;
        this.numcandidatopresidente = numcandidatopresidente;
        this.vicepresidente = vicepresidente;
        this.sloganpresidente = sloganpresidente;
    }

    public Integer getIdpresidente() {
        return idpresidente;
    }

    public void setIdpresidente(Integer idpresidente) {
        this.idpresidente = idpresidente;
    }

    public int getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

    public int getIdpartido() {
        return idpartido;
    }

    public void setIdpartido(int idpartido) {
        this.idpartido = idpartido;
    }

    public int getNumcandidatopresidente() {
        return numcandidatopresidente;
    }

    public void setNumcandidatopresidente(int numcandidatopresidente) {
        this.numcandidatopresidente = numcandidatopresidente;
    }

    public String getVicepresidente() {
        return vicepresidente;
    }

    public void setVicepresidente(String vicepresidente) {
        this.vicepresidente = vicepresidente;
    }

    public String getSloganpresidente() {
        return sloganpresidente;
    }

    public void setSloganpresidente(String sloganpresidente) {
        this.sloganpresidente = sloganpresidente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpresidente != null ? idpresidente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presidentes)) {
            return false;
        }
        Presidentes other = (Presidentes) object;
        if ((this.idpresidente == null && other.idpresidente != null) || (this.idpresidente != null && !this.idpresidente.equals(other.idpresidente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Presidentes[ idpresidente=" + idpresidente + " ]";
    }
    
}
