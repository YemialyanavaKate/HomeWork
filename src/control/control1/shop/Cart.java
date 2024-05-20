package control.control1.shop;


import control.control1.shop.products.api.IProduct;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<ProductInCart> products = new ArrayList<>();

    public void add(IProduct product, int count){
        products.add(new ProductInCart(product, count));
    }

    public List<ProductInCart> getProducts() {
        return products;
    }
}
