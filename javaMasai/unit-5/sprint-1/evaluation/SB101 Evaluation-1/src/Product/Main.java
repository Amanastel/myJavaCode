package Product;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Product {
    int productId;
    String productName;
    double productPrice;

    public Product() {

    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", quantity=" + quantity +
                '}';
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    int quantity;
    public Product(int productId, String productName, double productPrice, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }
}
public class Main {
    public static void main(String[] args) {
        Function<String, Product> StringToPro = str ->{
            Product pr = new Product();
            String[] arr = str.split(",");
            pr.setProductId(Integer.parseInt(arr[0].trim()));
            pr.setProductName(arr[1]);
            pr.setProductPrice(Double.parseDouble(arr[2].trim()));
            pr.setQuantity(Integer.parseInt(arr[3].trim()));
//         return new Product(
//                 Integer.parseInt(arr[0].trim()),
//                 arr[1],
//                 Double.parseDouble(arr[2].trim()),
//                 Integer.parseInt(arr[3].trim())
//            );
            return pr;
        };
        String prod = "10, Pen, 20.00, 100";
        StringToPro.apply(prod);
        Supplier<Product> getProduct = () -> new Product(1,"Pen",20.00,100);

        System.out.println(getProduct.get());
        Consumer<Product> displayProduct = product -> {
            System.out.println("Product ID " + product.productId);
            System.out.println("Name " + product.productName);
            System.out.println("Price " + product.productPrice);
            System.out.println("quantity " + product.quantity);
        };
        Predicate<Product> isQuantity = product -> product.quantity < 5;



    }
}
