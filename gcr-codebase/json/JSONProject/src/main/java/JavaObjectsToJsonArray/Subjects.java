package JavaObjectsToJsonArray;

public class Subjects {
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	String nameString;
	int price;
public Subjects(String nameString, int price) {
		this.nameString = nameString;
		this.price = price;
	}

}
