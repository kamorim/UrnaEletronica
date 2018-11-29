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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Kin Amorim
 */
@Entity
@Table(name = "GOVERNADORES")
@NamedQueries({
    @NamedQuery(name = "Governadores.findAll", query = "SELECT g FROM Governadores g")
    , @NamedQuery(name = "Governadores.findByIdgovernador", query = "SELECT g FROM Governadores g WHERE g.idgovernador = :idgovernador")
    , @NamedQuery(name = "Governadores.findByIdpessoa", query = "SELECT g FROM Governadores g WHERE g.idpessoa = :idpessoa")
    , @NamedQuery(name = "Governadores.findByIdpartido", query = "SELECT g FROM Governadores g WHERE g.idpartido = :idpartido")
    , @NamedQuery(name = "Governadores.findByNumcandidatogovernador", query = "SELECT g FROM Governadores g WHERE g.numcandidatogovernador = :numcandidatogovernador")
    , @NamedQuery(name = "Governadores.findByVicegovernador", query = "SELECT g FROM Governadores g WHERE g.vicegovernador = :vicegovernador")
    , @NamedQuery(name = "Governadores.findBySlogangovernador", query = "SELECT g FROM Governadores g WHERE g.slogangovernador = :slogangovernador")
    , @NamedQuery(name = "Governadores.exibirGovernadores", query = "SELECT gov.numcandidatogovernador, p.nomepessoa, p.sobrenomepessoa FROM pessoas p JOIN governadores gov ON (p.IDPESSOA = gov.IDPESSOA)")})

public class Governadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGOVERNADOR")
    
    //Um Governador só pode estar vinculado à um partido
    @OneToOne
    private Partidos partidoGovernador;
    
     //Um voto só pode estar vinculado à um (ou nenhum) candidato
    @OneToOne
    private VotacaoGovernador votosParaGovernador;
    
    //Um governador pode ser somente uma pessoa
    @OneToOne
    private Pessoas pessoaGovernador;
    
    private Integer idgovernador;
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
    @Column(name = "NUMCANDIDATOGOVERNADOR")
    private int numcandidatogovernador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 90)
    @Column(name = "VICEGOVERNADOR")
    private String vicegovernador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "SLOGANGOVERNADOR")
    private String slogangovernador;

    public Governadores() {
    }

    public Governadores(Integer idgovernador) {
        this.idgovernador = idgovernador;
    }

    public Governadores(Integer idgovernador, int idpessoa, int idpartido, int numcandidatogovernador, String vicegovernador, String slogangovernador) {
        this.idgovernador = idgovernador;
        this.idpessoa = idpessoa;
        this.idpartido = idpartido;
        this.numcandidatogovernador = numcandidatogovernador;
        this.vicegovernador = vicegovernador;
        this.slogangovernador = slogangovernador;
    }

    public Integer getIdgovernador() {
        return idgovernador;
    }

    public void setIdgovernador(Integer idgovernador) {
        this.idgovernador = idgovernador;
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

    public int getNumcandidatogovernador() {
        return numcandidatogovernador;
    }

    public void setNumcandidatogovernador(int numcandidatogovernador) {
        this.numcandidatogovernador = numcandidatogovernador;
    }

    public String getVicegovernador() {
        return vicegovernador;
    }

    public void setVicegovernador(String vicegovernador) {
        this.vicegovernador = vicegovernador;
    }

    public String getSlogangovernador() {
        return slogangovernador;
    }

    public void setSlogangovernador(String slogangovernador) {
        this.slogangovernador = slogangovernador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgovernador != null ? idgovernador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Governadores)) {
            return false;
        }
        Governadores other = (Governadores) object;
        if ((this.idgovernador == null && other.idgovernador != null) || (this.idgovernador != null && !this.idgovernador.equals(other.idgovernador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Governadores[ idgovernador=" + idgovernador + " ]";
    }
    
}
