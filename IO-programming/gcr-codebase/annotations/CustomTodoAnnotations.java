package annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo{
	String task();
	String assignedTo();
	String priority() default "Medium";
}
class UseCase{
	@Todo(task="task1",assignedTo="User1",priority="low")
	
	public void pendingTask1() {
		System.out.println("hii1 ");
	}
	@Todo(task="task2",assignedTo="User2")

	public void pendingTask2() {
		System.out.println("hii1 ");
	}
}

public class CustomTodoAnnotations {

	public static void main(String args[]) {
		try {
		Method []method=UseCase.class.getDeclaredMethods();
		for(Method t:method) {
			if(t.isAnnotationPresent(Todo.class)) {
				Todo tasks=t.getAnnotation(Todo.class);
		 System.out.println("name:"+ tasks.task()+
				 "  Priority:"+tasks.priority()+"  Assigned To:"+tasks.assignedTo());}}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
