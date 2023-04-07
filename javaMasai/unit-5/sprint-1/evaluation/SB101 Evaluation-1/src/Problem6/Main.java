package Problem6;

import java.util.Objects;
import java.util.TreeSet;

class GroceryItems{
    double price;
    String name;
    double usedFrequency;

    public GroceryItems(double price, String name, double usedFrequency) {
        this.price = price;
        this.name = name;
        this.usedFrequency = usedFrequency;
    }
}


public class Main {
    static class GroceryItems implements Comparable<GroceryItems>{
        double price;
        String name;
        double usedFrequency;

        public GroceryItems(double price, String name, double usedFrequency) {
            this.price = price;
            this.name = name;
            this.usedFrequency = usedFrequency;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof GroceryItems that)) return false;
            return Double.compare(that.getPrice(), getPrice()) == 0 && Double.compare(that.getUsedFrequency(), getUsedFrequency()) == 0 && getName().equals(that.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(price, name, usedFrequency);
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getUsedFrequency() {
            return usedFrequency;
        }

        public void setUsedFrequency(double usedFrequency) {
            this.usedFrequency = usedFrequency;
        }

        @Override
        public int compareTo(GroceryItems obj){
            int itm = Double.compare(obj.usedFrequency, this.usedFrequency);
            if(itm == 0){
                itm = Double.compare(obj.price, this.price);
                if(itm ==0){
                    itm = obj.name.compareTo(this.name);
                }
            }
            return itm;
        }
        @Override
        public String toString() {
            return "GroceryItems{" +
                    "price=" + price +
                    ", name='" + name + '\'' +
                    ", usedFrequency=" + usedFrequency +
                    '}';
        }
    }
    public static void main(String[] args) {
        TreeSet<GroceryItems> naturalOrder = new TreeSet<>();
        naturalOrder.add(new GroceryItems(4.3,"Milk",10));
        naturalOrder.add(new GroceryItems(3.4,"Panner",14));
        naturalOrder.add(new GroceryItems(2.5,"Egg",15));
        naturalOrder.add(new GroceryItems(4.3,"Butter",30));
        naturalOrder.add(new GroceryItems(5.3,"Cheese",20));
        System.out.println(naturalOrder);

        TreeSet<GroceryItems> Comparator = new TreeSet<>();
        Comparator.add(new GroceryItems(3.3,"Milk",10));
        Comparator.add(new GroceryItems(3.4,"Panner",34));
        Comparator.add(new GroceryItems(23.5,"Egg",15));
        Comparator.add(new GroceryItems(4.33,"Butter",20));
        Comparator.add(new GroceryItems(1.3,"Cheese",30));
        System.out.println(Comparator);

    }
}
