package InterfacesFunctional.MultiVehicleRentalSystem;


public class MultiRentalDao {
    public void rentVehicle(Vehicle vehicle) {
		   vehicle.rent();
}
    public void returnVehicle(Vehicle vehicle) {
	       vehicle.returnVehicle();
}
}
