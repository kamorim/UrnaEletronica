/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import static com.sun.xml.ws.security.addressing.impl.policy.Constants.logger;
import entidades.Pessoas;
import entidades.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Kin Amorim
 */
public class UsuarioService {
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("UrnaEletronicaJpaPU");
    
    EntityManager entityManager = factory.createEntityManager();

    public void insereUsuario(String nomepessoa, String sobrenomepessoa, Integer idusuario, int idpessoa, String cpfusuario, 
            String telusuario, String emailusuario) {
 
    Usuarios usuario = new Usuarios(idusuario);
    Pessoas pessoa = new Pessoas (idpessoa);
    
    pessoa.setIdpessoa(idpessoa);   
    pessoa.setNomepessoa(nomepessoa);
    pessoa.setSobrenomepessoa(sobrenomepessoa);
    usuario.setIdusuario(idusuario);  
    usuario.setCpfusuario(cpfusuario);
    usuario.setTelusuario(telusuario);
    
    entityManager.persist(usuario);
    entityManager.persist(pessoa);
 
    Usuarios usuarioPesquisado = entityManager.find(Usuarios.class, idusuario);
}    
    
    // copiado do prof EntityManager em = Persistence.createEntityManagerFactory("UrnaEletronicaJpaPU").createEntityManager();
    
    TypedQuery<Usuarios> consulta = Usuarios.createQuery("SELECT art FROM Artigo art", Usuarios.class);
    // ver como é a classe e tal: https://www.devmedia.com.br/definindo-entity-manager-na-java-persistence-api/28271
 
    List<Usuarios> usuarios = consulta.getResultList();
    
     public boolean usuarioReadyToLogin(int cpf, String senha) {
             try {
                    String cpfUsuario = String.valueOf(cpf);
                    logger.info("Verificando CPF do usuário " + cpfUsuario);
                    List retorno = Usuarios.findByCPFeSenha(
                                  Usuarios.FIND_BY_CPF_SENHA,
                                  new NamedParams("cpf", cpfUsuario,
                                          "senha", senha));
  
                    if (retorno.size() == 1) {
                           Usuarios userFound = (Usuarios) retorno.get(0);
                           return true;
                    }
  
                    return false;
             } catch (DAOException e) {
                    e.printStackTrace();
                    throw new BOException(e.getMessage());
             }
       }

}

