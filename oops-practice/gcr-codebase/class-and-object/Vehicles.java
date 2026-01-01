class Vehicle{
    	    String ownerName;
    	    String vehicleType;
    	   
    	    static int registrationFee=1000;
    	    Vehicle( String ownerName,String vehicleType){
    	         this.ownerName=ownerName;
    	          this.vehicleType=vehicleType;
    	    }
    	    void displayVehicleDetails(){
    	       
    	        System.out.println("Vehicle details:");
    	        System.out.println(vehicleType);
    	        System.out.println(ownerName);


    	    }
    	    void updateRegistrationFee (int registrationFee){
    	        
    	        this.registrationFee=registrationFee;
    	    }

    
}
public class Vehicles
{
	public static void main(String[] args) {
	    Vehicle c=new Vehicle("Rajan","SUV");
	    c.displayVehicleDetails();
	    	    System.out.println(c.registrationFee);

	    c.updateRegistrationFee(1500);
	    System.out.println(c.registrationFee);
	   
	    
	}
}