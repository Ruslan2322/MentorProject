package com.company.practice.factory;

public class WorkerFactory implements CustomerFactory{
    @Override
    public Customer createCustomer() {
        return new Worker();
    }
}
