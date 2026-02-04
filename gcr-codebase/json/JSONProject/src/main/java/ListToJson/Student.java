package ListToJson;

public class Student {
public Student(String nameString, int id) {
		this.nameString = nameString;
		this.id = id;
	}
public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
String nameString;
 int id;
}
