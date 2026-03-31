package InterfacesFunctional.TemperatureAlertSystem;

import java.util.function.Predicate;

public class Main {
public static void main(String args[]) {
	double thresholdTemp=25;
	Predicate<Double>isHot=temp->temp>thresholdTemp;
	if(isHot.test(30.0)) {
		System.out.println("Alert:Temperature crossed threhold");
	}
	else {
		System.out.println("Relax the tempature id okay");
	}
}
}
