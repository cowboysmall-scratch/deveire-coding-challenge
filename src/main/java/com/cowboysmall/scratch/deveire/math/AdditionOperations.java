package com.cowboysmall.scratch.deveire.math;

import com.cowboysmall.scratch.deveire.math.number.Addable;

import java.math.BigDecimal;


public class AdditionOperations {

    public static Addable add(Addable a, Addable b) {

        return a.add(b);
    }

    public static Number add(Number a, Number b) {

        BigDecimal aa = new BigDecimal(a.toString());
        BigDecimal bb = new BigDecimal(b.toString());
        return aa.add(bb).stripTrailingZeros();
    }
}
