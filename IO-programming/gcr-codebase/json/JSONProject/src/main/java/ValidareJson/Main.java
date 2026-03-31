package ValidareJson;

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
				  try {
				  o.readTree(data);
					System.out.println("Validated");}
				  catch(Exception e) {
					  System.out.println("Invalid");
				  }
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
