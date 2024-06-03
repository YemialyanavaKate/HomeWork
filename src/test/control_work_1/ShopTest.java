package test.control_work_1;

import control1.control1.shop.Cart;
import control1.control1.shop.Check;
import control1.control1.shop.Shop;
import control1.control1.shop.products.BasicProduct;
import control1.control1.shop.products.DamageProduct;
import control1.control1.shop.products.SaleProduct;
import control1.control1.shop.products.api.IProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

public class ShopTest {

    @Test
    public void testCheck() {
        Shop shop = new Shop(List.of(
                new BasicProduct("Молоко", BigDecimal.valueOf(2.35).setScale(2)),
                new SaleProduct("Телевизор", BigDecimal.valueOf(8563).setScale(2), 31),
                new DamageProduct("Бананы", BigDecimal.valueOf(10).setScale(2), 50, "Битые")
        ));

        List<IProduct> products = shop.getProducts();
        Cart cart = shop.getCart();

        cart.add(products.get(0), 4);
        cart.add(products.get(1), 1);
        cart.add(products.get(2), 15);

        Check check = shop.check(cart);
        String string = check.toString();

        Assertions.assertEquals("1. Молоко, Цена - 2.35, Количество - 4, Сумма - 9.40\n" +
                "2. Телевизор, Цена - 8563.00, Скидка - 31%, Количество - 1, Сумма - 5908.47\n" +
                "3. Бананы, Цена - 10.00, Скидка - 50%, Уценка - Битые, Количество - 15, Сумма - 75.00\n" +
                "Итого надо заплатить: 5992.87", string);

    }
}
