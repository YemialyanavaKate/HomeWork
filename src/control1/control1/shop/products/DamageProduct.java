package control1.control1.shop.products;

import java.math.BigDecimal;

public class DamageProduct extends SaleProduct {
    private String descriptionOfDamage;

    public DamageProduct(String name, BigDecimal price, int discont, String descriptionOfDamage) {
        super(name, price, discont);
        this.descriptionOfDamage = descriptionOfDamage;
    }
    public String toString() {
        return super.toString() + ", Уценка - " + descriptionOfDamage;
    }
}
