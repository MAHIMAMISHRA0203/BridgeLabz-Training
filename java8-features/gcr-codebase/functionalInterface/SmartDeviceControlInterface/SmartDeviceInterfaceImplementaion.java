package InterfacesFunctional.SmartDeviceControlInterface;


class  SmartDeviceInterfaceImplementaion implements SmartDeviceInterface{
	public void turnOff() {
		System.out.println("The light is turned off");
	}
	public void turnOn() {
		System.out.println("The light is turned On");
	}
	
}