package control.control1.shop.api;



import control.control1.shop.Cart;
import control.control1.shop.Check;
import control.control1.shop.products.api.IProduct;

import java.util.List;

public interface IShop {
    List<IProduct> getProducts();
    Cart getCart();
    Check check(Cart cart);
}
