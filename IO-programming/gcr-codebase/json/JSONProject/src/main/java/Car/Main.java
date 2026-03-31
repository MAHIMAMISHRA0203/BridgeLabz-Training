package Car;

import com.example.JSONProject.StudentsRecord.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String arg[]) {
		try {
			CarData student=new CarData("Red","Civic Type  R",5);
			ObjectMapper o=new ObjectMapper();
			String jsonString=o.writeValueAsString(student);
			System.out.println(jsonString);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}
