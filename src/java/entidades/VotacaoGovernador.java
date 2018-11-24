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
@Table(name = "VOTACAOGOVERNADOR")
@NamedQueries({
    @NamedQuery(name = "Votacaogovernador.findAll", query = "SELECT v FROM Votacaogovernador v")
    , @NamedQuery(name = "Votacaogovernador.findByIdvotacaogovernador", query = "SELECT v FROM Votacaogovernador v WHERE v.idvotacaogovernador = :idvotacaogovernador")
    , @NamedQuery(name = "Votacaogovernador.findByIdgovernador", query = "SELECT v FROM Votacaogovernador v WHERE v.idgovernador = :idgovernador")
    , @NamedQuery(name = "Votacaogovernador.findByVotocomputadogovernador", query = "SELECT v FROM Votacaogovernador v WHERE v.votocomputadogovernador = :votocomputadogovernador")
    , @NamedQuery(name = "Votacaogovernador.findByVotobrancogovernador", query = "SELECT v FROM Votacaogovernador v WHERE v.votobrancogovernador = :votobrancogovernador")
    , @NamedQuery(name = "Votacaogovernador.findByVotonulogovernador", query = "SELECT v FROM Votacaogovernador v WHERE v.votonulogovernador = :votonulogovernador")})
public class VotacaoGovernador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDVOTACAOGOVERNADOR")    
    private Integer idvotacaogovernador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGOVERNADOR")
    private int idgovernador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOTOCOMPUTADOGOVERNADOR")
    private int votocomputadogovernador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOTOBRANCOGOVERNADOR")
    private int votobrancogovernador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VOTONULOGOVERNADOR")
    private int votonulogovernador;

    public VotacaoGovernador() {
    }

    public VotacaoGovernador(Integer idvotacaogovernador) {
        this.idvotacaogovernador = idvotacaogovernador;
    }

    public VotacaoGovernador(Integer idvotacaogovernador, int idgovernador, int votocomputadogovernador, int votobrancogovernador, int votonulogovernador) {
        this.idvotacaogovernador = idvotacaogovernador;
        this.idgovernador = idgovernador;
        this.votocomputadogovernador = votocomputadogovernador;
        this.votobrancogovernador = votobrancogovernador;
        this.votonulogovernador = votonulogovernador;
    }

    public Integer getIdvotacaogovernador() {
        return idvotacaogovernador;
    }

    public void setIdvotacaogovernador(Integer idvotacaogovernador) {
        this.idvotacaogovernador = idvotacaogovernador;
    }

    public int getIdgovernador() {
        return idgovernador;
    }

    public void setIdgovernador(int idgovernador) {
        this.idgovernador = idgovernador;
    }

    public int getVotocomputadogovernador() {
        return votocomputadogovernador;
    }

    public void setVotocomputadogovernador(int votocomputadogovernador) {
        this.votocomputadogovernador = votocomputadogovernador;
    }

    public int getVotobrancogovernador() {
        return votobrancogovernador;
    }

    public void setVotobrancogovernador(int votobrancogovernador) {
        this.votobrancogovernador = votobrancogovernador;
    }

    public int getVotonulogovernador() {
        return votonulogovernador;
    }

    public void setVotonulogovernador(int votonulogovernador) {
        this.votonulogovernador = votonulogovernador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvotacaogovernador != null ? idvotacaogovernador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VotacaoGovernador)) {
            return false;
        }
        VotacaoGovernador other = (VotacaoGovernador) object;
        if ((this.idvotacaogovernador == null && other.idvotacaogovernador != null) || (this.idvotacaogovernador != null && !this.idvotacaogovernador.equals(other.idvotacaogovernador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Votacaogovernador[ idvotacaogovernador=" + idvotacaogovernador + " ]";
    }
    
}
