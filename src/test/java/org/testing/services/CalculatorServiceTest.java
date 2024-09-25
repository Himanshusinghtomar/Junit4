package org.testing.services;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

public class CalculatorServiceTest {


//    before class is used to initialize previous @BeforeClass

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before Class");
        System.out.println("Start test : "+new Date());
    }

//    test methods.

    @Test
    public void addTwoNumbersTest(){
       int result =  CalculatorService.addTwoNumbers(0,5);

        Assert.assertEquals(5, result);
    }

    @Test
    public void calculateAnyNumberTest(){
        int result = CalculatorService.sumAnyNumbers(2,3,4,5,6);
        int expected = 20;
        Assert.assertEquals(expected, result);

    }
}
