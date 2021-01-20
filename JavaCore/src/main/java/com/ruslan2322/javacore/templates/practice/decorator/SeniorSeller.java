package com.company.practice.decorator;

public class SeniorSeller extends SaleDecorator{

    public SeniorSeller(Sale sale) {
        super(sale);
    }

    public String controlTradeScrps(){
        return "review trading scripts...";
    }

    @Override
    public String sellProduct() {
        return super.sellProduct() + controlTradeScrps();
    }
}
