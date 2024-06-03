package control1.control1.shop;

import java.math.BigDecimal;
import java.util.List;

public class Check {
private List <String> lines;
private BigDecimal sum;

    public Check(List<String> lines, BigDecimal sum) {
        this.lines = lines;
        this.sum = sum;
    }
 @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (String  line : lines){
            builder.append(i++)
                    .append(". ")
                    .append(line)
                    .append("\n");
        }
        builder.append("Итого надо заплатить: ").append(sum);
        return builder.toString();
    }
}
