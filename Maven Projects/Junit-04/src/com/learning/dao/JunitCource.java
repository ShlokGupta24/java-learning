package com.learning.dao;

public class JunitCource implements Cource{
    @Override
    public boolean coursePurchased() {
        System.out.println("JUnit Cource is purchased.");
        return true;
    }
}
