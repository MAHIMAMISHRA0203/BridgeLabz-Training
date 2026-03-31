package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@Repeatable(ImportantMethods.class)
@interface ImportantMethod{
	String level() default "High";
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethods{
	ImportantMethod [] value();
}
class Usage{
	@ImportantMethod(level="low")
	@ImportantMethod
	public void use1() {
		System.out.println("this is use method");
	}
	
	
}
public class ImportantMethodAnnotation {
public static void main(String args[]) {
	try {
		Method method=Usage.class.getMethod("use1");
		ImportantMethod []importantMethod=method.getAnnotationsByType(ImportantMethod.class);
		for(ImportantMethod i:importantMethod) {
			System.out.println(i.level());
		}
	}catch(Exception e) {
		System.out.println(e);
	}
	
}
}
