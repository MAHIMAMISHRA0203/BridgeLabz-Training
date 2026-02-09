package collectors.OrderRevenueSummary;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order("Rahul", 500.0),
                new Order("Rahul", 700.0),
                new Order("Anita", 300.0));

        Map<String, Double> revenueByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomer,
                        Collectors.summingDouble(Order::getAmount)));

        System.out.println(revenueByCustomer);
    }
}
