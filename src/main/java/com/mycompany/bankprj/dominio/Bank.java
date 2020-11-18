/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankprj.dominio;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bank {
    private static Customer[] customers;
    private static int numberOfCustomers;

    static{
        customers = new Customer[10];
        numberOfCustomers = 0;
    }
    
    private Bank() {
        this.customers = null;
        this.numberOfCustomers = 0;
    }
    
    public static Customer[] addCustomer(String f, String l){
     
        int cont = 0;
        int monto;
        String nombre, apellido;
        Scanner sc = new Scanner(System.in);
        
        while(cont < 5){
            System.out.println("Introduce una cuenta: ");
            nombre = sc.next();
            System.out.println("Introduce una cuenta: ");
            apellido = sc.next();
            System.out.println("Introduce una cuenta: ");
            monto = sc.nextInt();
            customers[cont] = new Customer(nombre, apellido, monto);
            cont++;
        }
        
        return customers;
        
    }

    public static Customer[] getCustomers() {
        return customers;
    }

    public static int getNumberOfCustomer() {
        return numberOfCustomers;
    }
    
    public static Customer getCustomer(int customer_index){
        return customers[customer_index];
    }
    
    public static void addCustomer2(String f, String l) {
        int i = numberOfCustomers++;
        customers[i] = new Customer(f, l);
    }
    
}
