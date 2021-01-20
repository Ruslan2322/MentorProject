package com.company.practice.factory;

public class StudentFactory implements CustomerFactory{
    @Override
    public Customer createCustomer() {
        return new Student();
    }
}
