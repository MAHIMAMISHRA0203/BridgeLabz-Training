import java.util.*;

// ===============================
// GENERIC PRODUCT CLASS
// ===============================
class Product<T> {

    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void showDetails() {
        System.out.println("Product Name : " + name);
        System.out.println("Price        : ₹" + price);
        System.out.println("Category     : " + category);
        System.out.println("-------------------------");
    }
}

// ===============================
// DISCOUNT LOGIC (GENERIC METHOD)
// ===============================
class Discount {

    // BOUNDED GENERIC METHOD
    static <T extends Product<?>> void applyDiscount(T product, double percent) {

        double discountAmount = product.getPrice() * percent / 100;
        product.setPrice(product.getPrice() - discountAmount);
    }
}

// ===============================
// MAIN CLASS
// ===============================
public class DynamicOnlineMarketplace {

    public static void main(String[] args) {

        // Creating products (very simple)
        Product<String> book =
                new Product<>("Java Book", 500, "Books");

        Product<String> shirt =
                new Product<>("T-Shirt", 1200, "Clothing");

        Product<String> phone =
                new Product<>("Smartphone", 20000, "Gadgets");

        // One catalog for everything
        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        // Applying discounts
        Discount.applyDiscount(book, 10);    // 10% off
        Discount.applyDiscount(shirt, 20);   // 20% off
        Discount.applyDiscount(phone, 5);    // 5% off

        // Displaying all products
        System.out.println("🛒 ONLINE MARKETPLACE");
        for (Product<?> p : catalog) {
            p.showDetails();
        }
    }
}
