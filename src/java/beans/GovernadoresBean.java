/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Kin Amorim
 */
@Named(value = "governadoresBean")
@Dependent
public class GovernadoresBean {

    /**
     * Creates a new instance of GovernadoresBean
     */
    public GovernadoresBean() {
    }
    
}
