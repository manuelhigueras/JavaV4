/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankprj.prueba;

import com.mycompany.bankprj.dominio.Customer;
import com.mycompany.bankprj.dominio.Account;

public class TestCustomer {

    public static void main(String[] args) {
        
        /*
        *Creo un nuevo objeto Customer cuya var de referencia se llamara cliente.
        *Al crearla con este constructor, ademas de inicialiazar nombre y apellido, 
        *crea mediante un new un nuevo objeto account con un saldo 0.0
        *Account con saldo 0.0 
        */
        
        
        Customer cliente = new Customer("Laura", "Roca");
        
        System.out.println("...Datos del cliente...");
        System.out.println("Nombre:" + cliente.getFirstName());
        System.out.println("Apellido:"+ cliente.getLastName());
        System.out.println("Saldo actual:" + cliente.getAccount().getBalance());

        System.out.println("...Nuevos datos del cliente...");
        System.out.println("Nombre:" + cliente.getFirstName());
        System.out.println("Apellido:"+ cliente.getLastName());
        cliente.getAccount().getDeposit(200);
        cliente.getAccount().getWithdraw(120);
        System.out.println("Saldo actual:" + cliente.getAccount().getBalance());
        
        Account nueva = new Account(1000);
        cliente.setAccount(nueva);
        
    }
    
}
