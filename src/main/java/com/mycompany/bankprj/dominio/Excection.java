/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankprj.dominio;

/**
 *
 * @author user
 */
public class Excection  extends Exception{

    private String mensaje;
    
    public Excection(String mensaje) {
        super(mensaje);
    }

    public String getMensaje() {
        return mensaje;
    }
    
}
