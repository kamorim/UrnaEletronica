/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Prefeitos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Kin Amorim
 */
public class PrefeitoService {
    
     EntityManager em = Persistence.createEntityManagerFactory("PrefeitosJpaPU").createEntityManager();
     
     public List<Prefeitos> buscarTodosOsPrefeitos() {
        Query consulta = em.createQuery("SELECT idpessoa, nomePessoa, sobrenomePessoa FROM Pessoas p WHERE idPessoa >= 18 AND idPessoa <= 23;");
        List<Prefeitos> prefeitos = consulta.getResultList();
        return prefeitos;
    
}
}
