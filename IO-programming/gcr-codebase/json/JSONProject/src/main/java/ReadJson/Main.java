package ReadJson;

import java.io.InputStream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String arg[]) {
		try {
			ObjectMapper o=new ObjectMapper();
			
			try {
				  InputStream data = Main.class
				        .getClassLoader()
				       .getResourceAsStream("read.json");
				  if (data == null) {
		                throw new RuntimeException("read.json NOT found on classpath");
		            }
				  JsonNode jsonString=o.readTree(data);
					System.out.println(jsonString);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
