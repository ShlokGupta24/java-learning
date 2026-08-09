package com.telusko.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    ReverseString rev=new ReverseString(); //Class Under test
    @Test
    void reverseString_OneWord() {

        assertEquals("avaJ", rev.reverseString("Java"));
        assertEquals("neilA", rev.reverseString("Alien"));

    }
    @Test
    void reverseString_MultipleWord(){
        assertEquals("ysae si avaJ", rev.reverseString("Java is easy"));
    }
}