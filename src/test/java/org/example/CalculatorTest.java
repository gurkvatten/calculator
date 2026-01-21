package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoNumbersReturnSum() {
        int result = Calculator.add(1, 2);
        assertEquals(3, result);

    }

    @Test
    void addThreeNumbersReturnSum() {
        int result = Calculator.add(1, 2,3);
        assertThat(result).isEqualTo(6);
    }
    @Test
    void addMultipleNumbersReturnSum() {
        int result = Calculator.add(1,2,3,4);
        assertThat(result).isEqualTo(10);
    }
    @Test
    void noParamsReturnZero() {
        int result = Calculator.add();
        assertThat(result).isEqualTo(0);
    }

}