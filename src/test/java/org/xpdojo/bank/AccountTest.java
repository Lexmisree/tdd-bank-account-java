package org.xpdojo.bank;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.xpdojo.utils.Currency;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	//@Disabled
    public void depositAnAmountToIncreaseTheBalance() {

        Account account1 = new Account("100001","AAAA1",5000.00, Currency.USD,
                "DEPOSIT", new Date());
        double initialAmount = account1.savings.balance;
        System.out.println("initialAmount "+initialAmount);
        account1.addAmount( 10000.00, Currency.USD, "DEPOSIT", new Date());
        double newAmount =  account1.savings.balance;
        System.out.println("new currentAmount "+newAmount);
        double expectedAmount = 15000.00;
        assertThat( expectedAmount == newAmount);

    }
}
