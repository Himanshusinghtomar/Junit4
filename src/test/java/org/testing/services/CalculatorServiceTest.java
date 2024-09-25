package org.testing.services;

import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {


//    before class is used to initialize previous @BeforeClass

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before Class");
        System.out.println("Start test : "+new Date());
    }


    //    after class is used to destroy any file opening or connection
    @After
    public void tearDown() throws Exception {
        System.out.println("After every test cases");
    }


//    test methods.

    @Test
    public void addTwoNumbersTest(){

        System.out.println("Add Two Numbers Test");

       int result =  CalculatorService.addTwoNumbers(0,5);

        Assert.assertEquals(5, result);
    }



    @Test
    public void calculateAnyNumberTest(){

        System.out.println("Calculate Any Number");

        int result = CalculatorService.sumAnyNumbers(2,3,4,5,6);
        int expected = 20;
        Assert.assertEquals(expected, result);

    }

    //    after class is used to destroy any file opening or connection
    @Before
    public void BeforeEachTestCase() throws Exception {
        System.out.println("Before every test cases");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After all test cases");
    }


}
