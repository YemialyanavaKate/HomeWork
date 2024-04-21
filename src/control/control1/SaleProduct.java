package control.control1;

import objects.dto.B;

import java.math.BigDecimal;

public class SaleProduct extends BasicProduct{
    private int discont;
    private  BigDecimal finalPrice;

    public SaleProduct(String name, BigDecimal price, int discont) {
        super(name, price);
        this.discont = discont;

        this.finalPrice = price.add(price.divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(discont)).negate());
    }

    public int getDiscont() {
        return discont;
    }
    /*public BigDecimal getPrice(){
        BigDecimal price = super;
    }*/

    public String toString() {
        return super.toString() + ", Скидка - " + discont + "%";
       // return name + ", Цена - " + price;
    }
}