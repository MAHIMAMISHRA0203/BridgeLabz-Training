package InterfacesFunctional.MultiVehicleRentalSystem;

public class MultiRentalService {

    private MultiRentalDao dao = new MultiRentalDao();

    public void processRent(Vehicle vehicle) {
        dao.rentVehicle(vehicle);
    }

    public void processReturn(Vehicle vehicle) {
        dao.returnVehicle(vehicle);
    }
}
