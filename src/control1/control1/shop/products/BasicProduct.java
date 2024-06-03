package control1.control1.shop.products;



import control1.control1.shop.products.api.IProduct;

import java.math.BigDecimal;

public class BasicProduct implements IProduct {
    private String name;
    private BigDecimal price;
    public BasicProduct(String name, BigDecimal price){
    this.name = name;
    this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ", Цена - " + price;
    }
}