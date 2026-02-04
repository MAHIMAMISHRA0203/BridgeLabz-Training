package MergeJsonObjects;

import java.io.InputStream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class Main {
	public static void main(String arg[]) {
		try {
		ObjectMapper objectMapper=new ObjectMapper();
		 InputStream data1 = Main.class
			        .getClassLoader()
			       .getResourceAsStream("read.json");
		 InputStream data2 = Main.class
			        .getClassLoader()
			       .getResourceAsStream("Student.json");
			  ObjectNode s1=(ObjectNode)objectMapper.readTree(data1);
			  ObjectNode s2=(ObjectNode)objectMapper.readTree(data2);

s1.setAll(s2);
System.out.println(s1);
} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	}

