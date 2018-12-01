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
import javax.persistence.Transient;
import javax.persistence.TypedQuery;
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
    , @NamedQuery(name = "Usuarios.findByIdusuario", query = "SELECT u FROM Usuarios u WHERE u.idusuario = :idusuario")
    , @NamedQuery(name = "Usuarios.findByIdpessoa", query = "SELECT u FROM Usuarios u WHERE u.idpessoa = :idpessoa")
    , @NamedQuery(name = "Usuarios.findBySenha", query = "SELECT u FROM Usuarios u WHERE u.senha = :senha")
    , @NamedQuery(name = "Usuarios.findByCpfusuario", query = "SELECT u FROM Usuarios u WHERE u.cpfusuario = :cpfusuario")
    , @NamedQuery(name = "Usuarios.findByTelusuario", query = "SELECT u FROM Usuarios u WHERE u.telusuario = :telusuario")
    , @NamedQuery(name = "Usuarios.findByEmailusuario", query = "SELECT u FROM Usuarios u WHERE u.emailusuario = :emailusuario")})
    //, @NamedQuery(name = "Usuario.findByCpfusuario", query = "SELECT u FROM Usuarios u WHERE u.cpfusuario = :cpf AND u.senha = :senha")})

public class Usuarios implements Serializable {

    @Transient
    public static final String FIND_BY_CPF_SENHA = "Usuarios.findByCpfusuario";   
    
    private static final long serialVersionUID = 1L;

    public static TypedQuery<Usuarios> createQuery(String select_art_FROM_Artigo_art, Class<Usuarios> aClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Id
    int idUsuario;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUSUARIO")
    
    //Um usuário pode ser somente uma pessoa
    @OneToOne
    private Pessoas pessoaUsuario;
    
    private Integer idusuario;
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
    @Column(name = "TELUSUARIO")
    private String telusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "EMAILUSUARIO")
    private String emailusuario;

    public Usuarios() {
    }

    public Usuarios(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Usuarios(Integer idusuario, int idpessoa, String cpfusuario, String telusuario, String emailusuario) {
        this.idusuario = idusuario;
        this.idpessoa = idpessoa;
        this.cpfusuario = cpfusuario;
        this.telusuario = telusuario;
        this.emailusuario = emailusuario;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
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

    public String getTelusuario() {
        return telusuario;
    }

    public void setTelusuario(String telusuario) {
        this.telusuario = telusuario;
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
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Usuarios[ idusuario=" + idusuario + " ]";
    }
    
}
