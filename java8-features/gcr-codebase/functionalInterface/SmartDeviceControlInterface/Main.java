package InterfacesFunctional.SmartDeviceControlInterface;



 public class Main {
	
public static void main(String args[]) {
	Lights lights=new Lights();
	lights.turnOff();
	Ac ac=new Ac();
	ac.turnOn();
	Tv tv=new Tv();
	tv .turnOff();
	
}
}