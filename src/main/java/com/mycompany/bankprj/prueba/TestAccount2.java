/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankprj.prueba;

import com.mycompany.bankprj.dominio.Account;

/**
 * 
 * Clase que representa un Vehiculo de una flota de transporte 
 * el vehiculo transporta cajas y tiene un peso maximo permitido
 * que no podemos sobrepasar al cargar las cajas..
 * 
 * @author user - @version 1.0
 * 
 */

public class TestAccount2 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        double var, necesito;
        
        Account person = new Account(100);

        person.getDeposit(200);
        
        person.getWithdraw(20);
        
        person.getDeposit(100);

        var = person.getBalance();
        
        System.out.println("Tienes en tu cuenta " + var + "$.");
        
        //1. extrae import negativo   
        necesito = 100;
        person.getWithdraw(necesito);
        
        //2. extrae import saldo suficiente
        necesito = 100;
        person.getWithdraw(necesito);
        
        System.out.println(person.toString());
        
        
    }
    
}
