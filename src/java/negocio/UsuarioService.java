/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import static com.sun.xml.ws.security.addressing.impl.policy.Constants.logger;
import entidades.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Kin Amorim
 */
public class UsuarioService {
    EntityManager em = Persistence.createEntityManagerFactory("UrnaEletronicaJpaPU").createEntityManager();
    
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

