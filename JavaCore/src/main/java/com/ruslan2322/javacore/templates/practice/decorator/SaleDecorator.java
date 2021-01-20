package com.company.practice.decorator;

public class SaleDecorator implements Sale {
    Sale sale;

    public SaleDecorator(Sale sale) {
        this.sale = sale;
    }

    @Override
    public String sellProduct() {
        return sale.sellProduct();
    }
}
