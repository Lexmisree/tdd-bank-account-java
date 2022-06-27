package org.xpdojo.bank;

public class Deposit {

   public Deposit( ){

    }

    public double balance( double depositAmount, double currentBalance){
        return depositAmount + currentBalance;
    }
}
