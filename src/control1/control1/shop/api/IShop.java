package control1.control1.shop.api;



import control1.control1.shop.Cart;
import control1.control1.shop.Check;
import control1.control1.shop.products.api.IProduct;

import java.util.List;

public interface IShop {
    List<IProduct> getProducts();
    Cart getCart();
    Check check(Cart cart);
}
