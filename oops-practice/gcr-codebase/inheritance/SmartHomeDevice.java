// Superclass
class Device {
    String deviceId;
    String status;
    

    // Constructor
    public Device(String deviceId, String status ) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display Book information
    public void displayStatus() {
        System.out.println("The id of the devie is : " + deviceId );
        System.out.println("The status of the device is : " + status);
    }
}

// Subclass Car
class Thermostat extends Device {
int temperatureSetting;
    public Thermostat(int temperatureSetting, String  deviceId,String status) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        System.out.println("The temperature is :"+temperatureSetting);
        super.displayStatus();
        
    }
}





// Main class
public class SmartHomeDevice {
    public static void main(String[] args) {


      Device d=new Thermostat(27,"h4kdm$7nd","The curtains are closed");
   d.displayStatus(); }
}
