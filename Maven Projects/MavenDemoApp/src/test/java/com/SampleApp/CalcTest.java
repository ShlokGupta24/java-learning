package com.SampleApp;

import org.junit.jupiter.api.Test; //importing dependency that we download through Maven

import static org.junit.jupiter.api.Assertions.assertEquals;

//To test the app, we need JUnit, so we get from dependency
public class CalcTest {
    @Test  //annotation for test
    void testCalc(){
     Calc calc=new Calc();
     int actualResult=calc.divide(10,5);
     int expectedResult=2;

     assertEquals(expectedResult, actualResult);
    }
}
