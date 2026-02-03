package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.rmi.server.LogStream;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
 @interface BugReport{
String describe();

}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
 @interface BugReports{
BugReport[] value();

}
class UsingBugReport{
	@BugReport(describe="use1")
	@BugReport(describe="use2")
public static void show() {
	System.out.println("hy");
}
}
public class RepeatableBugReport {

	public static void main(String args[]) {
		;try {
			Method method=UsingBugReport.class.getMethod("show");
			BugReport bugReport[]=method.getAnnotationsByType(BugReport.class);
			for(BugReport b:bugReport) {
				System.out.println(b);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
