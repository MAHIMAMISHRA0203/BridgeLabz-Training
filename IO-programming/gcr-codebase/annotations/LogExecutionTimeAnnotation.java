package annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExectionTime{
	
}
class UseCase2{
	@LogExectionTime
	public void use1() {
		int sum=0;
		for(int i=0;i<100;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
	@LogExectionTime

	public void use2() {
		int sum=0;
		for(int i=0;i<1000;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
}
public class LogExecutionTimeAnnotation {
public static void main(String args[]) {
	UseCase2 useCase=new UseCase2();
	try {
		Method []method=UseCase2.class.getDeclaredMethods();
	 for(Method m:method) {
		if(m.isAnnotationPresent(LogExectionTime.class)) {
			long start=System.nanoTime();
			m.invoke(useCase);
			long end=System.nanoTime();
//			System.out.println((end-start));

		}

	 }
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
