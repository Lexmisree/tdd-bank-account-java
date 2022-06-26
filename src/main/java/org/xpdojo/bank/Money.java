package org.xpdojo.bank;

import org.xpdojo.utils.Currency;

import java.util.Date;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
    double balance;
    Currency currencyType;
    Date transactionDate;

    public Money( double amount, Currency currencyType, String transactionType, Date transactionDate){
        double transactionAmount = amount * dollarValue( currencyType);
        currentBalance( transactionType, transactionAmount);
        this.transactionDate = transactionDate;
    }

    public Money( double existingAmount, double amount, Currency currencyType, String transactionType, Date transactionDate){
        double transactionAmount = existingAmount + (amount * dollarValue( currencyType));
        currentBalance( transactionType, transactionAmount);
        this.transactionDate = transactionDate;
    }

    public double dollarValue( Currency currencyType){
        System.out.println("Currec" + currencyType);
        return currencyType.getValue( currencyType);
    }



    public void currentBalance( String transactionType, double amount){
        if( ! transactionType.equalsIgnoreCase("DEPOSIT")){
            WithDrawal withdraw = new WithDrawal();
            this.balance = withdraw.balance( amount, this.balance);
        }
        Deposit deposit = new Deposit();
        System.out.println("balance is "+this.balance);
        this.balance =  deposit.balance( amount, this.balance);

    }


}
