package org.testing.services;

import org.junit.*;
import org.junit.rules.Timeout;

import java.util.Date;

public class CalculatorServiceTest {


//    counter
    int counter = 0;

//    before class is used to initialize previous @BeforeClass

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before Class");
        System.out.println("Start test : "+new Date());
    }


    //    after class is used to destroy any file opening or connection
    @Before
    public void BeforeEachTestCase() throws Exception {
        System.out.println("Before every test cases");
        counter = 0;
    }



//    test methods.

    @Test
    public void addTwoNumbersTest(){

        for(int i =0;i<10;i++)
        {
            counter+= i;
        }

        System.out.println("Add Two Numbers Test");

       int result =  CalculatorService.addTwoNumbers(0,5);

        Assert.assertEquals(5, result);

        System.out.println("Counter value in two Number: "+counter);
    }



    @Test(timeout = 2000)
    public void calculateAnyNumberTest() throws InterruptedException {

        for(int i =0;i<30;i++)
        {
            counter+= i;
        }

        Thread.sleep(3000);

        System.out.println("Calculate Any Number");

        int result = CalculatorService.sumAnyNumbers(2,3,4,5,6);
        int expected = 20;
        Assert.assertEquals(expected, result);

        System.out.println("Counter value in Any Number: "+counter);

    }

    //    after class is used to destroy any file opening or connection
    @After
    public void tearDown() throws Exception {
        System.out.println("After every test cases");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After all test cases");
    }


}
