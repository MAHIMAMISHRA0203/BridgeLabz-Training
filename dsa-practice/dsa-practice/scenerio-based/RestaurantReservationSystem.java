package scenerioBased;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.security.PublicKey;
import java.util.ArrayList;

class Table{
	int tableNo;
	int capacity;
	 Table(int tableNo,int capacity){
		 this.capacity=capacity;
		 this.tableNo=tableNo;
	 }
	 
}
 class TableAlreadyReservedException extends Exception{
	 public TableAlreadyReservedException(String message) {
		 super(message);
	 }
 }
 class Reservation{
	String timeSlot;
	int tableNumber;
	String customerName;
	public Reservation(String customerName,int tableNumber,String timeSlot) {
		this.customerName=customerName;
		this.tableNumber=tableNumber;
		this.timeSlot=timeSlot;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	public  String showReservation() {
		return "Table booked ";
		
	}

}
 class Services{
	 int tableNumber;
	 HashMap<Integer,Table> tables=new HashMap<>();
	 List <Reservation>reservationsList=new ArrayList<>();
	 public void addTable(Table table) {
		 tables.put(table.tableNo,table);
		 System.out.println("Table added Successfully");
	 }
	 public void reserveTable( String customerName, int tableNumber,String timeSlot) throws TableAlreadyReservedException{
		 for(Reservation res:reservationsList) {
			 if(res.getTableNumber()==tableNumber && res.getTimeSlot().equals(timeSlot)) {
				 throw new  TableAlreadyReservedException("Table is already booked for this slot");
			 }
		 }
		 reservationsList.add(new Reservation(customerName,tableNumber,timeSlot));
		 System.out.println("Table reserved sucessfully for "+timeSlot+" by "+customerName);
	 }
	 public void cancelTable( String customerName, int tableNumber,String timeSlot)  {
		 Iterator <Reservation>iterator= reservationsList.iterator(); 
			 while(iterator.hasNext()) {
				 Reservation res=iterator.next(); 
				 if(res.getTableNumber()==tableNumber && res.getTimeSlot()==timeSlot) {
					 iterator.remove();
					 System.out.println("Table removed Successfully");
					 return;
				 }
				 
		 }
			
	 }
	
	 
 }
public class RestaurantReservationSystem {
	
	public static void main(String args[])  {
		Services services=new Services();
		services.addTable(new Table(1,2));
		services.addTable(new Table(2,4));
		services.addTable(new Table(3,6));

		try {
			services.reserveTable("Mahima ", 1, "7-8PM");
			services.reserveTable("Mahima ", 2, "1-2PM");
			services.cancelTable("Mahima ", 2, "1-2PM");
			services.reserveTable("Mahima ", 2, "1-2PM");


		} catch (TableAlreadyReservedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
