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

/**
 *
 * @author Kin Amorim
 */
@Entity
@Table(name = "VOTACAOPRESIDENTE")
@NamedQueries({
    @NamedQuery(name = "Votacaopresidente.findAll", query = "SELECT v FROM Votacaopresidente v")
    , @NamedQuery(name = "Votacaopresidente.findByIdvotacaopresidente", query = "SELECT v FROM Votacaopresidente v WHERE v.idvotacaopresidente = :idvotacaopresidente")
    , @NamedQuery(name = "Votacaopresidente.findByIdpresidente", query = "SELECT v FROM Votacaopresidente v WHERE v.idpresidente = :idpresidente")
    , @NamedQuery(name = "Votacaopresidente.findByVotocomputadopresidente", query = "SELECT v FROM Votacaopresidente v WHERE v.votocomputadopresidente = :votocomputadopresidente")
    , @NamedQuery(name = "Votacaopresidente.findByVotobrancopresidente", query = "SELECT v FROM Votacaopresidente v WHERE v.votobrancopresidente = :votobrancopresidente")
    , @NamedQuery(name = "Votacaopresidente.findByVotonulopresidente", query = "SELECT v FROM Votacaopresidente v WHERE v.votonulopresidente = :votonulopresidente")})
public class VotacaoPresidente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDVOTACAOPRESIDENTE")
    private Integer idvotacaopresidente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPRESIDENTE")
    private int idpresidente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOTOCOMPUTADOPRESIDENTE")
    private int votocomputadopresidente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOTOBRANCOPRESIDENTE")
    private int votobrancopresidente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOTONULOPRESIDENTE")
    private int votonulopresidente;

    public VotacaoPresidente() {
    }

    public VotacaoPresidente(Integer idvotacaopresidente) {
        this.idvotacaopresidente = idvotacaopresidente;
    }

    public VotacaoPresidente(Integer idvotacaopresidente, int idpresidente, int votocomputadopresidente, int votobrancopresidente, int votonulopresidente) {
        this.idvotacaopresidente = idvotacaopresidente;
        this.idpresidente = idpresidente;
        this.votocomputadopresidente = votocomputadopresidente;
        this.votobrancopresidente = votobrancopresidente;
        this.votonulopresidente = votonulopresidente;
    }

    public Integer getIdvotacaopresidente() {
        return idvotacaopresidente;
    }

    public void setIdvotacaopresidente(Integer idvotacaopresidente) {
        this.idvotacaopresidente = idvotacaopresidente;
    }

    public int getIdpresidente() {
        return idpresidente;
    }

    public void setIdpresidente(int idpresidente) {
        this.idpresidente = idpresidente;
    }

    public int getVotocomputadopresidente() {
        return votocomputadopresidente;
    }

    public void setVotocomputadopresidente(int votocomputadopresidente) {
        this.votocomputadopresidente = votocomputadopresidente;
    }

    public int getVotobrancopresidente() {
        return votobrancopresidente;
    }

    public void setVotobrancopresidente(int votobrancopresidente) {
        this.votobrancopresidente = votobrancopresidente;
    }

    public int getVotonulopresidente() {
        return votonulopresidente;
    }

    public void setVotonulopresidente(int votonulopresidente) {
        this.votonulopresidente = votonulopresidente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvotacaopresidente != null ? idvotacaopresidente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VotacaoPresidente)) {
            return false;
        }
        VotacaoPresidente other = (VotacaoPresidente) object;
        if ((this.idvotacaopresidente == null && other.idvotacaopresidente != null) || (this.idvotacaopresidente != null && !this.idvotacaopresidente.equals(other.idvotacaopresidente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Votacaopresidente[ idvotacaopresidente=" + idvotacaopresidente + " ]";
    }
    
}
