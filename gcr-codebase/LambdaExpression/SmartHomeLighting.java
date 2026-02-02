package lambdaExpression;


@FunctionalInterface
interface SmartHome{
	void executeAction();
	
}
 class Light{
	public void  smartLights(SmartHome action) {
		action.executeAction();
	}
}
public class SmartHomeLighting {
public static void main(String args[]) {
	Light light=new Light();
    SmartHome motionHome=()->{
    	System.out.println("DUe to motion light is on");
    };
    
    SmartHome timeOfDay=()->{
    	System.out.println("Lights are dim as this is night");
    };
    SmartHome voiceCommands=()->{
    	System.out.println("DUe to voice commands light is on");
    };
    light.smartLights(motionHome);
    light.smartLights(timeOfDay);
    light.smartLights(voiceCommands);


    
}
}
