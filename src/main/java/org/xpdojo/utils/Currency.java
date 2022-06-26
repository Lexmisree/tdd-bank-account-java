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
        return currency.conversionRate;
    }


}
