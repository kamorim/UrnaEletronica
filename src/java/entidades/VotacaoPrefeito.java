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
@Table(name = "VOTACAOPREFEITO")
@NamedQueries({
    @NamedQuery(name = "Votacaoprefeito.findAll", query = "SELECT v FROM Votacaoprefeito v")
    , @NamedQuery(name = "Votacaoprefeito.findByIdvotacaoprefeito", query = "SELECT v FROM Votacaoprefeito v WHERE v.idvotacaoprefeito = :idvotacaoprefeito")
    , @NamedQuery(name = "Votacaoprefeito.findByIdprefeito", query = "SELECT v FROM Votacaoprefeito v WHERE v.idprefeito = :idprefeito")
    , @NamedQuery(name = "Votacaoprefeito.findByVotocomputadoprefeito", query = "SELECT v FROM Votacaoprefeito v WHERE v.votocomputadoprefeito = :votocomputadoprefeito")
    , @NamedQuery(name = "Votacaoprefeito.findByVotobrancoprefeito", query = "SELECT v FROM Votacaoprefeito v WHERE v.votobrancoprefeito = :votobrancoprefeito")
    , @NamedQuery(name = "Votacaoprefeito.findByVotonuloprefeito", query = "SELECT v FROM Votacaoprefeito v WHERE v.votonuloprefeito = :votonuloprefeito")})
public class VotacaoPrefeito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDVOTACAOPREFEITO")
    private Integer idvotacaoprefeito;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPREFEITO")
    private int idprefeito;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOTOCOMPUTADOPREFEITO")
    private int votocomputadoprefeito;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOTOBRANCOPREFEITO")
    private int votobrancoprefeito;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOTONULOPREFEITO")
    private int votonuloprefeito;

    public VotacaoPrefeito() {
    }

    public VotacaoPrefeito(Integer idvotacaoprefeito) {
        this.idvotacaoprefeito = idvotacaoprefeito;
    }

    public VotacaoPrefeito(Integer idvotacaoprefeito, int idprefeito, int votocomputadoprefeito, int votobrancoprefeito, int votonuloprefeito) {
        this.idvotacaoprefeito = idvotacaoprefeito;
        this.idprefeito = idprefeito;
        this.votocomputadoprefeito = votocomputadoprefeito;
        this.votobrancoprefeito = votobrancoprefeito;
        this.votonuloprefeito = votonuloprefeito;
    }

    public Integer getIdvotacaoprefeito() {
        return idvotacaoprefeito;
    }

    public void setIdvotacaoprefeito(Integer idvotacaoprefeito) {
        this.idvotacaoprefeito = idvotacaoprefeito;
    }

    public int getIdprefeito() {
        return idprefeito;
    }

    public void setIdprefeito(int idprefeito) {
        this.idprefeito = idprefeito;
    }

    public int getVotocomputadoprefeito() {
        return votocomputadoprefeito;
    }

    public void setVotocomputadoprefeito(int votocomputadoprefeito) {
        this.votocomputadoprefeito = votocomputadoprefeito;
    }

    public int getVotobrancoprefeito() {
        return votobrancoprefeito;
    }

    public void setVotobrancoprefeito(int votobrancoprefeito) {
        this.votobrancoprefeito = votobrancoprefeito;
    }

    public int getVotonuloprefeito() {
        return votonuloprefeito;
    }

    public void setVotonuloprefeito(int votonuloprefeito) {
        this.votonuloprefeito = votonuloprefeito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvotacaoprefeito != null ? idvotacaoprefeito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VotacaoPrefeito)) {
            return false;
        }
        VotacaoPrefeito other = (VotacaoPrefeito) object;
        if ((this.idvotacaoprefeito == null && other.idvotacaoprefeito != null) || (this.idvotacaoprefeito != null && !this.idvotacaoprefeito.equals(other.idvotacaoprefeito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Votacaoprefeito[ idvotacaoprefeito=" + idvotacaoprefeito + " ]";
    }
    
}
