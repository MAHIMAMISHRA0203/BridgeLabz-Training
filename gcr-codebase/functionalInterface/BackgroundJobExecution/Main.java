package InterfacesFunctional.BackgroundJobExecution;

import java.awt.Taskbar;

public class Main {
public static void main(String args[]) {
	Runnable task=()->{
		System.out.println("Task is running asynchronously");
	};
Thread thread=new Thread(task);
thread.run();
}
}
