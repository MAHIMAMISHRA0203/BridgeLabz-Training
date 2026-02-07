package InterfacesFunctional.MultiVehicleRentalSystem;


public interface Vehicle {
	void rent();
	String returnVehicle();

}
class Car implements Vehicle{
	public void rent() {
		System.out.println("Car is rented");
	}
	public String returnVehicle() {
		return "Car returned";
	}
	
}
class Bikes implements Vehicle{
	public void rent() {
		System.out.println("Bike is rented");
	}
	public String returnVehicle() {
		return "Bike returned";
	}
	
}
class Buses implements Vehicle{
	public void rent() {
		System.out.println("Bus is rented");
	}
	public String returnVehicle() {
		return "Bus returned";
	}
	
}
