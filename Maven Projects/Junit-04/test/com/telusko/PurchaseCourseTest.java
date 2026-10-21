package com.telusko;

import com.learning.dao.JavaCource;
import com.learning.dao.SpringbootCource;
import com.service.PurchaseCource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseCourseTest {

    @Test
    void proceedWithCourse() {
        PurchaseCource pc=new PurchaseCource();
        boolean status1=pc.proceedWithCourse(new JavaCource()); //Object of course should be passed down here.
        assertTrue(status1);
        boolean status2=pc.proceedWithCourse(new SpringbootCource());
        assertFalse(status2, "Its failed coz unit is results in true.");
    }
}