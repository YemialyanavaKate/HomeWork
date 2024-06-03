package control1.control1.shop;

import control1.control1.shop.products.api.IProduct;

public class ProductInCart {
    private IProduct product;
    private int count;

    public ProductInCart(IProduct product, int count) {
        this.product = product;
        this.count = count;
    }

    public IProduct getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}
