/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.jar.Pack200;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import negocio.UsuarioService;

/**
 *
 * @author Kin Amorim
 */
@ManagedBean
@SessionScoped
public class LoginBean {
    
    private int cpf;
    private String senha;
    private Boolean usuarioLogado = false; //Variavel que mantem o estado da sessao do usuario: se esta logado ou nao.
    private UsuarioService usuarioService = new UsuarioService();
    public LoginBean() {
    }
    
    public String logar() {
        
        if(usuarioService.usuarioReadyToLogin(cpf, senha)) {            
            //Seta para true a variavel (utilizada no LoginFilter)
            usuarioLogado = true; 
            
            //Imprime no log do servidor (o mesmo que System.out.println())
            Logger.getLogger(getClass().getName()).info("Usuario logado com sucesso!");
            
            //Login com sucesso, redireciona o usuario para a tela de CRUD de Professor
            return "paginaVotacao";
            
        }
        else {            
            //Seta para false a variavel (utilizada no LoginFilter)
            usuarioLogado = false;
            this.senha = "";
            
            //Imprime no log do servidor (o mesmo que System.out.println())
            Logger.getLogger(getClass().getName()).info("Usuário ou senha inválidos!");
            //Cria uma nova mensagem a ser adiconada na tela
            String msg = "Erro no Login";
            
            //Login falhou: continua na pagina inicial (index.xhtml)
            return "/index"; 
        }
        
    }
    

    public int getLogin() {
        return cpf;
    }

    public void setLogin(int cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getEstaLogado() {
        return usuarioLogado;
    }

    public void setEstaLogado(Boolean estaLogado) {
        this.usuarioLogado = estaLogado;
    }
    
}
