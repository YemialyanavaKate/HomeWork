package control1.control1.shop;



import control1.control1.shop.api.IShop;
import control1.control1.shop.api.IShopAdmin;
import control1.control1.shop.products.api.IProduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Shop implements IShop, IShopAdmin {
    private List<IProduct> products = new ArrayList<>();

    public Shop(){

    }
    public Shop (List<IProduct> products){
       this.products = products;
    }

    @Override
    public void add(IProduct product){
        products.add(product);
    }

    @Override
    public List<IProduct> getProducts() {
        return products;
    }

    @Override
    public Cart getCart() {
        return new Cart();
    }



    @Override
    public Check check (Cart cart){
        List<String> lines = new ArrayList<>();
        BigDecimal sum = BigDecimal.ZERO;
        //BigDecimal result = price.m

        List<ProductInCart> fromCart = cart.getProducts();

        for (ProductInCart productInCart : fromCart) {
            IProduct product = productInCart.getProduct();
            int count = productInCart.getCount();

            BigDecimal price = product.getPrice();
            BigDecimal result = price.multiply(BigDecimal.valueOf(count));
            sum = sum.add(result);

            String line = product.toString() + ", Количество - " + count +
                    ", Сумма - " + result;

            lines.add(line);
        } return new Check(lines, sum);



    }
}
