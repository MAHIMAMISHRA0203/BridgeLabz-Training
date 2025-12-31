// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class TrackInventori{
   String itemCode;
   int itemPrice;
   String itemName;
    public void display(String itemCode,String itemName,int itemPrice){
        System.out.println("itemCode :"+itemCode);
         System.out.println("itemPrice:"+itemPrice);
         System.out.println("itemName:"+itemName);
         System.out.println("----------------------------------");

        
    }
}
class Trackinventory {
    public static void main(String[] args) {
        TrackInventori  inventory=new TrackInventori();
                inventory.display("01AA","Water Bottle",500);
                inventory.display("02AA","Rice",700);


        
        
    }
}