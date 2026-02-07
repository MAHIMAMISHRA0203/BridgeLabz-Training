package InterfacesFunctional.MultiVehicleRentalSystem;

public class Main {

    public static void main(String[] args) {

        MultiRentalService service = new MultiRentalService();

        service.processRent(new Car());
        service.processReturn(new Car());

        service.processRent(new Bikes());
        service.processReturn(new Bikes());

        service.processRent(new Buses());
        service.processReturn(new Buses());
    }
}
