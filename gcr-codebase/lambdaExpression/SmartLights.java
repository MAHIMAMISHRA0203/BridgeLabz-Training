package lambdaExpression;

import sun.security.ec.ECDHKeyAgreement;

@FunctionalInterface
interface SmartLight{
	public void action();
}
 class Execute{
	void activate(SmartLight s) {
		s.action();
	}
}
public class SmartLights {
public static void main(String args[]) {
	Execute execute=new Execute();
	execute.activate(()->{
		System.out.println("Light on full");
	});
	execute.activate(()->{
		System.out.println("Light on dim");
	});
	execute.activate(()->{
		System.out.println("Light off/on");
	});
	
	
}
}
