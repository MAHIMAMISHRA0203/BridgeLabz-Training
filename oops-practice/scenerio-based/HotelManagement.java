interface PricingStrategy{
    double calculatePrice(double basePrice);
    
}
class SeasonalPrice implements PricingStrategy{
    double calculatePrice(double basePrice){
        return basePrice+500;
    }
}
class RegularPrice implements PricingStrategy{
    return basePrice;
}
class Room{
     int roomNo;
    double price;
    String roomType;
    Room(int roomNo,double price,String roomType ){
        this.roomNo=roomNo;
        this.roomType=roomType;
        this.price=price;
    }
   
    double roomPrice(){
        return price;
    }
    String roomTypeDetail(){
        return "Basic room";
    }
    
}
class Guest{
    int NoOfGuest;
    int NoOfRooms;
    double totalBill(){
        return
    }
    
    
}
class Reservation {
    private Room room;
    private Guest guest;
    private int days;
    private PricingStrategy pricing;

    Reservation(Room room, Guest guest, int days, PricingStrategy pricing)
            throws RoomNotAvailableException {

        if (!room.isAvailable()) {
            throw new RoomNotAvailableException("Room not available");
        }

        this.room = room;
        this.guest = guest;
        this.days = days;
        this.pricing = pricing;
        room.bookRoom();
    }

    double generateBill() {
        return pricing.calculatePrice(room.basePrice, days);
    }

    void checkout() {
        room.releaseRoom();
        System.out.println("Checked out successfully");
    }
}

class DeluxeRoom extends Room{
    super( roomNo, price, roomType );
    double additionalPrice=1000;
    String roomTypeDetail(){
        return  "Deluxe room";
    }
    
    
}
class StandardRoom extends Room{
    super( roomNo, price, roomType );
    double additionalPrice=2000;
    String roomTypeDetail(){
        return  "Standard room";
    }
    
}

public class Main {
    public static void main(String[] args) {

        Room room = new DeluxeRoom(101);
        Guest guest = new Guest("Mahima Mishra");
        PricingStrategy pricing = new SeasonalPricing();

        try {
            Reservation reservation =
                new Reservation(room, guest, 3, pricing);

            System.out.println("Guest: " + guest.getName());
            System.out.println("Room Type: " + room.getRoomType());
            System.out.println("Total Bill: ₹" + reservation.generateBill());

            reservation.checkout();

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
