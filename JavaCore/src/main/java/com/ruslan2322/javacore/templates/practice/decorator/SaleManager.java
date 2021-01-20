package com.company.practice.decorator;

public class SaleManager extends SaleDecorator {


    public SaleManager(Sale sale) {
        super(sale);
    }

    public String contolSellersSuccess(){
        return "Manager control manager success...";
    }

    @Override
    public String sellProduct() {
        return super.sellProduct() + contolSellersSuccess();
    }
}
