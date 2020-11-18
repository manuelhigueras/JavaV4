/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankprj.dominio;

public class Customer3 {
    
    //ATRIBUTO
    private String firstName, lastName;
    private Account account; //null
    
    //CONSTRUCTOR
    public Customer3() {
        this.firstName = "";
        this.lastName = "";
        this.account = null;
    }
    
    public Customer3(String nombre, String apellido) {
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

    public void generateReport() {// Imprimir encabezado del informe
        System.out.println("CUSTOMERS REPORT");
        System.out.println("================");
        // Para cada cliente...
        for ( int cust_idx = 0;cust_idx < Bank.getNumberOfCustomer(); cust_idx++ ) {
            Customer customer = Bank.getCustomer(cust_idx);
        }// y así sucesivamente}}
    }
    
}