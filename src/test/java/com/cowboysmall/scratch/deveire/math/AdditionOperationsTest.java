package com.cowboysmall.scratch.deveire.math;

import com.cowboysmall.scratch.deveire.math.number.Addable;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class AdditionOperationsTest {

    @Test
    public void testAdditionOperations_Add_Addable() {

        assertThat(
                AdditionOperations.add(
                        new Addable(4),
                        new Addable(5L)
                ),
                is(new Addable(9))
        );

        assertThat(
                AdditionOperations.add(
                        new Addable(444444444444L),
                        new Addable(555555555555L)
                ),
                is(new Addable(999999999999L))
        );

        assertThat(
                AdditionOperations.add(
                        new Addable(4.44444444444),
                        new Addable(5.55555555555D)
                ),
                is(new Addable(9.99999999999D))
        );

        assertThat(
                AdditionOperations.add(
                        new Addable(4),
                        new Addable(5.99999999999D)
                ),
                is(new Addable(9.99999999999D))
        );

        assertThat(
                AdditionOperations.add(
                        new Addable(new BigInteger("4")),
                        new Addable(new BigDecimal("5.0"))
                ),
                is(new Addable(new BigInteger("9")))
        );

        assertThat(
                AdditionOperations.add(
                        new Addable(new BigDecimal("4.0")),
                        new Addable(new BigDecimal("5.0"))
                ),
                is(new Addable(new BigDecimal("9.0")))
        );

    }

    @Test
    public void testAdditionOperations_Add_Number() {

        assertThat(
                AdditionOperations.add(4, 5L),
                is(new BigDecimal("9"))
        );

        assertThat(
                AdditionOperations.add(4L, 5D),
                is(new BigDecimal("9"))
        );

        assertThat(
                AdditionOperations.add(4.0, 5.0),
                is(new BigDecimal("9"))
        );

        assertThat(
                AdditionOperations.add(4.444, 5.555),
                is(new BigDecimal("9.999"))
        );

        assertThat(
                AdditionOperations.add(new BigInteger("4"), 5),
                is(new BigDecimal("9"))
        );

        assertThat(
                AdditionOperations.add(4, new BigDecimal("5")),
                is(new BigDecimal("9"))
        );

        assertThat(
                AdditionOperations.add(new BigInteger("4"), new BigDecimal("5.000")
                ),
                is(new BigDecimal("9"))
        );

        assertThat(
                AdditionOperations.add(4, new BigDecimal("5.999999999999999999999999")
                ),
                is(new BigDecimal("9.999999999999999999999999"))
        );
    }
}
