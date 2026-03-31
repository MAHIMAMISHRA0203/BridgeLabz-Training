class Car{
    
     String name;
     String model;
     int rentalDays;
     int rent=1500;
     Car( String name,String model,int rentalDays){
         this.name=name;
         this.model=model;
         this.rentalDays=rentalDays;
     }
     
         
     int rentTotal(){
         return rent*rentalDays;
         
         

     }
     
    
}
public class Cars
{
	public static void main(String[] args) {
	    Car car=new Car("Mahima","fortuner",3000);
	   System.out.println(car.rentTotal());
	    


	    

	    
	    
	}
}