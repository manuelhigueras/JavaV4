/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankprj.dominio;

public class Customer {
    
    //ATRIBUTO
    private String firstName, lastName;
    private Account account; //null
    
    //CONSTRUCTOR
    public Customer() {
        this.firstName = "";
        this.lastName = "";
        this.account = null;
    }
    
    public Customer(String nombre, String apellido) {
        this.firstName = nombre;
        this.lastName = apellido;
        this.account = new Account(0);
    }
    
    public Customer(String nombre, String apellido, int monto) {
        this.firstName = nombre;
        this.lastName = apellido;
        this.account = new Account(monto);
    }
    
    //METODOS 
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
