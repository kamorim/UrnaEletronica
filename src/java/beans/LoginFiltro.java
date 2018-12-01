/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// https://www.caelum.com.br/apostila-java-web/recursos-importantes-filtros/#reduzindo-o-acoplamento-com-filtros
//https://www.devmedia.com.br/trabalhando-com-sessao-e-filter-em-jsf/32358
//https://www.concretepage.com/java-ee/jsp-servlet/how-to-use-filter-in-servlet-3-with-webfilter-annotation

package beans;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@javax.servlet.annotation.WebFilter
/**
 *
 * @author Kin Amorim
 */
    //@WebFilter("/loginFiltro") 
        public abstract class LoginFiltro implements Filter { 
    
            public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException { 
                throws IOException, ServletException {
                
                LoginBean loginBean = (LoginBean) ((HttpServletRequest)req).getSession().getAttribute("loginBean");
                
                if (loginBean == null || !loginBean.logar()) {
                    String contextPath = ((HttpServletRequest)req).getContextPath();
                    ((HttpServletResponse)res).sendRedirect(contextPath + "/webapp/index.xhtml");
                }
                       chain.doFilter(req, res);
            } 
        }
}