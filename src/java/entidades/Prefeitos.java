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
@Table(name = "PREFEITOS")
@NamedQueries({
    @NamedQuery(name = "Prefeitos.findAll", query = "SELECT p FROM Prefeitos p")
    , @NamedQuery(name = "Prefeitos.findByIdprefeito", query = "SELECT p FROM Prefeitos p WHERE p.idprefeito = :idprefeito")
    , @NamedQuery(name = "Prefeitos.findByIdpessoa", query = "SELECT p FROM Prefeitos p WHERE p.idpessoa = :idpessoa")
    , @NamedQuery(name = "Prefeitos.findByIdpartido", query = "SELECT p FROM Prefeitos p WHERE p.idpartido = :idpartido")
    , @NamedQuery(name = "Prefeitos.findByNumprefeito", query = "SELECT p FROM Prefeitos p WHERE p.numprefeito = :numprefeito")
    , @NamedQuery(name = "Prefeitos.findByViceprefeito", query = "SELECT p FROM Prefeitos p WHERE p.viceprefeito = :viceprefeito")
    , @NamedQuery(name = "Prefeitos.findBySloganprefeito", query = "SELECT p FROM Prefeitos p WHERE p.sloganprefeito = :sloganprefeito")})
public class Prefeitos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPREFEITO")
    
    //Um Prefeito só pode estar vinculado à um partido
    @OneToOne
    private Partidos partidoPrefeito;
    
    //Um voto só pode estar vinculado à um (ou nenhum) candidato
    @OneToOne
    private VotacaoPrefeito votosParaPrefeito;
    
    //Um prefeito pode ser somente uma pessoa
    @OneToOne
    private Pessoas pessoaPrefeito;
    
    private Integer idprefeito;
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
    @Column(name = "NUMPREFEITO")
    private int numprefeito;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 90)
    @Column(name = "VICEPREFEITO")
    private String viceprefeito;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "SLOGANPREFEITO")
    private String sloganprefeito;

    public Prefeitos() {
    }

    public Prefeitos(Integer idprefeito) {
        this.idprefeito = idprefeito;
    }

    public Prefeitos(Integer idprefeito, int idpessoa, int idpartido, int numprefeito, String viceprefeito, String sloganprefeito) {
        this.idprefeito = idprefeito;
        this.idpessoa = idpessoa;
        this.idpartido = idpartido;
        this.numprefeito = numprefeito;
        this.viceprefeito = viceprefeito;
        this.sloganprefeito = sloganprefeito;
    }

    public Integer getIdprefeito() {
        return idprefeito;
    }

    public void setIdprefeito(Integer idprefeito) {
        this.idprefeito = idprefeito;
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

    public int getNumprefeito() {
        return numprefeito;
    }

    public void setNumprefeito(int numprefeito) {
        this.numprefeito = numprefeito;
    }

    public String getViceprefeito() {
        return viceprefeito;
    }

    public void setViceprefeito(String viceprefeito) {
        this.viceprefeito = viceprefeito;
    }

    public String getSloganprefeito() {
        return sloganprefeito;
    }

    public void setSloganprefeito(String sloganprefeito) {
        this.sloganprefeito = sloganprefeito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprefeito != null ? idprefeito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prefeitos)) {
            return false;
        }
        Prefeitos other = (Prefeitos) object;
        if ((this.idprefeito == null && other.idprefeito != null) || (this.idprefeito != null && !this.idprefeito.equals(other.idprefeito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Prefeitos[ idprefeito=" + idprefeito + " ]";
    }
    
}
