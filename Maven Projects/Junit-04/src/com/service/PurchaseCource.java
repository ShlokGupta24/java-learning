package com.service;

import com.learning.dao.Cource;

public class PurchaseCource
{
    private Cource cource;
    // For example we can consider: Cource cource=new JavaCource();
    public boolean proceedWithCourse(Cource cource){
        return cource.coursePurchased();
    }
}
