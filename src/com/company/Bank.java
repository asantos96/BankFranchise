package com.company;

import java.util.Scanner;

public class Bank {
    //Assigning properties
    private String name;
    private double cashInVault;

    //Deposit Method
    public void deposit(double userDeposit){

        System.out.println ("Santos Bank thanks you for banking with us! You have deposited $ " + userDeposit +
                " bringing your total account to $ " + (userDeposit + cashInVault));
        setCashInVault(userDeposit + cashInVault);
        }
    //Withdrawl Method
    public void withdrawl(double userWithdrawl) {


        System.out.println("Santos Bank thanks you for banking with us! You have withdrawn $ " + userWithdrawl +
                " bringing your total account to $ " + (cashInVault - userWithdrawl));
        setCashInVault(cashInVault - userWithdrawl);
        }

    //Setter for name
    public void setName (String name1) {
        name = name1;
    }
    //Getter for name
    public String getName(){
        return name;
    }
    //Setter for cashInVault
    public void setCashInVault (double cashInVault1) {
        cashInVault = cashInVault1;
    }
    //Getter for cashInVault
    public double getCashInVault(){
        return cashInVault;
    }
}
