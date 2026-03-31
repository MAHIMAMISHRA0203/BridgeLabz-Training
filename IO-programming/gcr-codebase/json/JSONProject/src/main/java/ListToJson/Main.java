package ListToJson;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import JavaObjectsToJsonArray.Subjects;

public class Main {
	public static void main(String args[]) {
		List<Subjects> list=new ArrayList<>();
		list.add(new Subjects("Maths",500));
		list.add(new Subjects("Hindi",100));

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
