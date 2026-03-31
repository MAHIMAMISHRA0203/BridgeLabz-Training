import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stopNumber = 1;
        double totalDistance = 0.0;

        System.out.println("🚌 Bus Route Distance Tracker Started");

        while (true) {

            System.out.print("Enter distance covered till stop " + stopNumber + " (in km): ");
            double distance = sc.nextDouble();

            totalDistance += distance;

            System.out.println("Total distance covered so far: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Passenger got off at stop " + stopNumber);
                break;
            }

            stopNumber++;
        }

        System.out.println("Final distance travelled: " + totalDistance + " km");
        sc.close();
    }
}
