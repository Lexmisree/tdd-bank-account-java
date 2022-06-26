package org.xpdojo.bank;

import java.util.Date;

public class Account {
    public String accountNo;
    public String accountName;
    public double balance;
    public Date accountDate;
    public String transactionType;


    public void currentBalance( String transactionType, double amount){
        if( ! transactionType.equalsIgnoreCase("DEPOSIT")){
            WithDrawal withdraw = new WithDrawal();
            this.balance = withdraw.balance( amount, this.balance);
        }
        Deposit deposit = new Deposit();
        this.balance = deposit.balance( amount, this.balance);

    }



}
