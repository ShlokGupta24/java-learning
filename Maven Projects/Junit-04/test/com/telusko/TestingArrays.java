package com.telusko;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class TestingArrays {

    @Test
    void testArrays(){
//        int[] expected ={2,4,6,8};
//        int[] actual ={4,6,8,2};
//       Arrays.sort(actual);  //actual[]= 2,4,6,8
//        assertArrayEquals(expected,actual);

        int[] unsorted={5,2,77,1,8,9};

      //  assertThrows(NullPointerException.class,()->Arrays.sort(unsorted));
        assertTimeout(Duration.ofNanos(1),()->Arrays.sort(unsorted), "Test is failed, performance is low.");
    }
}
