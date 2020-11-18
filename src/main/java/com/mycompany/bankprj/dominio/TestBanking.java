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
public class TestBanking {
    public static void main(String[] args) {
        Customer persona = new Customer("Luis", "Sanchez");
        SavingsAccount bal = new SavingsAccount(500, 3);
        
        Customer persona2 = new Customer("Luis", "Sanchez");
        SavingsAccount bal2 = new SavingsAccount(500, 0);
        
        Customer persona3 = new Customer("Luis", "Sanchez");
        SavingsAccount bal3 = new SavingsAccount(500, 3);
        
        bal.getWithdraw(150);
        bal.getDeposit(22.50);
        bal.getWithdraw(447.62);
        bal.getBalance();
        
        bal2.getWithdraw(550);
        bal2.getWithdraw(47.62);
        bal2.getDeposit(22.50);
        bal2.getBalance();
        
        bal3.getWithdraw(550);
        bal3.getDeposit(150);
        
    }
}
