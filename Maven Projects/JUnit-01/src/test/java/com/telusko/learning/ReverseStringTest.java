package com.telusko.learning;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void testReverseString() {
        assertEquals("yhtlaeH", new ReverseString().reverseString("Healthy"));
    }

}