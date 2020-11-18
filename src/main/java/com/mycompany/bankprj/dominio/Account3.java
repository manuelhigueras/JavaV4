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

public class Account3 {
    //Atributo
    private double total;
    
    //public double balance;
    private double balance, amt;
    
    //Constructor basico
    public Account3(){
        this.balance = 0;
    }
    
    //Constructor sobrecargado
    /**
    * Constructor sobrecargado. De la cuenta 
    */
    public Account3(double initbalance){
        this.balance = initbalance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void getDeposit(double amt) throws OverdraftException{
        if(amt == 0)
            System.out.println("Atencion!! Debe indicar un importe mayor que cero.");
        if(amt > 0){
            this.balance += amt;
            System.out.println("Has depositado " + amt);
        }    
        else{ 
            //Mensaje de THROWS
            this.balance = 0;
            throw new OverdraftException("!!!!NO PUEDES TENER SALDO NEGATIVO|||||", 0);
           // System.out.print("!!!!NO PUEDES TENER SALDO NEGATIVO|||||");
            
        }
    }
    
    /*public double setDeposit(double amt){
        return amt;
    }*/
    
    public void getWithdraw(double amt) throws OverdraftException{
        if(amt > 0 && balance >= amt){
            this.balance = this.balance -amt;
            System.out.println("Has retirado " + amt);
        }
        else{
           throw new OverdraftException("Insufficient funds", amt - balance);
            //System.out.println("No puedes retirar, no tienes dinero.");
        }
    }
    
    /*public double setWithdraw(){
        total = balance - (balance + amt);
        return total;
    }*/
    
    //Sobreescritura del toString()
    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + '}';
    }
    
    //1. extrae import negativo
    //2. extrae import saldo suficiente
    //3. extrae import sin saldo suficiente
    
}