package CSVFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

class Student{
	String name;
	String id;
	int age;
	int marks;
	public Student(String name, String id, int age, int marks) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
public class ReadAndPrint {
public static void main(String args[]) {
	
	try {
		BufferedReader file=new BufferedReader(new FileReader("data.csv"));
		String line;
		while((line=file.readLine())!=null) {
			String []col=line.split(",");
			System.out.println("ID:"+col[0]+"Name:"+col[1]+"Age:"+col[2]+"Marks"+col[3]);
		}
		file.close();

	}
	catch(Exception e) {
		System.out.println("File not found");
	}
	
	
	
}
}
