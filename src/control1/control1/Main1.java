package control1.control1;


import control1.control1.shop.Cart;
import control1.control1.shop.Check;
import control1.control1.shop.Shop;
import control1.control1.shop.api.IShop;
import control1.control1.shop.products.BasicProduct;
import control1.control1.shop.products.DamageProduct;
import control1.control1.shop.products.SaleProduct;
import control1.control1.shop.products.api.IProduct;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Shop shop = new Shop(List.of(
                new BasicProduct("Молоко", BigDecimal.valueOf(2.35)),
                new SaleProduct("Телевизор", BigDecimal.valueOf(8563), 31),
                new DamageProduct("Бананы", BigDecimal.valueOf(10), 50, "Битые")
        ));

        program(shop);

    }

    public static void program(IShop shop) {
        Scanner console = new Scanner(System.in);
        List<IProduct> products = shop.getProducts();
        Cart cart = shop.getCart();
        int answer;
        do {
            System.out.println("Выберите продукт: ");
            int index = 1;
            for (IProduct product : products) {
                System.out.println(index++ + "." + product.toString());
            }
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");
            answer = console.nextInt();
            if (answer != 0) {
                System.out.print("Введите необходимое колличество: ");
                int count = console.nextInt();
                cart.add(products.get(answer -1), count);
            }
        } while (answer != 0);

        Check check = shop.check(cart);
        System.out.println(check);
    }
}
