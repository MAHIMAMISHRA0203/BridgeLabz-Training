package PrintJson;

import java.io.InputStream;
import java.time.temporal.IsoFields;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Main {
public static void main(String args[]) {
	try {
		ObjectMapper objectMapper=new ObjectMapper();
		InputStream dataInputStream=Main.class.getClassLoader().getResourceAsStream("read.json");
	JsonNode jsonNode=objectMapper.readTree(dataInputStream);
	for(JsonNode j:jsonNode) {
	Iterator<Map.Entry<String, JsonNode>> i=j.fields();
	while(i.hasNext()) {
		Map.Entry<String ,JsonNode>map=i.next();
		System.out.println(map.getKey()+":"+map.getValue());
		
		
	}}

	}catch (Exception e) {
System.out.println(e);	}
}
}
