//First we write test then we write code in shapes.java file. That is test driven development.
package com.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ShapesTest {
    Shapes shapes = new Shapes();
    @Test
    void testComputeSquareArea() {

        assertEquals(576, shapes.computeSquareArea(24));
    }
    @Test
    void testComputeCircleArea(){
        assertEquals(78.5,shapes.computeCircleArea(5),0.001,"Area of Circle calculation is wrong.");
    }
    //Implementing the supplier interface, its work same but its more efficient than normal string message.
    @Test
    void testComputeCircleArea_Supplier(){
        assertEquals(78.5,shapes.computeCircleArea(5),0.001,()->"Area of Circle calculation is wrong.");
    }

}