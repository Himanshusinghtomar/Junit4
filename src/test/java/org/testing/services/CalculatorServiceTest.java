package org.testing.services;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceTest {

//    test methods.

    @Test
    public void addTwoNumbersTest(){
       int result =  CalculatorService.addTwoNumbers(0,5);

        Assert.assertEquals(5, result);
    }

    @Test
    public void calculateAnyNumberTest(){
        int result = CalculatorService.sumAnyNumbers(2,3,4,5,6);
        int expected = 2;
        Assert.assertEquals(expected, result);

    }
}
