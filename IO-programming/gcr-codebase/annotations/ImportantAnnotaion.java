package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
 @interface TaskInfo{
	String priority();
	String assignedTo();
}
class TaskManager{
	@TaskInfo(priority="high",assignedTo="me")

	public static void task() {
		System.out.println("Task completed");
	}
}
public class ImportantAnnotaion {
	
public static void main(String args[]) {
	TaskManager taskManager=new TaskManager();
	try {
		Method method=TaskManager.class.getMethod("task");
		TaskInfo taskInfo=method.getAnnotation(TaskInfo.class);
		System.out.println(taskInfo.priority());
		System.out.println(taskInfo.assignedTo());

		
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
