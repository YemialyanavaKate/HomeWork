package control.control1;

import control.control1.api.IProduct;

import java.math.BigDecimal;

public class BasicProduct implements IProduct {
    private String name;
    private BigDecimal price;
    public BasicProduct(String name, BigDecimal price){
    this.name = name;
    this.price = price;
    }

    @Override
    public String toString() {
        return name + ", Цена - " + price;
    }
}