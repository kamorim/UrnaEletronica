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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Kin Amorim
 */
@Entity
@Table(name = "PARTIDOS")
@NamedQueries({
    @NamedQuery(name = "Partidos.findAll", query = "SELECT p FROM Partidos p")
    , @NamedQuery(name = "Partidos.findByIdpartido", query = "SELECT p FROM Partidos p WHERE p.idpartido = :idpartido")
    , @NamedQuery(name = "Partidos.findByNomepartido", query = "SELECT p FROM Partidos p WHERE p.nomepartido = :nomepartido")
    , @NamedQuery(name = "Partidos.findBySiglapartido", query = "SELECT p FROM Partidos p WHERE p.siglapartido = :siglapartido")
    , @NamedQuery(name = "Partidos.findByNumeropartido", query = "SELECT p FROM Partidos p WHERE p.numeropartido = :numeropartido")})
public class Partidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    int idPartido;
    
    @Basic(optional = false)
    @NotNull
    
    //Chave estrangeira dos candidatos
    @OneToMany
    private Presidentes candidadoPresidente;
    private Governadores candidatoGovernador;
    private Prefeitos candidatoPrefeito;
    
    @Column(name = "IDPARTIDO")
    private Integer idpartido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 90)
    @Column(name = "NOMEPARTIDO")
    private String nomepartido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "SIGLAPARTIDO")
    private String siglapartido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMEROPARTIDO")
    private int numeropartido;

    public Partidos() {
    }

    public Partidos(Integer idpartido) {
        this.idpartido = idpartido;
    }

    public Partidos(Integer idpartido, String nomepartido, String siglapartido, int numeropartido) {
        this.idpartido = idpartido;
        this.nomepartido = nomepartido;
        this.siglapartido = siglapartido;
        this.numeropartido = numeropartido;
    }

    public Integer getIdpartido() {
        return idpartido;
    }

    public void setIdpartido(Integer idpartido) {
        this.idpartido = idpartido;
    }

    public String getNomepartido() {
        return nomepartido;
    }

    public void setNomepartido(String nomepartido) {
        this.nomepartido = nomepartido;
    }

    public String getSiglapartido() {
        return siglapartido;
    }

    public void setSiglapartido(String siglapartido) {
        this.siglapartido = siglapartido;
    }

    public int getNumeropartido() {
        return numeropartido;
    }

    public void setNumeropartido(int numeropartido) {
        this.numeropartido = numeropartido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpartido != null ? idpartido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partidos)) {
            return false;
        }
        Partidos other = (Partidos) object;
        if ((this.idpartido == null && other.idpartido != null) || (this.idpartido != null && !this.idpartido.equals(other.idpartido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Partidos[ idpartido=" + idpartido + " ]";
    }
    
}
