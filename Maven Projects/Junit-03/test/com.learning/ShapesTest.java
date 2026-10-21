//First we write test then we write code in shapes.java file. That is test driven development.
package com.learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ShapesTest {
    Shapes shapes;
    //This annotation runs this init method, before the test annotation method, each and everytime.
    @BeforeEach
    void init(){
        shapes=new Shapes();
        System.out.println("Before test");
    }
    @Test
    void testComputeSquareArea() {

        assertEquals(576, shapes.computeSquareArea(24));
        System.out.println("Actual test running");
    }
    @Test
    void testComputeCircleArea(){
        assertEquals(78.5,shapes.computeCircleArea(5),0.001,"Area of Circle calculation is wrong.");
        System.out.println("Actual test running");
    }
    //Implementing the supplier interface, its work same but its more efficient than normal string message.
    @Test
    void testComputeCircleArea_Supplier(){
        assertEquals(78.5,shapes.computeCircleArea(5),0.001,()->"Area of Circle calculation is wrong.");
        System.out.println("Actual test running");
    }

}