package FilterJSON;

import java.io.InputStream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Main {
public static void main(String args[]) {
	try {
		ObjectMapper objectMapper=new ObjectMapper();
		InputStream inputStream=Main.class
				.getClassLoader()
				.getResourceAsStream("read.json");
		ArrayNode arr=(ArrayNode)objectMapper.readTree(inputStream);
		for(JsonNode a:arr) {
			if(a.get("age").asInt()>18) {
				System.out.println(a.get("Name").asText());
				
			}
		}
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
