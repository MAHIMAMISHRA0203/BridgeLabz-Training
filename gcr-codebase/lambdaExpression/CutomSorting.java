package lambdaExpression;
import java.util.*;
 class Product {

    private String name;
    private double price;
    private double rating;
    private double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public double getPrice() { return price; }
    public double getRating() { return rating; }
    public double getDiscount() { return discount; }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount;
    }
}

public class CutomSorting {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Phone", 50000, 4.5, 10),
                new Product("Laptop", 80000, 4.7, 15),
                new Product("Headphones", 3000, 4.2, 20)
        );

        // 🔹 Sort by Price
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        // 🔹 Sort by Rating (descending)
        products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        // 🔹 Sort by Discount (descending)
        products.sort((p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount()));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}
