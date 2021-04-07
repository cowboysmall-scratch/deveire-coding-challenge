package com.cowboysmall.scratch.deveire.math.number;

import java.math.BigDecimal;

public class AddableBigDecimal extends AddableNumber<BigDecimal> {

    private final BigDecimal value;

    public AddableBigDecimal(BigDecimal value) {

        this.value = value;
    }


    //_________________________________________________________________________

    @Override
    public AddableNumber<BigDecimal> add(AddableNumber<BigDecimal> addableNumber) {

        return new AddableBigDecimal(value.add(addableNumber.getValue()));
    }

    @Override
    public BigDecimal getValue() {

        return value;
    }


    //_________________________________________________________________________

    @Override
    public int intValue() {

        return value.intValue();
    }

    @Override
    public long longValue() {

        return value.longValue();
    }

    @Override
    public float floatValue() {

        return value.floatValue();
    }

    @Override
    public double doubleValue() {

        return value.doubleValue();
    }
}
