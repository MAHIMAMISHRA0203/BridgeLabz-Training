package annotations;
import java.lang.annotation.*;

import java.util.ArrayList;

public class SupressAnnotation {
public static void main(String []args) {
	@SuppressWarnings("unchecked")
	ArrayList arrayList=new ArrayList();
	arrayList.add(4);
	System.out.println(arrayList.get(0));
	
}
}
