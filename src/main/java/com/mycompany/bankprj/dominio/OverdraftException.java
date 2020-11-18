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
public class OverdraftException extends Exception{
    private final double deficit;
    
    public OverdraftException(String mensaje, double deficit){
        super(mensaje);
        this.deficit=deficit;
    }
    
    public double getDeficit() {
        return deficit;
    }
    
}
