package com.telusko.learning;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
   @Test
    public void testDivide(){
       Calc c=new Calc();
       int actual=c.divide(10,5);
       int expectedResult=2;
       assertEquals(expectedResult,actual);
       System.out.println("Test passed");
          }
}