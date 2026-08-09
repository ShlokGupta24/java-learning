package com.learning.dao;

public class JavaCource implements Cource{

    @Override
    public boolean coursePurchased() {
        System.out.println("Java Cource is purchased.");
        return true;
    }
}
