package Car;

public class CarData {
	String color;
	 String model;
	 int seats;
 public CarData(String color, String model, int seats) {
		super();
		this.color = color;
		this.model = model;
		this.seats = seats;
	}
 public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
 
 
}
