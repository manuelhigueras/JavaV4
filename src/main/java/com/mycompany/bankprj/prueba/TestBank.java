/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankprj.prueba;

import com.mycompany.bankprj.dominio.Account3;
import com.mycompany.bankprj.dominio.OverdraftException;
import com.mycompany.bankprj.dominio.SavingsAccount;
import com.mycompany.bankprj.dominio.checkingAccount;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TestBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Account3 cuenta = new Account3(10_000);
       checkingAccount guarda = new checkingAccount(800, 5);
        try {
            cuenta.getDeposit(10);
            guarda.Withdraw(99999999);
            //cuenta.getWithdraw(10_451);
            //cuenta.getDeposit(-15);
            
        } catch (OverdraftException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
