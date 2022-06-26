package org.xpdojo.bank;

import org.xpdojo.utils.Currency;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
    double amount;
    Currency currencyType;

    public Money( double amount, Currency currencyType){
        this.amount = amount * dollarValue( currencyType);
        this.currencyType = currencyType;
    }

    public double dollarValue( Currency currencyType){

        return currencyType.getValue( currencyType);
    }


}
