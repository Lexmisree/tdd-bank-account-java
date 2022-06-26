package org.xpdojo.utils;

public enum Currency {
    USD( 1.0 ),
    EUR( 0.95),
    INR( 78.23),
    JPY( 135.17);

    public final double conversionRate;

    private Currency(double conversionRate){
        this.conversionRate = conversionRate;
    }

    public double getValue( Currency currency){
        //Currency currency = getCurrencyType( currencyType);
        return currency.conversionRate;
    }

    private Currency getCurrencyType( String currencyType){
        Currency currency;
        switch ( currencyType){
            case "EUR": currency = Currency.EUR;
                        break;
            case "INR": currency = Currency.INR;
                        break;
            case "JPY": currency = Currency.JPY;
                        break;
            default:    currency = Currency.USD;
                        break;
        }
        return currency;
    }

}
