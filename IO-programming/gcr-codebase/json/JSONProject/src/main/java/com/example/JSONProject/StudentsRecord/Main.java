package com.example.JSONProject.StudentsRecord;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Main {
public static void main(String arg[]) {
	try {
		Student student=new Student(89,"Mahima");
		ObjectMapper o=new ObjectMapper();
		String jsonString=o.writeValueAsString(student);
		System.out.println(jsonString);
	}catch(Exception e) {
		System.out.println(e);
	}
	
}
}
