import java.util.*;

// ---------------- Exception ----------------
class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}

// ---------------- Interface ----------------
interface FareCalculator {
    int calculateFare(int baseFare);
}

// ---------------- Polymorphism ----------------
class NormalFare implements FareCalculator {
    public int calculateFare(int baseFare) {
        return baseFare;
    }
}

class PeakFare implements FareCalculator {
    public int calculateFare(int baseFare) {
        return baseFare + 50; // peak charges
    }
}

// ---------------- Driver Class ----------------
class Driver {
    String name;
    int fare;
    String status;

    Driver(String name, int fare) {
        this.name = name;
        this.fare = fare;
        this.status = "Available";
    }
}

// ---------------- Ride Class ----------------
class Ride {
    String customerName;
    String source;
    String destination;
    Driver driver;
    int finalFare;

    Ride(String customerName, String source, String destination, Driver driver, int finalFare) {
        this.customerName = customerName;
        this.source = source;
        this.destination = destination;
        this.driver = driver;
        this.finalFare = finalFare;
    }
}

// ---------------- Driver Management ----------------
class DriverManager {

    ArrayList<Driver> drivers = new ArrayList<>();

    DriverManager() {
        drivers.add(new Driver("Ram Kumar", 100));
        drivers.add(new Driver("Dinesh Chauhan", 125));
        drivers.add(new Driver("Dev Singh", 75));
    }

    public void showDrivers() {
        System.out.printf("%-5s %-20s %-10s %-12s%n",
                "Id", "Driver Name", "Fare", "Status");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < drivers.size(); i++) {
            Driver d = drivers.get(i);
            System.out.printf("%-5d %-20s %-10d %-12s%n",
                    i, d.name, d.fare, d.status);
        }
    }

    public Driver assignDriver(int id) throws NoDriverAvailableException {
        if (id < 0 || id >= drivers.size()) {
            throw new NoDriverAvailableException("Invalid driver ID");
        }

        Driver d = drivers.get(id);
        if (!d.status.equals("Available")) {
            throw new NoDriverAvailableException("Driver not available");
        }

        d.status = "Unavailable";
        return d;
    }
}

// ---------------- Ride History ----------------
class RideHistory {
    ArrayList<Ride> history = new ArrayList<>();

    public void addRide(Ride ride) {
        history.add(ride);
    }

    public void showHistory() {
        System.out.printf("%-15s %-15s %-20s %-10s%n",
                "Source", "Destination", "Driver", "Fare");
        System.out.println("------------------------------------------------");

        for (Ride r : history) {
            System.out.printf("%-15s %-15s %-20s %-10d%n",
                    r.source, r.destination, r.driver.name, r.finalFare);
        }
    }
}

// ---------------- MAIN ----------------
public class RideBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DriverManager manager = new DriverManager();
        RideHistory rideHistory = new RideHistory();

        System.out.print("Enter your name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter source: ");
        String source = sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.println("\nAvailable Drivers:");
        manager.showDrivers();

        System.out.print("\nChoose driver ID: ");
        int id = sc.nextInt();

        System.out.print("Is it peak time? (yes/no): ");
        String peak = sc.next();

        try {
            Driver driver = manager.assignDriver(id);

            FareCalculator calculator;
            if (peak.equalsIgnoreCase("yes")) {
                calculator = new PeakFare();
            } else {
                calculator = new NormalFare();
            }

            int finalFare = calculator.calculateFare(driver.fare);

            Ride ride = new Ride(customerName, source, destination, driver, finalFare);
            rideHistory.addRide(ride);

            System.out.println("\nRide booked successfully!");
            System.out.println(driver.name + " is arriving in 5 minutes.");
            System.out.println("Final Fare: " + finalFare);

            System.out.println("\nRide History:");
            rideHistory.showHistory();

        } catch (NoDriverAvailableException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }

        sc.close();
    }
}
