package JavaObjectsToJsonArray;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
public static void main(String args[]) {
	List<Subjects> list=new ArrayList<>();
	list.add(new Subjects("Maths",500));
		try {
			ObjectMapper objectMapper=new ObjectMapper();
			String jsonNode=objectMapper.writeValueAsString(list);
			System.out.println(jsonNode);
					System.out.println();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
}
}
