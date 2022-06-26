package org.xpdojo.bank;

public class WithDrawal {
    public double amount;

    public WithDrawal(  ){
    }
    public double balance( double withdrawAmount, double currentBalance) {
        if( currentBalance < withdrawAmount)
            return currentBalance;

        double balance = currentBalance - withdrawAmount;
        return balance;
    }



}
