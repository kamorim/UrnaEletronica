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
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Kin Amorim
 */
@Entity
@Table(name = "USUARIOS")
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findByIsuduario", query = "SELECT u FROM Usuarios u WHERE u.isuduario = :isuduario")
    , @NamedQuery(name = "Usuarios.findByIdpessoa", query = "SELECT u FROM Usuarios u WHERE u.idpessoa = :idpessoa")
    , @NamedQuery(name = "Usuarios.findByCpfusuario", query = "SELECT u FROM Usuarios u WHERE u.cpfusuario = :cpfusuario")
    , @NamedQuery(name = "Usuarios.findByTeelefoneusuario", query = "SELECT u FROM Usuarios u WHERE u.teelefoneusuario = :teelefoneusuario")
    , @NamedQuery(name = "Usuarios.findByEmailusuario", query = "SELECT u FROM Usuarios u WHERE u.emailusuario = :emailusuario")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ISUDUARIO")
    
    //Um usuário pode ser somente uma pessoa
    @OneToOne
    private Pessoas pessoaUsuario;
    
    private Integer isuduario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPESSOA")
    private int idpessoa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "CPFUSUARIO")
    private String cpfusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "TEELEFONEUSUARIO")
    private String teelefoneusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "EMAILUSUARIO")
    private String emailusuario;

    public Usuarios() {
    }

    public Usuarios(Integer isuduario) {
        this.isuduario = isuduario;
    }

    public Usuarios(Integer isuduario, int idpessoa, String cpfusuario, String teelefoneusuario, String emailusuario) {
        this.isuduario = isuduario;
        this.idpessoa = idpessoa;
        this.cpfusuario = cpfusuario;
        this.teelefoneusuario = teelefoneusuario;
        this.emailusuario = emailusuario;
    }

    public Integer getIsuduario() {
        return isuduario;
    }

    public void setIsuduario(Integer isuduario) {
        this.isuduario = isuduario;
    }

    public int getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getCpfusuario() {
        return cpfusuario;
    }

    public void setCpfusuario(String cpfusuario) {
        this.cpfusuario = cpfusuario;
    }

    public String getTeelefoneusuario() {
        return teelefoneusuario;
    }

    public void setTeelefoneusuario(String teelefoneusuario) {
        this.teelefoneusuario = teelefoneusuario;
    }

    public String getEmailusuario() {
        return emailusuario;
    }

    public void setEmailusuario(String emailusuario) {
        this.emailusuario = emailusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isuduario != null ? isuduario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.isuduario == null && other.isuduario != null) || (this.isuduario != null && !this.isuduario.equals(other.isuduario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Usuarios[ isuduario=" + isuduario + " ]";
    }
    
}
