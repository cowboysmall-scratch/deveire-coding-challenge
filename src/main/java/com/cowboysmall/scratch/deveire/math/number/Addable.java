package com.cowboysmall.scratch.deveire.math.number;

import java.math.BigDecimal;
import java.util.Objects;

public class Addable extends Number {

    private final BigDecimal value;


    //_________________________________________________________________________

    public Addable(Number number) {

        value = new BigDecimal(number.toString()).stripTrailingZeros();
    }


    //_________________________________________________________________________

    public Addable add(Addable addable) {

        return new Addable(value.add(addable.value));
    }

    //_________________________________________________________________________

    @Override
    public boolean equals(Object o) {

        Addable addable = (Addable) o;
        return Objects.equals(value, addable.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }

    @Override
    public String toString() {

        return value.toString();
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
