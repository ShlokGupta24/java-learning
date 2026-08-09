package com.learning.dao;

public class SpringbootCource implements Cource{
    @Override
    public boolean coursePurchased() {
        System.out.println("SpringBoot Cource is purchased.");
        return false;
    }
}
