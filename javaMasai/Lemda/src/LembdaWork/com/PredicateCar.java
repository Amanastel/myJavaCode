package LembdaWork.com;

public class PredicateCar {
    private String name;
    private String color;
    private double price;

    public PredicateCar(String name, String color,double price){
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "PredicateCar{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
