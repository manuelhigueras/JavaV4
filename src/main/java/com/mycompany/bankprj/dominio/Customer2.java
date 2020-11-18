/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankprj.dominio;

public class Customer2{
    
    //ATRIBUTO
    private String firstName, lastName;
    private Account account; //null
    
    //CONSTRUCTOR
    public Customer2() {
        this.firstName = "";
        this.lastName = "";
        this.account = null;
    }
    
    public Customer2(String nombre, String apellido) {
        this.firstName = nombre;
        this.lastName = apellido;
        this.account = new Account(0);
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
