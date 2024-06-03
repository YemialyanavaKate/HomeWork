package control1.control1.shop.products;

import java.math.BigDecimal;

public class SaleProduct extends BasicProduct {

    private static final BigDecimal ONE_HUNDRED = BigDecimal.valueOf(100);
    private int discont;
    private  BigDecimal finalPrice;

    public SaleProduct(String name, BigDecimal price, int discount) {
        super(name, price);
        this.discont = discount;

        //price.divide(ONE_HUNDRED) // процент от числа
        //price.divide(ONE_HUNDRED).multiply(BigDecimal.valueOf(discount)) //получаем сумму из процента скидки
        //price.divide(ONE_HUNDRED).multiply(BigDecimal.valueOf(discount)).negate() //сумма скидки отрицательное

        this.finalPrice = price.add(price.divide(ONE_HUNDRED).multiply(BigDecimal.valueOf(discount)).negate());
    }

    public int getDiscount() {
        return discont;
    }

    @Override
    public BigDecimal getPrice() {
        return finalPrice;
    }

    public String toString() {
        return super.toString() + ", Скидка - " + discont + "%";
        //return getName() + ", Цена - " + getPrice() + ", Скидка - " + discont + "%";
    }
}