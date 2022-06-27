package org.xpdojo.bank;

import org.xpdojo.utils.Currency;

import java.util.Date;

public class Account {
    public String accountNo;
    public String accountName;
    public Money savings;
    public String transactionType;
    public Currency currencyType;

    public Account( String accountNo, String accountName, double currentAmount, Currency currencyType,
                    String transactionType, Date transactionDate ){
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.savings = new Money( currentAmount, currencyType, transactionType, transactionDate);
    }

    public void addAmount( double newAmount, Currency currency, String transactionType, Date transactionDate){
        System.out.println("Current Blance in acount "+this.savings.balance);
        this.savings = new Money( this.savings.balance , newAmount, currency, transactionType, transactionDate);
    }

}
