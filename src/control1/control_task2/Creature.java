package control1.control_task2;

import control1.control_task2.api.ICreature;

public class Creature implements ICreature {
    private String name;
    private double price;
    private int sale;
    private String why;
    public Creature(String name, double price){
        this.name = name;
        this.price = price;

    }
    public Creature(String name,double price, int sale){
        this.name = name;
        this.price = price;
        this.sale = sale;
    }
    public Creature(String name,double price, int sale, String why){
        this.name = name;
        this.price = price;
        this.sale = sale;
        this.why = why;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getSale() {
        return sale;
    }

    public String getWhy() {
        return why;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                ", why='" + why + '\'' +
                '}';
    }
}

