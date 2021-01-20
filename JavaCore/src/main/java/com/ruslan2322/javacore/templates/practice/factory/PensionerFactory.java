package com.company.practice.factory;

public class PensionerFactory implements CustomerFactory{
    @Override
    public Customer createCustomer() {
        return new Pensioner();
    }
}
